package com.tuibi.dianwan.global;

import com.tuibi.dianwan.anno.MustDecrypt;
import com.tuibi.dianwan.config.CustomProperties;
import com.tuibi.dianwan.util.ParamterEncoderByAesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

@ControllerAdvice
public class DecoderRequestBodyAdvice implements RequestBodyAdvice {

    @Autowired
    private CustomProperties customProperties;

    @Override
    public boolean supports(MethodParameter methodParameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return (customProperties.isEnableParameterEncryption() && methodParameter.hasParameterAnnotation(RequestBody.class))
                ||
               (methodParameter.hasMethodAnnotation(MustDecrypt.class));
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
        byte[] body = new byte[inputMessage.getBody().available()];
        inputMessage.getBody().read(body, 0, body.length);
        String encodeBody = new String(body, StandardCharsets.UTF_8);
        String decryptBody = ParamterEncoderByAesUtil.decrypt(encodeBody);
        return new ModifiedHttpInputMessage(inputMessage, decryptBody.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return body;
    }

    @Override
    public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return body;
    }

    private static class ModifiedHttpInputMessage implements HttpInputMessage {
        private final HttpInputMessage originalInputMessage;
        private final byte[] modifiedBody;

        public ModifiedHttpInputMessage(HttpInputMessage originalInputMessage, byte[] modifiedBody) {
            this.originalInputMessage = originalInputMessage;
            this.modifiedBody = modifiedBody;
        }

        @Override
        public InputStream getBody() throws IOException {
            return new ByteArrayInputStream(modifiedBody);
        }

        @Override
        public HttpHeaders getHeaders() {
            return originalInputMessage.getHeaders();
        }
    }
}
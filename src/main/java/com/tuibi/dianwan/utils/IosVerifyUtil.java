package com.tuibi.dianwan.util;


import com.tuibi.dianwan.enums.EnvEnum;
import com.tuibi.dianwan.global.ConstantGlobal;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import org.springframework.util.Base64Utils;

import javax.net.ssl.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;

/**
 * 苹果工具类
 */
public class IosVerifyUtil {
   private static class TrustAnyTrustManager implements X509TrustManager {

       public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
       }

       public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
       }

       public X509Certificate[] getAcceptedIssuers() {
           return new X509Certificate[] {};
       }
   }

   private static class TrustAnyHostnameVerifier implements HostnameVerifier {
       public boolean verify(String hostname, SSLSession session) {
           return true;
       }
   }
    public static String buyAppVerify(String receipt) {
        
        String url = EnvEnum.PROD.isTrue() ? ConstantGlobal.IOSPAY_PROD : ConstantGlobal.IOSPAY_SANDBOX;
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[] { new TrustAnyTrustManager() }, new java.security.SecureRandom());
            URL console = new URL(url);
            HttpsURLConnection conn = (HttpsURLConnection) console.openConnection();
            conn.setSSLSocketFactory(sc.getSocketFactory());
            conn.setHostnameVerifier(new TrustAnyHostnameVerifier());
            conn.setRequestMethod("POST");
            conn.setRequestProperty("content-type", "text/json");
            conn.setRequestProperty("Proxy-Connection", "Keep-Alive");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            BufferedOutputStream hurlBufOus = new BufferedOutputStream(conn.getOutputStream());
            String str = String.format(Locale.CHINA, "{\"receipt-data\":\"" + receipt + "\"}");
            hurlBufOus.write(str.getBytes());
            hurlBufOus.flush();
            InputStream is = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            throw new BizException(ResultCode.FAIL, "支付参数校验失败!", e);
        }
    }

   /**
    * 苹果服务器验证
    *
    * @param receipt
    *            账单
    * @url 要验证的地址
    * @return null 或返回结果 沙盒 https:
    *
    */
   public static String buyAppVerify(String receipt,int type) {
       
       String url = EnvEnum.PROD.isTrue() ? ConstantGlobal.IOSPAY_PROD : ConstantGlobal.IOSPAY_SANDBOX;
       try {
           SSLContext sc = SSLContext.getInstance("SSL");
           sc.init(null, new TrustManager[] { new TrustAnyTrustManager() }, new java.security.SecureRandom());
           URL console = new URL(url);
           HttpsURLConnection conn = (HttpsURLConnection) console.openConnection();
           conn.setSSLSocketFactory(sc.getSocketFactory());
           conn.setHostnameVerifier(new TrustAnyHostnameVerifier());
           conn.setRequestMethod("POST");
           conn.setRequestProperty("content-type", "text/json");
           conn.setRequestProperty("Proxy-Connection", "Keep-Alive");
           conn.setDoInput(true);
           conn.setDoOutput(true);
           BufferedOutputStream hurlBufOus = new BufferedOutputStream(conn.getOutputStream());

           String str = String.format(Locale.CHINA, "{\"receipt-data\":\"" + receipt + "\"}");
           hurlBufOus.write(str.getBytes());
           hurlBufOus.flush();

           InputStream is = conn.getInputStream();
           BufferedReader reader = new BufferedReader(new InputStreamReader(is));
           String line = null;
           StringBuffer sb = new StringBuffer();
           while ((line = reader.readLine()) != null) {
               sb.append(line);
           }

           return sb.toString();
       } catch (Exception ex) {
           System.out.println("苹果服务器异常");
           ex.printStackTrace();
       }
       return null;
   }

}

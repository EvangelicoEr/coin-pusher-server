package com.tuibi.dianwan.config;

import com.tuibi.dianwan.filter.LogFilter;
import com.tuibi.common.base.filter.CheckPageDefineInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${spring.interceptor.check-page:false}")
    private boolean checkPage;

    @Value("${spring.profiles.active:prod}")
    private String env;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        CheckPageDefineInterceptor.add2InterceptorRegistry(registry, checkPage, env);
    }
}

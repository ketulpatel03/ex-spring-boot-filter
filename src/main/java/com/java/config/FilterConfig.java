package com.java.config;

import com.java.filter.LoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<LoggingFilter> loggingFilterBean() {

        FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new LoggingFilter());
        registrationBean.addUrlPatterns("/logging/*");
        Collection<String> urlPatterns = registrationBean.getUrlPatterns();
        System.out.println(urlPatterns);
        registrationBean.setOrder(1);
        return registrationBean;
    }

}

package com.java.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
//@Order(1)
public class LoggingFilter implements Filter {

    private final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        LOGGER.info("Logging Filter Request : " + req.getRequestURI() + " - " + req.getHeader("api-key"));

        chain.doFilter(request, response);

        LOGGER.info("Logging Filter Response : " + res.getContentType());

    }
}

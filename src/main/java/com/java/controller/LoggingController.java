package com.java.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
public class LoggingController {

    private final Logger LOGGER = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public ResponseEntity<Object> loggingMessage() {
        LOGGER.info("Logging message .....");
        return ResponseEntity.status(HttpStatus.OK).body("logging controller .....");
    }

}

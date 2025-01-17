package com.java.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/another")
public class AnotherController {

    private final Logger LOGGER = LoggerFactory.getLogger(AnotherController.class);

    @GetMapping
    public ResponseEntity<Object> anotherMessage() {
        LOGGER.info("Another message .....");
        return ResponseEntity.status(HttpStatus.OK).body("another controller .....");
    }

}

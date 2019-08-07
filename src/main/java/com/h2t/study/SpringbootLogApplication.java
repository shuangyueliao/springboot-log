package com.h2t.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLogApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringbootLogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLogApplication.class, args);
        logger.trace("trace level log input");
        logger.debug("debug level log input");
        logger.info("info level log input");
        logger.warn("warn level log input");
        logger.error("error level log input");
    }

}
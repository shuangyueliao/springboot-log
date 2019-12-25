package com.h2t.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/09 9:31
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("/api/test")
    public Object hello() {
        log.trace("【TestController.class】trace level log input");
        log.debug("【TestController.class】debug level log input");
        log.info("【TestController.class】info level log input");
        log.warn("【TestController.class】warn level log input");
        log.error("【TestController.class】error level log input");
        return "hello world";
    }
}

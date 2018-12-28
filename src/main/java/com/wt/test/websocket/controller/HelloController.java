package com.wt.test.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 埼玉
 * @Date: 2018/12/25 18:56
 * @Description:
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}

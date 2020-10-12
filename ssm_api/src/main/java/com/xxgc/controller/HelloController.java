package com.xxgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:chen
 * Date:2020-10-10-13:02
 * Description:<描述>
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/hello1")
    public String hello(Model model) {
        return "index";
    }

}

package com.xxgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:chen
 * Date:2020-10-12-20:52
 * Description:<描述>
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/{page}")
    public String page(@PathVariable("page") String page) {
        return page;
    }
}

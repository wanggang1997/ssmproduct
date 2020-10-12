package com.xxgc.controller;

import com.xxgc.pojo.Product;
import com.xxgc.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author:chen
 * Date:2020-10-10-16:25
 * Description:<描述>
 */
@Controller
@RequestMapping("product")
public class ProductController {

    final static Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/findall")
    public String findall(Model model) {
        List<Product> findall = productService.findall();
        logger.info("啦啦");
        System.out.print(findall);
        model.addAttribute("findall", findall);
        return "product";
    }
}

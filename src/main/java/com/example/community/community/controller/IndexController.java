package com.example.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yoav
 * @Data: 2020/1/12 13:41
 * @Version 1.0
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){

        return "index";
    }
}

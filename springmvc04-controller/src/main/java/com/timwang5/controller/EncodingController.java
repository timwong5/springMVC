package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {


    @PostMapping("/e/t1")
    public String test1(String name, Model model){

        //为了避免中文乱码问题 添加过滤器
        model.addAttribute("msg",name);
        return "encodingTest";
    }
}

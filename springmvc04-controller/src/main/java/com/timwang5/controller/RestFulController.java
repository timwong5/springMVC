package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    //原来  http://localhost:8080/add?a=1&b=2
    //现在  http://localhost:8080/add/a/b


    @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model) {

        String result = a + b;
        model.addAttribute("msg", result);
        return "test";
    }
}

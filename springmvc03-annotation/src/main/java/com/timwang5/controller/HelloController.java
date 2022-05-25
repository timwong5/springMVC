package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller标识的类，该类代表控制器类(控制层/表现层)
//此处@RequestMapping 代表将 @RequestMapping 注解在 HelloController 类上，
// 这时类的注解是相对于 Web 根目录，而方法上的是相对于类上的路径 即多层拼接 http://localhost:8080/hello/h1
@Controller
@RequestMapping("/hello")
public class HelloController {
    //在Spring MVC 中使用 @RequestMapping 来映射请求，
    // 也就是通过它来指定控制器可以处理哪些URL请求，相当于Servlet中在web.xml中配置
    //<servlet> + mapping
    @RequestMapping("/h1")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello SpringMVC annotation");

        return "hello";

    }

}

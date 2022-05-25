package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 代表这个类被Spring托管
// 被这个注解的类中所有方法如果返回值是String 并且有具体页面可以跳转 就会被视图解析器所解析
@Controller

public class ControllerTest2 {
    @RequestMapping("/admin/test")
    public String index(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg","ControllerTest2");
        return "/admin/test2";
    }
}

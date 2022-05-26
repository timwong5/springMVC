package com.timwang5.controller;

import com.timwang5.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 接受前端用户传递的参数 判断参数的名字 假设名字直接在方法上 可以直接使用
 * 假设传递的是一个对象User 匹配User对象中的字段名 如果名字一致则ok 否则匹配失败 就是null
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    //      http://localhost:8080/user/t1?username=tim
    public String test1(@RequestParam("username") String name, Model model){
        //1.接受前端参数
        System.out.println("接受前端参数"+name);
        //2.返回的结果传输给前端
        model.addAttribute("msg",name);
        return "test";
    }


    //前端接受一个对象: id name age
    @GetMapping("/t2")

    //      http://localhost:8080/user/t2?id=1&name=tim&age=25
    public String test2(User user,Model model){
        System.out.println("接受前端参数"+user);
        model.addAttribute("msg",user);

        return "test";
    }


    /**
     * Model 只有寥寥几个方法只适合用于储存数据，简化了新手对于Model对象的操作和理解；
     * ModelMap 继承了 LinkedMap ，除了实现了自身的一些方法，同样的继承 LinkedMap 的方法和特性；
     * ModelAndView 可以在储存数据的同时，可以进行设置返回的逻辑视图，进行控制展示层的跳转
     */
    @RequestMapping("/t3")
    //此处ModelMap还是初级使用方法
    public String test3(ModelMap modelMap){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        modelMap.addAttribute("msg","hello");
        return "test";
    }

}

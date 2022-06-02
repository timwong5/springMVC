package com.timwang5.controller;

import com.timwang5.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ajaxController {
    @RequestMapping("/test1")
    public String test(){
        return "hello";
    }


    @RequestMapping
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param == " + name);
        if ("wangfx".equals(name)){
            response.getWriter().println("true");
        }
        else {
            response.getWriter().println("false");
        }
    }


    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> users = new ArrayList<User>();
        // �������
        users.add(new User("kuangshen",1,"nan"));
        users.add(new User("xiaoming",2,"woman"));
        users.add(new User("zhangsan",3,"gril"));
        return users;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg="";
        if(name!=null){
            if("admin".equals(name)){
                msg="ok";
            }else{
                msg="�û����д�";
            }
        }
        if(pwd!=null){
            if("123456".equals(pwd)) {
                msg="ok";
            }else{
                msg="��������";
            }
        }
        return msg;
    }
}

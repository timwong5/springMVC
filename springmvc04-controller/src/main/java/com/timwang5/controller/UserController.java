package com.timwang5.controller;

import com.timwang5.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * ����ǰ���û����ݵĲ��� �жϲ��������� ��������ֱ���ڷ����� ����ֱ��ʹ��
 * ���贫�ݵ���һ������User ƥ��User�����е��ֶ��� �������һ����ok ����ƥ��ʧ�� ����null
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    //      http://localhost:8080/user/t1?username=tim
    public String test1(@RequestParam("username") String name, Model model){
        //1.����ǰ�˲���
        System.out.println("����ǰ�˲���"+name);
        //2.���صĽ�������ǰ��
        model.addAttribute("msg",name);
        return "test";
    }


    //ǰ�˽���һ������: id name age
    @GetMapping("/t2")

    //      http://localhost:8080/user/t2?id=1&name=tim&age=25
    public String test2(User user,Model model){
        System.out.println("����ǰ�˲���"+user);
        model.addAttribute("msg",user);

        return "test";
    }


    /**
     * Model ֻ�����ȼ�������ֻ�ʺ����ڴ������ݣ��������ֶ���Model����Ĳ�������⣻
     * ModelMap �̳��� LinkedMap ������ʵ���������һЩ������ͬ���ļ̳� LinkedMap �ķ��������ԣ�
     * ModelAndView �����ڴ������ݵ�ͬʱ�����Խ������÷��ص��߼���ͼ�����п���չʾ�����ת
     */
    @RequestMapping("/t3")
    //�˴�ModelMap���ǳ���ʹ�÷���
    public String test3(ModelMap modelMap){
        //��װҪ��ʾ����ͼ�е�����
        //�൱��req.setAttribute("name",name);
        modelMap.addAttribute("msg","hello");
        return "test";
    }

}

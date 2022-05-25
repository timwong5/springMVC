package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller��ʶ���࣬��������������(���Ʋ�/���ֲ�)
//�˴�@RequestMapping ���� @RequestMapping ע���� HelloController ���ϣ�
// ��ʱ���ע��������� Web ��Ŀ¼���������ϵ�����������ϵ�·�� �����ƴ�� http://localhost:8080/hello/h1
@Controller
@RequestMapping("/hello")
public class HelloController {
    //��Spring MVC ��ʹ�� @RequestMapping ��ӳ������
    // Ҳ����ͨ������ָ�����������Դ�����ЩURL�����൱��Servlet����web.xml������
    //<servlet> + mapping
    @RequestMapping("/h1")
    public String hello(Model model){
        //��װ����
        model.addAttribute("msg","Hello SpringMVC annotation");

        return "hello";

    }

}

package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller ��������౻Spring�й�
// �����ע����������з����������ֵ��String �����о���ҳ�������ת �ͻᱻ��ͼ������������
@Controller

public class ControllerTest2 {
    @RequestMapping("/admin/test")
    public String index(Model model){
        //Spring MVC���Զ�ʵ����һ��Model������������ͼ�д�ֵ
        model.addAttribute("msg","ControllerTest2");
        return "/admin/test2";
    }
}

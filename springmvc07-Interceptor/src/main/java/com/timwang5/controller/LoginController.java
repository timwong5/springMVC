package com.timwang5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    //��½�ύ
    @PostMapping("/login")
    public String login(HttpSession session, String username, String pwd) {
        // ��session��¼�û������Ϣ
        System.out.println("����ǰ��===" + username);

        session.setAttribute("username", username);

        return "redirect:main";
    }

    //��ת����½ҳ��
    @RequestMapping("/jumpLogin")
    public String jumpLogin() {
        return "login";
    }

    //��ת���ɹ�ҳ��
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    //�˳���½
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        // session ����
        session.invalidate();
        return "login";
    }
}

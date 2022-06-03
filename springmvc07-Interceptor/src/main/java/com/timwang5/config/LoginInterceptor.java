package com.timwang5.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // ����ǵ�½ҳ�������
        System.out.println("uri: " + request.getRequestURI());
        if (request.getRequestURI().contains("login") || request.getRequestURI().contains("jumpLogin")) {
            return true;
        }

        HttpSession session = request.getSession();


        // ����û��ѵ�½Ҳ����
        if (session.getAttribute("username") != null && !session.getAttribute("username").equals("")) {
            return true;
        }

        // �û�û�е�½��ת����½ҳ��
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}

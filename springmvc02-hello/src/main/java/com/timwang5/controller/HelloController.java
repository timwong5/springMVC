package com.timwang5.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();


        //ҵ�������ת
        String result = "HelloWorld";
        mv.addObject("msg",result);

        //��ͼ��ת
        mv.setViewName("test");

        return mv;
    }
}

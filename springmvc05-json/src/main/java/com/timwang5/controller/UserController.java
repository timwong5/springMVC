package com.timwang5.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.timwang5.pojo.User;
import com.timwang5.utils.JsonUtils;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//�������еķ�����ֻ�᷵�� json �ַ����ˣ�������ÿһ�������@ResponseBody
@RestController
public class UserController {

    @RequestMapping(value = "/j1")
    //��������Ͳ�����ͼ������ ��ȥ��ҳ��
    public String json1() throws JsonProcessingException {

        //����һ��jackson�Ķ���ӳ������������������
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("����", 3, "male");

        String str = mapper.writeValueAsString(user);
        return str;
    }


    @RequestMapping(value = "/j2")
    //��������Ͳ�����ͼ������ ��ȥ��ҳ��
    public String json2() throws JsonProcessingException {

        //����һ��jackson�Ķ���ӳ������������������
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<>();

        User user1 = new User("����1", 3, "male");
        User user2 = new User("����2", 3, "male");
        User user3 = new User("����3", 3, "male");
        User user4 = new User("����4", 3, "male");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping(value = "/j3")
    //��������Ͳ�����ͼ������ ��ȥ��ҳ��
    public String json3() throws JsonProcessingException {

        Date date = new Date();
        return JsonUtils.getJson(date);
    }



}

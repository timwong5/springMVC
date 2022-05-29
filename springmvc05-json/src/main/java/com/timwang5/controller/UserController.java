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


//里面所有的方法都只会返回 json 字符串了，不用再每一个都添加@ResponseBody
@RestController
public class UserController {

    @RequestMapping(value = "/j1")
    //加了这个就不走视图解析器 不去找页面
    public String json1() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("二狗", 3, "male");

        String str = mapper.writeValueAsString(user);
        return str;
    }


    @RequestMapping(value = "/j2")
    //加了这个就不走视图解析器 不去找页面
    public String json2() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<>();

        User user1 = new User("二狗1", 3, "male");
        User user2 = new User("二狗2", 3, "male");
        User user3 = new User("二狗3", 3, "male");
        User user4 = new User("二狗4", 3, "male");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping(value = "/j3")
    //加了这个就不走视图解析器 不去找页面
    public String json3() throws JsonProcessingException {

        Date date = new Date();
        return JsonUtils.getJson(date);
    }



}

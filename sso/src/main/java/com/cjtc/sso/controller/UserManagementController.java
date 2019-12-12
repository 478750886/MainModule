package com.cjtc.sso.controller;

import com.cjtc.sso.config.WeChatAccountConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserManagementController {

    @Autowired
    WeChatAccountConfig chatAccountConfig;

    @GetMapping("/listUser")
    public String listUser(){
        List<Map<String, Object>> users = new ArrayList<>();
        for(int i=1; i< 5; i++){
            Map<String, Object> user = new HashMap<>();
            user.put("id", i);
            user.put("name", "小明" + i);
            users.add(user);
        }
        return "服务器端口号：   " + chatAccountConfig.getServerPort() + "   |   用户信息：   " + users.toString();
    }


}

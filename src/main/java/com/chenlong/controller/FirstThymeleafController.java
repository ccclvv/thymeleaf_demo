package com.chenlong.controller;

import com.chenlong.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FirstThymeleafController {

    //返回一个字符串
    @GetMapping("/first")
    public String first(Model model){
        model.addAttribute("msg", "这是一个Thymeleaf的模板");
        return "index";
    }

    //对象和map
    @GetMapping("/showUser")
    public String showUser(Model model){
        //存储对象
        User user = new User(1,"童昊",22);
        model.addAttribute("user", user);
        //存储map
        Map map = new HashMap();
        map.put("id", 2);
        map.put("name", "赵硕");
        map.put("age1", 23);
        map.put("address", "北京朝阳");
        model.addAttribute("map", map);
        //图片路径==> static public resources
        model.addAttribute("img","/img/1.png");
        return "show";
    }


}

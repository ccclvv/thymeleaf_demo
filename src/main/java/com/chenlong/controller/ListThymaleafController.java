package com.chenlong.controller;

import com.chenlong.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListThymaleafController {

    //list
    @GetMapping("/showList")
    public String showList(Model model){
        //存储list
        List list = new ArrayList();
        list.add(new User(201001, "童昊", 22));
        list.add(new User(201002, "赵硕", 23));
        list.add(new User(201003, "金鹏", 24));
        list.add(new User(201004, "孙旗", 25));

        model.addAttribute("list",list);
        return "list";
    }

    //字符串拼接
    @GetMapping("/showString")
    public String showString(Model model){
        //存储字符串
        model.addAttribute("string","智商250");
        return "string";
    }

    //if语句判断
    @GetMapping("/judge")
    public String judge(Model model){
        //判断字符串相等
        model.addAttribute("flag","fail");
        //使用布尔值判断
        model.addAttribute("isRight", true);
        //switch判断
        model.addAttribute("num", 2);

        return "judge";
    }

    //显示静态资源
    @GetMapping("/demo/showStatic")
    public String showStatic(Model model){

        return "show";
    }

    //引入页面
    @GetMapping("/useFrag")
    public String useFrag(Model model){

        return "showFrag";
    }

}

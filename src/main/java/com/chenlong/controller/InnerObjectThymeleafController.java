package com.chenlong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class InnerObjectThymeleafController {

    @GetMapping("/innerObj")
    public String innerObj(Model model){
        //日期 引用页面内置对象格式化
        Date date = new Date();
        model.addAttribute("date", date);

        //数值
        double num = 123456.78901;
        model.addAttribute("num",num);

        //大文本
        String str = "注：若需论文章节三级以下标题，则不再依上例编号，而是采用1.、2.、3.等编号；第四级可采用(1)、(2)、(3)等编号；第五级可采用①、②、③等编号。仅把（章节标题、章节一级标题、章节二级标题）列入目录。】\n" +
                "【以下为论文表的格式范例，表的行、列多少可以根据需要在菜单中的“表格”中选择“插入”或“删除”来操作。表的序号按“章号-表号”编排，如第二章的第一个表，则其序号为表2-1，表标题在表上方。";
        model.addAttribute("str", str);

        return "innerObj";


    }

}

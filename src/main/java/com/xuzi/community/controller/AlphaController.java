package com.xuzi.community.controller;

import com.xuzi.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return alphaService.find();
    }

    @RequestMapping(path = "/student", method = RequestMethod.GET)
    @ResponseBody
    public String getStudent(String name, String age){
        System.out.println(name+" : "+age);
        return "aaaa";
    }

    @RequestMapping(path = "/studentpost", method = RequestMethod.POST)
    @ResponseBody
    public String getStudentpost(String name, String age){
        System.out.println(name+" : "+age);
        return "aaaa";
    }

    @RequestMapping(path = "/school")
    public String showSchool(Model model){
        model.addAttribute("name","浙江理工大学");
        model.addAttribute("age","120");
        return "demo/view";
    }

    @RequestMapping(path = "/students")
    @ResponseBody
    public List<Map<String,String>> getStudents(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("name","xuzixiang");
        map.put("age","20");
        list.add(map);
        map.put("name","weixuantong");
        map.put("age","20");
        list.add(map);
        return  list;
    }

}

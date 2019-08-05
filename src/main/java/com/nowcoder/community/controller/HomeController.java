package com.nowcoder.community.controller;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.Page;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.DiscussPostService;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscussPostService discussPostService;

    /**
     * 讨论区首页
     * @param model
     * @param page 分页参数
     * @return 社区首页
     */
    @RequestMapping(path = "/index")
    public String index(Model model, Page page){
        page.setRows(discussPostService.selectDiscussPostRows(0));
        page.setPath("/index");
        List<Map<String,Object>> list  = new ArrayList<>();
        List<DiscussPost> discussPostList = discussPostService.findDiscussPost(0, page.getOffset(), page.getLimit());

        for(DiscussPost discussPost : discussPostList){
            Map<String,Object> map = new HashMap<>();
            User user = userService.findById(discussPost.getUserId());
            map.put("post",discussPost);
            map.put("user",user);
            list.add(map);
        }
//aa
        model.addAttribute("list",list);
        return "/index";
    }

}

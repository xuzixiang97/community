package com.xuzi.community.controller;

import com.xuzi.community.entity.DiscussPost;
import com.xuzi.community.entity.Page;
import com.xuzi.community.entity.User;
import com.xuzi.community.service.DiscussPostService;
import com.xuzi.community.service.LikeService;
import com.xuzi.community.service.UserService;
import com.xuzi.community.util.CommunityConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController implements CommunityConstant{

    @Autowired
    private UserService userService;

    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private LikeService likeService;

    /**
     * 讨论区首页
     * @param model
     * @param page 分页参数
     * @return 社区首页
     */
    @RequestMapping(path = "/index")
    public String getIndexPage(Model model, Page page,
        @RequestParam(name = "orderMode", defaultValue = "0") int orderMode) {
            // 方法调用钱,SpringMVC会自动实例化Model和Page,并将Page注入Model.
            // 所以,在thymeleaf中可以直接访问Page对象中的数据.
            page.setRows(discussPostService.selectDiscussPostRows(0));
            page.setPath("/index?orderMode=" + orderMode);
        List<Map<String,Object>> list  = new ArrayList<>();
        List<DiscussPost> discussPostList = discussPostService.findDiscussPost(0, page.getOffset(), page.getLimit(),orderMode);

        for(DiscussPost discussPost : discussPostList){
            Map<String,Object> map = new HashMap<>();
            User user = userService.findById(discussPost.getUserId());
            map.put("post",discussPost);
            map.put("user",user);
            map.put("likeCount",likeService.findEntityLikeCount(ENTITY_TYPE_POST, discussPost.getId()));
            list.add(map);
        }
        model.addAttribute("list",list);
        return "/index";
    }

    /**
     * 跳转错误页面
     * @return
     */
    @RequestMapping(path = "/error", method = RequestMethod.GET)
    public String getErrorPage() {
        return "/error/500";
    }

}

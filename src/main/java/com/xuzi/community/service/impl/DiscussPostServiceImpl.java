package com.xuzi.community.service.impl;

import com.xuzi.community.dao.DiscussPostMapper;
import com.xuzi.community.entity.DiscussPost;
import com.xuzi.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Override
    public List<DiscussPost> findDiscussPost(int userId, int offset, int limit) {
        return discussPostMapper.findDiscussPost(userId,offset,limit);
    }

    @Override
    public int selectDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}

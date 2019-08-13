package com.xuzi.community.service;

import com.xuzi.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostService {
    //查询讨论贴
    List<DiscussPost> findDiscussPost(int userId, int offset, int limit);
    //查询帖子数量（用于分页）
    int selectDiscussPostRows(@Param("userId")int userId);
    //发帖
    int addDiscussPost(DiscussPost post);
}

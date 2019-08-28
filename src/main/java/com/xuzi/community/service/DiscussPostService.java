package com.xuzi.community.service;

import com.xuzi.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostService {
    //查询讨论贴
    List<DiscussPost> findDiscussPost(int userId, int offset, int limit, int orderMode);

    //查询帖子数量（用于分页）
    int selectDiscussPostRows(@Param("userId")int userId);
    //发帖

    int addDiscussPost(DiscussPost post);

    //查询帖子
    DiscussPost findDiscussPostById(int id);

    //修改帖子评论量
    void updateCommentCount(int id, int commentCpunt);

    //修改帖子类型
    int updateType(int id, int type);

    //修改帖子状态
    int updateStatus(int id, int status);

    //修改帖子分数
    void updateScore(int postId, double score);

}

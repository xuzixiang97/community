package com.xuzi.community.dao;

import com.xuzi.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //查询讨论贴
    List<DiscussPost> findDiscussPost(int userId, int offset, int limit);
    //查询帖子数量（用于分页）
    int selectDiscussPostRows(@Param("userId")int userId);
    //发帖
    int insertDiscussPost(DiscussPost discussPost);
    //根据id查询帖子
    DiscussPost selectDiscussPostById (int id);
    //修改回复数量
    void updateCommentCount(int id, int commentCount);
    //修改帖子类型
    int updateType(int id, int type);
    //修改帖子状态
    int updateStatus(int id, int status);
}

package com.xuzi.community.service;

import com.xuzi.community.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    //查询评论
    List<Comment> findCommentsByEntity(int entityType, int entityId, int offset, int limit);

    //查询评论数量
    int findCommentCount(int entityType, int entityId);

    //新增评论
    int addComment(Comment comment);

}

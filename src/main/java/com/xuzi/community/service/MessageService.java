package com.xuzi.community.service;


import com.xuzi.community.entity.Message;

import java.util.List;

public interface MessageService {

    // 查询当前用户的会话列表,针对每个会话只返回一条最新的私信.
    List<Message> findConversations(int userId, int offset, int limit);

    // 查询当前用户的会话数量.
    int findConversationCount(int userId);

    // 查询某个会话所包含的私信列表.
    List<Message> findLetters(String conversationId, int offset, int limit);

    // 查询某个会话所包含的私信数量.
    int findLetterCount(String conversationId);

    // 查询未读私信的数量
    int findLetterUnreadCount(int userId, String conversationId);

    // 新增私信
    int addMessage(Message message);

    // 读私信，修改阅读状态
    int readMessage(List<Integer> ids);
}
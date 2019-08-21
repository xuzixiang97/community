package com.xuzi.community.service;

public interface FollowService {

    //关注
    void follow(int userId, int entityType, int entityId);

    //取消关注
    void unfollow(int userId, int entityType, int entityId);

    // 查询关注的实体的数量
    long findFolloweeCount(int userId, int entityType);

    // 查询实体的粉丝的数量
    long findFollowerCount(int entityType, int entityId);

    // 查询当前用户是否已关注该实体
    boolean hasFollowed(int userId, int entityType, int entityId);
}

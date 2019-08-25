package com.xuzi.community.service;

import com.xuzi.community.entity.DiscussPost;
import org.springframework.data.domain.Page;

public interface ElasticsearchService {

    //保存帖子到es
    void saveDiscussPost(DiscussPost post);

    //删除es的帖子
    void deleteDiscussPost(int id);

    //搜索
    Page<DiscussPost> searchDiscussPost(String keyword, int current, int limit);

}

package com.xuzi.community.dao;

import com.xuzi.community.entity.LoginTicket;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginTicketMapper {

    //插入登录凭证
    int insertLoginTicket(LoginTicket loginTicket);

    //根据凭证搜索
    LoginTicket selectByTicket(String ticket);

    //修改凭证状态
    int updateStatus(String ticket, int status);
}

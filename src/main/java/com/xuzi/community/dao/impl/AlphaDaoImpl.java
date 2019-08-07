package com.xuzi.community.dao.impl;

import com.xuzi.community.dao.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoImpl implements AlphaDao{
    @Override
    public String find() {
        return "查到的结果";
    }
}

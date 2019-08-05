package com.nowcoder.community.service.impl;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlphaServiceImpl implements AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    @Override
    public String find() {
        return alphaDao.find();
    }
}

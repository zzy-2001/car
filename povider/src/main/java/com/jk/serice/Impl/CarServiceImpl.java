package com.jk.serice.Impl;

import com.jk.dao.CarDao;
import com.jk.serice.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements Carservice {

    @Autowired
    private CarDao dao;

}

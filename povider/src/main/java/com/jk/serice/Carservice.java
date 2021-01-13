package com.jk.serice;

import com.jk.pojo.CarBean;
import com.jk.pojo.TreeBean;

import java.util.HashMap;
import java.util.List;

public interface Carservice {
    List<TreeBean> findtree(int i);

    HashMap<String, Object> findCar(Integer page, Integer rows, CarBean bean);
}

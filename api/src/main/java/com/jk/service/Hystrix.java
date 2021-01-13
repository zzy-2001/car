package com.jk.service;

import com.jk.pojo.CarBean;
import com.jk.pojo.TreeBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class Hystrix implements CarService{
    @Override
    public List<TreeBean> findtree() {
        return null;
    }

    @Override
    public HashMap<String, Object> findCar(Integer page, Integer rows, CarBean bean) {
        return null;
    }

    @Override
    public List<CarBean> findType() {
        return null;
    }

    @Override
    public List<CarBean> findColor() {
        return null;
    }

    @Override
    public void addCar(CarBean bean) {

    }

    @Override
    public CarBean findById(Integer id) {
        return null;
    }

    @Override
    public void voipCar(Integer id, String field, Integer biz) {

    }
}

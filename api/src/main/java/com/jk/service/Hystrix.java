package com.jk.service;

import com.jk.pojo.CarBean;
import com.jk.pojo.SloBean;
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

    @Override
    public void addCol(CarBean bean) {

    }

    @Override
    public void delCol(Integer id) {

    }

    @Override
    public CarBean findByIdCol(Integer id) {
        return null;
    }

    @Override
    public void addTyp(CarBean bean) {

    }

    @Override
    public void delTyp(Integer id) {

    }

    @Override
    public CarBean findByIdTyp(Integer id) {
        return null;
    }

    @Override
    public HashMap<String, Object> findSlo(Integer page, Integer rows, SloBean bean) {
        return null;
    }

    @Override
    public void addSlo(SloBean bean) {

    }

    @Override
    public List<SloBean> findPla() {
        return null;
    }

    @Override
    public SloBean findByIdSlo(Integer id) {
        return null;
    }

    @Override
    public void delSlo(Integer[] arr) {

    }

    @Override
    public void upSta(Integer integer, Integer id) {

    }
}

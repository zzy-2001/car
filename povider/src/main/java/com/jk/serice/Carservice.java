package com.jk.serice;

import com.jk.pojo.CarBean;
import com.jk.pojo.SloBean;
import com.jk.pojo.TreeBean;

import java.util.HashMap;
import java.util.List;

public interface Carservice {
    List<TreeBean> findtree(int i);

    HashMap<String, Object> findCar(Integer page, Integer rows, CarBean bean);

    List<CarBean> findType();

    List<CarBean> findColor();

    void addCar(CarBean bean);

    CarBean findById(Integer id);

    void voipCar(Integer id, String field, Integer biz);

    void addCol(CarBean bean);

    void delCol(Integer id);

    CarBean findByIdCol(Integer id);

    void addTyp(CarBean bean);

    void delTyp(Integer id);

    CarBean findByIdTyp(Integer id);

    HashMap<String, Object> findSlo(Integer page, Integer rows, SloBean bean);

    void addSlo(SloBean bean);

    List<SloBean> findPla();

    SloBean findByIdSlo(Integer id);
}

package com.jk.serice;

import com.jk.pojo.*;

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

    void delSlo(Integer[] arr);

    void upSta(Integer integer, Integer status);

    void addPla(SloBean bean);

    SloBean findByIdPla(Integer id);

    void delPla(Integer id);

    void upSts(Integer id, Integer status);

    HashMap<String, Object> findNew(Integer page, Integer rows, NewsBean bean);

    void addNew(NewsBean bean);

    List<NewsBean> findNty();

    NewsBean findByIdNew(Integer id);

    void delNew(Integer id);

    void nupSta(Integer id, Integer status);

    void addNty(NewsBean bean);

    NewsBean findByIdNty(Integer id);

    void delNty(Integer id);

    HashMap<String, Object> findOrd(Integer page, Integer rows, OrdBean bean);

    void upOrd(String id, Integer status);

    List<UserBean> findRol();

    List<UserBean> findBra();

    void addBra(UserBean bean);

    UserBean findByIdBra(Integer id);
}

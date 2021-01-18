package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarDao {
    List<TreeBean> findnode(@Param("pid") int pid,@Param("userid") int userid);

    int carTotal(@Param("bean") CarBean bean);

    List<CarBean> carPage(@Param("start") int start, @Param("rows") Integer rows,@Param("bean") CarBean bean);

    List<CarBean> findType();

    List<CarBean> findColor();

    void addCar(CarBean bean);

    CarBean findById(Integer id);

    void upCar(CarBean bean);

    void hotCar(@Param("id")Integer id,@Param("biz") Integer biz);

    void firCar(@Param("id")Integer id,@Param("biz") Integer biz);

    void staCar(@Param("id")Integer id,@Param("biz") Integer biz);

    void delCar(Integer id);

    void addCol(CarBean bean);

    void upCol(CarBean bean);

    void delCol(Integer id);

    CarBean findByIdCol(Integer id);

    void addTyp(CarBean bean);

    void upTyp(CarBean bean);

    void delTyp(Integer id);

    CarBean findByIdTyp(Integer id);

    int sloTotal(@Param("bean")SloBean bean);

    List<CarBean> sloPage(@Param("start") int start, @Param("rows") Integer rows,@Param("bean") SloBean bean);

    void addSlo(SloBean bean);

    void upSlo(SloBean bean);

    List<SloBean> findPla();

    SloBean findByIdSlo(Integer id);

    void delSlo(int id);

    void upSta(Integer id, Integer status);

    void addPla(SloBean bean);

    void upPla(SloBean bean);

    SloBean findByIdPla(Integer id);

    void delPla(Integer id);

    void upSts(Integer id, Integer status);

    int newTotal(@Param("bean")NewsBean bean);

    List<CarBean> newPage(@Param("start") int start, @Param("rows") Integer rows,@Param("bean") NewsBean bean);

    void addNew(NewsBean bean);

    void upNew(NewsBean bean);

    List<NewsBean> findNty();

    NewsBean findByIdNew(Integer id);

    void delNew(Integer id);

    void nupSta(Integer id, Integer status);

    void addNty(NewsBean bean);

    void upNty(NewsBean bean);

    NewsBean findByIdNty(Integer id);

    void delNty(Integer id);

    List<OrdBean> addORd();
}

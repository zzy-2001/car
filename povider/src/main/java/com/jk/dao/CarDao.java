package com.jk.dao;

import com.jk.pojo.CarBean;
import com.jk.pojo.TreeBean;
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
}

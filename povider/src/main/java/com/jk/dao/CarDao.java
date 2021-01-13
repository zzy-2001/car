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
}

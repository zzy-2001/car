package com.jk.controller;

import com.jk.pojo.CarBean;
import com.jk.pojo.TreeBean;
import com.jk.serice.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("car")
public class CarController {

    @Autowired
    private Carservice service;

    /**
     * @Author: zzy
     * @Description: 树
     * @Date: 2021/1/12 23:06
     * @Return: java.util.List<com.jk.pojo.TreeBean>
     **/
    @RequestMapping("findtree")
    @ResponseBody
    public List<TreeBean> findtree() {
        //获取用户id
        //Subject subject = SecurityUtils.getSubject();
        ///UserBean bean = (UserBean) subject.getPrincipal();
        return service.findtree(1);
    }

    /*
     * @Author: zzy
     * @Description: 查询
     * @Date: 2021/1/13 11:16
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("findCar")
    @ResponseBody
    public HashMap<String,Object> findCar(Integer page, Integer rows,@RequestBody CarBean bean){
        return service.findCar(page,rows,bean);
    }
}

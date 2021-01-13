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

    /**
     * @Author: zzy
     * @Description:  车型类型查询
     * @Date: 2021/1/13 14:25
     * @Return: java.util.List<com.jk.pojo.CarBean>
     **/
    @RequestMapping("findType")
    @ResponseBody
    public List<CarBean> findType(){
        return service.findType();
    }

    /**
     * @Author: zzy
     * @Description:  车型颜色列表查询
     * @Date: 2021/1/13 14:25
     * @Return: java.util.List<com.jk.pojo.CarBean>
     **/
    @RequestMapping("findColor")
    @ResponseBody
    public List<CarBean> findColor(){
        return service.findColor();
    }

    /**
     * @Author: zzy
     * @Description: 新增车型
     * @Date: 2021/1/13 14:39
     * @Return: void
     **/
    @RequestMapping("addCar")
    @ResponseBody
    public void addCar(@RequestBody CarBean bean){
        service.addCar(bean);
    }

    /**
     * @Author: zzy
     * @Description: 车型回显
     * @Date: 2021/1/13 15:07
     * @Return: void
     **/
    @RequestMapping("findById")
    @ResponseBody
    public CarBean findById(Integer id){
        return service.findById(id);
    }

    /**
     * @Author: zzy
     * @Description: 业务  禁用 |取消最热 |取消首发 | 删除
     * @Date: 2021/1/13 15:38
     * @Return: void
     **/
    @RequestMapping("voipCar")
    @ResponseBody
    public void voipCar(Integer id,String field,Integer biz){
        service.voipCar(id,field,biz);
    }

    /**
     * @Author: zzy
     * @Description: 新增 修改 颜色表
     * @Date: 2021/1/13 16:40
     * @Return: void
     **/
    @RequestMapping("addCol")
    @ResponseBody
    public void addCol(@RequestBody CarBean bean){
        service.addCol(bean);
    }

    /**
     * @Author: zzy
     * @Description: 删除颜色
     * @Date: 2021/1/13 16:46
     * @Return: void
     **/
    @RequestMapping("delCol")
    @ResponseBody
    public void delCol(Integer id){
        service.delCol(id);
    }

    /**
     * @Author: zzy
     * @Description: 颜色回显
     * @Date: 2021/1/13 16:49
     * @Return: com.jk.pojo.CarBean
     **/
    @RequestMapping("findByIdCol")
    @ResponseBody
    public CarBean findByIdCol(Integer id){
        return service.findByIdCol(id);
    }

    /**
     * @Author: zzy
     * @Description: 新增 修改 类型
     * @Date: 2021/1/13 19:03
     * @Return: void
     **/
    @RequestMapping("addTyp")
    @ResponseBody
    public void addTyp(@RequestBody CarBean bean){
        service.addTyp(bean);
    }

    /**
     * @Author: zzy
     * @Description: 删除类型
     * @Date: 2021/1/13 19:04
     * @Return: void
     **/
    @RequestMapping("delTyp")
    @ResponseBody
    public void delTyp(Integer id){
        service.delTyp(id);
    }


    /**
     * @Author: zzy
     * @Description: 类型回显
     * @Date: 2021/1/13 19:05
     * @Return: com.jk.pojo.CarBean
     **/
    @RequestMapping("findByIdTyp")
    @ResponseBody
    public CarBean findByIdTyp(Integer id){
        return service.findByIdTyp(id);
    }
}

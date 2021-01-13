package com.jk.controller;

import com.jk.pojo.CarBean;
import com.jk.pojo.TreeBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("car")
public class CarController {

    @Resource
    private CarService service;

    /**
     * @Author: zzy
     * @Description: 树
     * @Date: 2021/1/12 23:06
     * @Return: java.util.List<com.jk.pojo.TreeBean>
     **/
    @RequestMapping("/findtree")
    @ResponseBody
    public List<TreeBean> findtree() {
        //获取用户id
        //Subject subject = SecurityUtils.getSubject();
        ///UserBean bean = (UserBean) subject.getPrincipal();
        return service.findtree();
    }

    @RequestMapping("toshow")
    public String toshow(){
        return "car/show";
    }

    @RequestMapping("color")
    public String color(){
        return "car/color";
    }


    /*
     * @Author: zzy
     * @Description: 车型管理查询
     * @Date: 2021/1/13 11:16
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("findCar")
    @ResponseBody
    public HashMap<String,Object> findCar(Integer page, Integer rows, CarBean bean){
        return service.findCar(page,rows,bean);
    }
    /**
     * @Author: zzy
     * @Description: 跳转新增页面
     * @Date: 2021/1/13 14:37
     * @Return: java.lang.String
     **/
    @RequestMapping("toadd")
    public String toadd(){
        return "car/add";
    }
    @RequestMapping("toaddCol")
    public String toaddCol(){
        return "car/addCol";
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
     * @Description: 新增 修改  车型
     * @Date: 2021/1/13 14:39
     * @Return: void
     **/
    @RequestMapping("addCar")
    @ResponseBody
    public void addCar(CarBean bean){
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
    public void addCol(CarBean bean){
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
     * @Description:
     * @Date: 2021/1/13 16:49
     * @Return: com.jk.pojo.CarBean
     **/
    @RequestMapping("findByIdCol")
    @ResponseBody
    public CarBean findByIdCol(Integer id){
        return service.findByIdCol(id);
    }

}

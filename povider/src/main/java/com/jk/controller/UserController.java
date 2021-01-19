package com.jk.controller;

import com.jk.pojo.UserBean;
import com.jk.serice.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private Carservice service;
    /*
     * @Author: zzy
     * @Description: 角色查询
     * @Date: 2021/1/18 11:22
     * @Return: java.util.List<com.jk.pojo.SloBean>
     **/
    @RequestMapping("findRol")
    @ResponseBody
    public List<UserBean> findRol(){
        return service.findRol();
    }
    /*
     * @Author: zzy
     * @Description: 部门管理
     * @Date: 2021/1/18 11:45
     * @Return: java.util.List<com.jk.pojo.UserBean>
     **/
    @RequestMapping("findBra")
    @ResponseBody
    public List<UserBean> findBra(){
        return service.findBra();
    }

    /**
     * @Author: zzy
     * @Description: 部门新增
     * @Date: 2021/1/18 14:11
     * @Return: void
     **/
    @RequestMapping("addBra")
    @ResponseBody
    public void addBra(@RequestBody UserBean bean){
        service.addBra(bean);
    }

    /**
     * @Author: zzy
     * @Description: 部门回显
     * @Date: 2021/1/18 14:19
     * @Return: com.jk.pojo.UserBean
     **/
    @RequestMapping("findByIdBra")
    @ResponseBody
    public UserBean findByIdBra(Integer id){
        return service.findByIdBra(id);
    }

    /**
     * @Author: zzy
     * @Description: 删除部门
     * @Date: 2021/1/18 16:18
     * @Return: void
     **/
    @RequestMapping("delBra")
    @ResponseBody
    public void delBra(Integer id){
        service.delBra(id);
    }

    /**
     * @Author: zzy
     * @Description: 用户查询
     * @Date: 2021/1/18 19:02
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findUse")
    @ResponseBody
    public HashMap<String,Object> findUse(Integer page, Integer rows,@RequestBody UserBean bean){
        return service.findUse(page,rows,bean);
    }

    /**
     * @Author: zzy
     * @Description: 账号回显
     * @Date: 2021/1/19 10:48
     * @Return: com.jk.pojo.UserBean
     **/
    @RequestMapping("findByIdUse")
    @ResponseBody
    public UserBean findByIdUse(Integer id){
        return service.findByIdUse(id);
    }

    /**
     * @Author: zzy
     * @Description: 账号新增 修改
     * @Date: 2021/1/19 10:52
     * @Return: void
     **/
    @RequestMapping("addUse")
    @ResponseBody
    public void addUse(@RequestBody UserBean bean){
        service.addUse(bean);
    }

    /**
     * @Author: zzy
     * @Description: 修改权限
     * @Date: 2021/1/19 14:03
     * @Return: void
     **/
    @RequestMapping("upAut")
    @ResponseBody
    public void upAut(Integer id,Integer role){
        service.upAut(id,role);
    }

    /**
     * @Author: zzy
     * @Description: 删除用户
     * @Date: 2021/1/19 14:10
     * @Return: void
     **/
    @RequestMapping("delUse")
    @ResponseBody
    public void delUse(Integer id){
        service.delUse(id);
    }
}

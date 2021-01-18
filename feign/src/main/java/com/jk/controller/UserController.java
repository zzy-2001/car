package com.jk.controller;

import com.jk.pojo.UserBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private CarService service;
    @RequestMapping("role")
    public String slo(){
        return "user/role";
    }
    @RequestMapping("pla")
    public String pla(){
        return "user/pla";
    }

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
}
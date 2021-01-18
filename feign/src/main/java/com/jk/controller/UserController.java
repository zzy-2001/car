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
    @RequestMapping("bra")
    public String bra(){
        return "user/bra";
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
    /*
     * @Author: zzy
     * @Description: 部门列表
     * @Date: 2021/1/18 11:45
     * @Return: java.util.List<com.jk.pojo.UserBean>
     **/
    @RequestMapping("findBra")
    @ResponseBody
    public List<UserBean> findBra(){
        return service.findBra();
    }
    @RequestMapping("toAddBra")
    public String toAddBra(){
        return "user/addBra";
    }

    /**
     * @Author: zzy
     * @Description: 部门新增
     * @Date: 2021/1/18 14:11
     * @Return: void
     **/
    @RequestMapping("addBra")
    @ResponseBody
    public void addBra(UserBean bean){
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

}

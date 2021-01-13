package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
}

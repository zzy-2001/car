package com.jk.controller;

import com.jk.pojo.OrdBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("ord")
public class OrderController {
    @Resource
    private CarService service;

    @RequestMapping("ord")
    public String ord(){
        return "order/order";
    }

    /**
     * @Author: zzy
     * @Description: 订单查询调查
     * @Date: 2021/1/17 19:21
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findOrd")
    @ResponseBody
    public HashMap<String,Object> findOrd(Integer page, Integer rows, OrdBean bean){
        return service.findOrd(page,rows,bean);
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "new/add";
    }

    /**
     * @Author: zzy
     * @Description: 发货
     * @Date: 2021/1/18 10:48
     * @Return: void
     **/
    @RequestMapping("upOrd")
    @ResponseBody
    public void upOrd(String id,Integer status){
        service.upOrd(id,status);
    }
}

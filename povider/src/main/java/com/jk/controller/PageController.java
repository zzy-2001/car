package com.jk.controller;

import com.jk.pojo.SloBean;
import com.jk.serice.Carservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("page")
public class PageController {

    @Resource
    private Carservice service;

    /**
     * @Author: zzy
     * @Description: 广告表查询调查
     * @Date: 2021/1/14 15:14
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findSlo")
    @ResponseBody
    public HashMap<String,Object> findSlo(Integer page, Integer rows,@RequestBody SloBean bean){
        return service.findSlo(page,rows,bean);
    }
}

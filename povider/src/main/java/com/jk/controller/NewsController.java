package com.jk.controller;

import com.jk.pojo.NewsBean;
import com.jk.serice.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("new")
public class NewsController {

    @Autowired
    private Carservice service;

    /**
     * @Author: zzy
     * @Description: 新闻动态表查询新增
     * @Date: 2021/1/14 15:14
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findNew")
    @ResponseBody
    public HashMap<String,Object> findNew(Integer page, Integer rows,@RequestBody NewsBean bean){
        return service.findNew(page,rows,bean);
    }
}

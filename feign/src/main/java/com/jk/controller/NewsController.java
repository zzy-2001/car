package com.jk.controller;

import com.jk.pojo.NewsBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("new")
public class NewsController {
    @Resource
    private CarService service;

    @RequestMapping("new")
    public String news(){
        return "new/new";
    }
    @RequestMapping("nty")
    public String nty(){
        return "new/nty";
    }

    /**
     * @Author: zzy
     * @Description: 新闻动态表查询新增
     * @Date: 2021/1/14 15:14
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findNew")
    @ResponseBody
    public HashMap<String,Object> findNew(Integer page, Integer rows, NewsBean bean){
        return service.findNew(page,rows,bean);
    }
}

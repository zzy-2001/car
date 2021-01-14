package com.jk.controller;

import com.jk.pojo.SloBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("page")
public class PageController {

    @Resource
    private CarService service;

    @RequestMapping("slo")
    public String slo(){
        return "page/slo";
    }
    /**
     * @Author: zzy
     * @Description: 广告表查询新增
     * @Date: 2021/1/14 15:14
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findSlo")
    @ResponseBody
    public HashMap<String,Object> findSlo(Integer page, Integer rows, SloBean bean){
        return service.findSlo(page,rows,bean);
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "page/slo";
    }

}

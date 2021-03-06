package com.jk.controller;

import com.jk.pojo.CarBean;
import com.jk.pojo.SloBean;
import com.jk.serice.Carservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

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

    /**
     * @Author: zzy
     * @Description: 新增修改
     * @Date: 2021/1/14 16:47
     * @Return: void
     **/
    @RequestMapping("addSlo")
    @ResponseBody
    public void addSlo(@RequestBody SloBean bean){
        service.addSlo(bean);
    }

    /**
     * @Author: zzy
     * @Description: 广告位置查询
     * @Date: 2021/1/14 16:54
     * @Return: java.util.HashMap<java.lang.String, java.lang.Object>
     **/
    @RequestMapping("findPla")
    @ResponseBody
    public List<SloBean> findPla(){
        return service.findPla();
    }

    /**
     * @Author: zzy
     * @Description: 回显
     * @Date: 2021/1/14 17:16
     * @Return: com.jk.pojo.CarBean
     *
     * @return*/
    @RequestMapping("findByIdSlo")
    @ResponseBody
    public SloBean findByIdSlo(Integer id){
        return service.findByIdSlo(id);
    }

    /**
     * @Author: zzy
     * @Description: 删除广告
     * @Date: 2021/1/14 19:09
     * @Return: void
     **/
    @RequestMapping("delSlo")
    @ResponseBody
    public void delSlo(Integer[] arr){
        service.delSlo(arr);
    }

    /**
     * @Author: zzy
     * @Description: 修改状态
     * @Date: 2021/1/14 19:13
     * @Return: void
     **/
    @RequestMapping("upSta")
    @ResponseBody
    public void upSta(Integer id,Integer status){
        service.upSta(id,status);
    }

    /**
     * @Author: zzy
     * @Description: 新增 修改 广告位置
     * @Date: 2021/1/14 19:38
     * @Return: void
     **/
    @RequestMapping("addPla")
    @ResponseBody
    public void addPla(@RequestBody SloBean bean){
        service.addPla(bean);
    }

    /**
     * @Author: zzy
     * @Description: 回显广告位置
     * @Date: 2021/1/14 17:16
     * @Return: com.jk.pojo.CarBean
     *
     * @return*/
    @RequestMapping("findByIdPla")
    @ResponseBody
    public SloBean findByIdPla(Integer id){
        return service.findByIdPla(id);
    }

    /**
     * @Author: zzy
     * @Description: 删除广告位置
     * @Date: 2021/1/14 19:47
     * @Return: void
     **/
    @RequestMapping("delPla")
    @ResponseBody
    public void delPla(Integer id){
        service.delPla(id);
    }

    /**
     * @Author: zzy
     * @Description: 修改状态2
     * @Date: 2021/1/14 20:06
     * @Return: void
     **/
    @RequestMapping("upSts")
    @ResponseBody
    public void upSts(Integer id,Integer status){
        service.upSts(id,status);
    }
}

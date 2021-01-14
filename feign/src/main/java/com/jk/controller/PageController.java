package com.jk.controller;

import com.jk.pojo.CarBean;
import com.jk.pojo.SloBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

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
        return "page/add";
    }

    /**
     * @Author: zzy
     * @Description: 新增修改
     * @Date: 2021/1/14 16:47
     * @Return: void
     **/
    @RequestMapping("addSlo")
    @ResponseBody
    public void addSlo(SloBean bean){
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

}

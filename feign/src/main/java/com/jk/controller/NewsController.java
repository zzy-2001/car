package com.jk.controller;

import com.jk.pojo.NewsBean;
import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

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

    @RequestMapping("toAdd")
    public String toAdd(){
        return "new/add";
    }

    /**
     * @Author: zzy
     * @Description: 新增修改
     * @Date: 2021/1/14 23:06
     * @Return: void
     **/
    @RequestMapping("addNew")
    @ResponseBody
    public void addNew(NewsBean bean){
        service.addNew(bean);
    }

    /**
     * @Author: zzy
     * @Description: 类型表查询
     * @Date: 2021/1/14 23:17
     * @Return: java.util.List<com.jk.pojo.NewsBean>
     **/
    @RequestMapping("findNty")
    @ResponseBody
    public List<NewsBean> findNty(){
        return service.findNty();
    }

    /**
     * @Author: zzy
     * @Description: 新闻回显
     * @Date: 2021/1/14 23:17
     * @Return: com.jk.pojo.SloBean
     **/
    @RequestMapping("findByIdNew")
    @ResponseBody
    public NewsBean findByIdNew(Integer id){
        return service.findByIdNew(id);
    }

    /**
     * @Author: zzy
     * @Description: 删除新闻
     * @Date: 2021/1/14 23:28
     * @Return: void
     **/
    @RequestMapping("delNew")
    @ResponseBody
    public void delNew(Integer id){
        service.delNew(id);
    }

    /**
     * @Author: zzy
     * @Description: 修改状态
     * @Date: 2021/1/14 23:31
     * @Return: void
     **/
    @RequestMapping("nupSta")
    @ResponseBody
    public void nupSta(Integer id,Integer status){
        service.nupSta(id,status);
    }
}

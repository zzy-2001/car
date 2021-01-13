package com.jk.serice.Impl;

import com.jk.dao.CarDao;
import com.jk.pojo.CarBean;
import com.jk.pojo.TreeBean;
import com.jk.serice.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CarServiceImpl implements Carservice {

    @Autowired
    private CarDao dao;

    @Override
    public List<TreeBean> findtree(int id) {
        //Integer userid = (Integer)session.getAttribute("userid");
        List<TreeBean> list = new ArrayList<TreeBean>();
        //开始处理redis
        //1、判断redis是否存在：根据key判断
        //自定义key：定义常量
        //String key = CommonCodeUtils.POWER_TREE+userid;
        //p0wer_tree1 power_tree2
        //if(redisTemplate.hasKey(key)){//存在
        //System.out.println("==========走缓存===========");
        //从redis查询
        //list = (List<TreeBean>) redisTemplate.opsForValue().get(key);

        //}else{//不存在
        //System.out.println("==========走数据库===========");
        //a、先从数据库查询
        int pid = 0;
        //查询一级节点

        //提取公共方法的快捷键：alt+shift+m
        list = findtree(pid,id);

        //b、存入redis
        //redisTemplate.opsForValue().set(key, list, 30, TimeUnit.MINUTES);

        //}
        return list;
    }

    @Override
    public HashMap<String, Object> findCar(Integer page, Integer rows, CarBean bean) {
        int total = dao.carTotal(bean);
        int start = (page-1)*rows;
        List<CarBean> list = dao.carPage(start,rows,bean);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }

    @Override
    public List<CarBean> findType() {
        return dao.findType();
    }

    @Override
    public List<CarBean> findColor() {
        return dao.findColor();
    }

    @Override
    public void addCar(CarBean bean) {
        if (bean.getId()==null){
            //车型新增
            dao.addCar(bean);
        }else {
            //车型修改
            dao.upCar(bean);
        }
    }

    @Override
    public CarBean findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void voipCar(Integer id, String field, Integer biz) {
        if (field.equals("1")){
            dao.staCar(id,biz);  //状态
        }else if (field.equals("2")){
            dao.hotCar(id,biz);  //是否最热
        }else if (field.equals("3")){
            dao.firCar(id,biz);  //是否首发
        }else if (field.equals("4")){
            dao.delCar(id);    //删除
        }
    }

    private List<TreeBean> findtree(int pid,int userid) {
        List<TreeBean> list = dao.findnode(pid,userid);
        for (TreeBean tree : list) {
            Integer id = tree.getId();
            List<TreeBean> list2 = findtree(id,userid);
            if (list2 != null && list2.size()>0) {
                tree.setNodes(list2);
                tree.setSelectable(false);
            }else {
                tree.setSelectable(true);
            }
        }
        return list;
    }
}

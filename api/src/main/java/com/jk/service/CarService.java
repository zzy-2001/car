package com.jk.service;

import com.jk.pojo.CarBean;
import com.jk.pojo.SloBean;
import com.jk.pojo.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient(value = "provider",fallback = Hystrix.class)
public interface CarService {
    @RequestMapping("car/findtree")
    List<TreeBean> findtree();
    @RequestMapping("car/findCar")
    HashMap<String, Object> findCar(@RequestParam("page") Integer page,@RequestParam("rows")  Integer rows, CarBean bean);
    @RequestMapping("car/findType")
    List<CarBean> findType();
    @RequestMapping("car/findColor")
    List<CarBean> findColor();
    @RequestMapping("car/addCar")
    void addCar(CarBean bean);
    @RequestMapping("car/findById")
    CarBean findById(@RequestParam("id")Integer id);
    @RequestMapping("car/voipCar")
    void voipCar(@RequestParam("id") Integer id, @RequestParam("field") String field,@RequestParam("biz") Integer biz);
    @RequestMapping("car/addCol")
    void addCol(CarBean bean);
    @RequestMapping("car/delCol")
    void delCol(@RequestParam("id")Integer id);
    @RequestMapping("car/findByIdCol")
    CarBean findByIdCol(@RequestParam("id")Integer id);
    @RequestMapping("car/addTyp")
    void addTyp(CarBean bean);
    @RequestMapping("car/delTyp")
    void delTyp(@RequestParam("id")Integer id);
    @RequestMapping("car/findByIdTyp")
    CarBean findByIdTyp(@RequestParam("id")Integer id);
    @RequestMapping("page/findSlo")
    HashMap<String, Object> findSlo(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, SloBean bean);
}

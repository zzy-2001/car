package com.jk.service;

import com.jk.pojo.*;
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
    HashMap<String, Object> findCar(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, CarBean bean);
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
    @RequestMapping("page/addSlo")
    void addSlo(SloBean bean);
    @RequestMapping("page/findPla")
    List<SloBean> findPla();
    @RequestMapping("page/findByIdSlo")
    SloBean findByIdSlo(@RequestParam("id")Integer id);
    @RequestMapping("page/delSlo")
    void delSlo(@RequestParam("arr")Integer[] arr);
    @RequestMapping("page/upSta")
    void upSta(@RequestParam("id")Integer id,@RequestParam("status") Integer status);
    @RequestMapping("page/addPla")
    void addPla(SloBean bean);
    @RequestMapping("page/findByIdPla")
    SloBean findByIdPla(@RequestParam("id")Integer id);
    @RequestMapping("page/delPla")
    void delPla(@RequestParam("id")Integer id);
    @RequestMapping("page/upSts")
    void upSts(@RequestParam("id")Integer id,@RequestParam("status") Integer status);
    @RequestMapping("new/findNew")
    HashMap<String, Object> findNew(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, NewsBean bean);
    @RequestMapping("new/addNew")
    void addNew(NewsBean bean);
    @RequestMapping("new/findNty")
    List<NewsBean> findNty();
    @RequestMapping("new/findByIdNew")
    NewsBean findByIdNew(@RequestParam("id")Integer id);
    @RequestMapping("new/delNew")
    void delNew(@RequestParam("id")Integer id);
    @RequestMapping("new/nupSta")
    void nupSta(@RequestParam("id")Integer id,@RequestParam("status") Integer status);
    @RequestMapping("new/addNty")
    void addNty(NewsBean bean);
    @RequestMapping("new/findByIdNty")
    NewsBean findByIdNty(@RequestParam("id")Integer id);
    @RequestMapping("new/delNty")
    void delNty(@RequestParam("id")Integer id);
    @RequestMapping("ord/findOrd")
    HashMap<String, Object> findOrd(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, OrdBean bean);
    @RequestMapping("ord/upOrd")
    void upOrd(@RequestParam("id")String id,@RequestParam("status") Integer status);
}

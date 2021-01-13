package com.jk.service;

import com.jk.pojo.CarBean;
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
}

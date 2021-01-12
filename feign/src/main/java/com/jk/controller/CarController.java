package com.jk.controller;

import com.jk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("car")
public class CarController {

    @Resource
    private CarService service;
}

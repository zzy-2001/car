package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provider",fallback = Hystrix.class)
public interface CarService {
}

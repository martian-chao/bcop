package com.cars.dzyd.controller;

import com.cars.dzyd.service.DzydService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@RestController
public class DzydController {
    @Autowired
    DzydService dzydService;

    @GetMapping("/getYdxx")
    public String getYdxx(@RequestParam(value = "ydhm") String ydhm) {
        String ydxx = dzydService.getYdxx(ydhm);
        System.out.println("feign获取到运单信息为：" + ydxx);
        return ydxx;
    }
}

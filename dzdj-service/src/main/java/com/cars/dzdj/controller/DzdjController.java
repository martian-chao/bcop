package com.cars.dzdj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@RestController
public class DzdjController {

    /**
     * 获取运单信息
     *
     * @param ydhm
     * @return
     */
    @GetMapping("/getYdxx")
    public String getYdxx(@RequestParam(value = "ydhm") String ydhm) {
        System.out.println("当前运单号为：" + ydhm);
        return "当前运单号为：" + ydhm;
    }
}

package com.cars.dzyd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@Component
@FeignClient(value = "dzdj-service", fallback = DzydServiceHystrix.class)
public interface DzydService {

    /**
     * 获取运单信息
     *
     * @param ydhm 运单号码
     * @return
     */
    @RequestMapping(value = "/getYdxx", method = RequestMethod.GET)
    String getYdxx(@RequestParam(value = "ydhm") String ydhm);
}

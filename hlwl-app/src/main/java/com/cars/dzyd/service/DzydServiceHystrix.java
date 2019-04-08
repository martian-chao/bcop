package com.cars.dzyd.service;

import org.springframework.stereotype.Component;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@Component
public class DzydServiceHystrix implements DzydService {
    @Override
    public String getYdxx(String ydhm) {
        return "电子运单服务故障了";
    }
}

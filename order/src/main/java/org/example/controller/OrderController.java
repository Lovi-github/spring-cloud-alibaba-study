package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 订单接口
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    //下单
    @RequestMapping("/add")
    public String addOrder(){
        String msg = restTemplate.getForObject("http://localhost:8082/stock/reduce", String.class);
        return "下单成功:"+msg;
    }
    @RequestMapping("/hhh")
    public String test(){
        return "测试字符串2";
    }

}

package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单接口
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    //下单
    @GetMapping("/reduce")
    public String addOrder(){
        return "库存减少";
    }

    @GetMapping("/test")
    public String test2(){
        return "字符串测试3";
    }
}

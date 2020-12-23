package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description
 *      测试controller
 * @createTime 15:14 2020/11/17
 */
@RestController
@Slf4j
public class TestController {
    @GetMapping("test")
    public ResultBean test(){
        log.info("******log info******");
        return new ResultBean<String>(Statue.SUCCESS.code,Statue.SUCCESS.message,"测试成功！");
    }
}

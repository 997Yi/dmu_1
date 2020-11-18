package com.casit.dmu_1.controller;/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月18日 14:58:00
 */

import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import com.casit.dmu_1.pojo.User;
import com.casit.dmu_1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月18日 14:58:00
 */

@Api(description = "用户操作接口")
@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "增加用户",notes = "增加用户")
    @ApiImplicitParam(name="user",value = "新增用户")
    @PostMapping("add")
    public ResultBean add(@RequestBody User user){
        return new ResultBean<Integer>(Statue.SUCCESS.code,Statue.SUCCESS.message,userService.add(user));
    }
}

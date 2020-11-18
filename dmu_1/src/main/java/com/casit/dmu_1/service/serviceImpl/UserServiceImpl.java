package com.casit.dmu_1.service.serviceImpl;/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月18日 15:04:00
 */

import com.casit.dmu_1.mapper.UserMapper;
import com.casit.dmu_1.pojo.User;
import com.casit.dmu_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月18日 15:04:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }
}

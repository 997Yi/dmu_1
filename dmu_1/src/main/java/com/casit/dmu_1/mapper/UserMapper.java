package com.casit.dmu_1.mapper;

import com.casit.dmu_1.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月18日 15:02:00
 */
@Mapper
public interface UserMapper {
    int add(User user);
}

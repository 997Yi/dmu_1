package com.casit.dmu_1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description
 *      用户实体类
 * @createTime 2020年11月18日 14:56:00
 */
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private int type;
}

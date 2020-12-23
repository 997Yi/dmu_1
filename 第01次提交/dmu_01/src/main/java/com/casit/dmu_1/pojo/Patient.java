package com.casit.dmu_1.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      病患实体类
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
public class Patient {
    private int id;
    private String name;
    private int sex;
    private String birthday;
    private int hospital_id;
    private String phone_number;
    private Date create_time;

}

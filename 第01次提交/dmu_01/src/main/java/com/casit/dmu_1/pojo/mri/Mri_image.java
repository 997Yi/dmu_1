package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI影像
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
public class Mri_image {
    private int id;
    /**
     * MRI影像的批次号
     */
    private int mri_record_id;
}

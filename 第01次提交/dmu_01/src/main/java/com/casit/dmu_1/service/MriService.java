package com.casit.dmu_1.service;


import com.casit.dmu_1.pojo.mri.Definiteness_mri;
import com.casit.dmu_1.pojo.mri.Mri_record;
import com.casit.dmu_1.pojo.mri.Mri_scan_info;
import com.casit.dmu_1.pojo.mri.Quantification_mri;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      由于批次、图像、扫描信息为一对一的关系，将MRI影像相关的增删操作合成一个接口
 * @createTime 2020/12/23
 */

public interface MriService {
    /**
     * 按批次添加
     * @param mri_scan_info MRI扫描信息
     * @param definiteness_mri MRI定性结果
     * @param quantification_mri MRI定量结果
     * @return 返回 1 表示添加成功
     */
    int addMriByRecord(Mri_scan_info mri_scan_info, Definiteness_mri definiteness_mri, Quantification_mri quantification_mri);

    /**
     * 按批次删除
     * @param record_id 需要删除的CT批次id
     * @return 返回 1 表示删除成功
     */
    int deleteMriByRecord(int record_id);
}

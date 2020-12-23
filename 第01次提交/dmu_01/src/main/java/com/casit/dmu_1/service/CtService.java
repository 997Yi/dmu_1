package com.casit.dmu_1.service;

import com.casit.dmu_1.pojo.ct.Ct_record;
import com.casit.dmu_1.pojo.ct.Ct_scan_info;
import com.casit.dmu_1.pojo.ct.Definiteness_ct;
import com.casit.dmu_1.pojo.ct.Quantification_ct;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      由于批次、图像、扫描信息为一对一的关系，将CT影像相关的增删操作合成一个接口
 * @createTime 2020/12/23
 */

public interface CtService {
    /**
     * 按批次添加
     * @param ct_scan_info CT扫描信息
     * @param definiteness_ct CT定性结果
     * @param quantification_ct CT定量结果
     * @return 返回 1 表示添加成功
     */
    int addCtByRecord(Ct_scan_info ct_scan_info, Definiteness_ct definiteness_ct, Quantification_ct quantification_ct);

    /**
     * 按批次删除
     * @param record_id 需要删除的CT批次id
     * @return 返回 1 表示删除成功
     */
    int deleteCtByRecord(int record_id);
}

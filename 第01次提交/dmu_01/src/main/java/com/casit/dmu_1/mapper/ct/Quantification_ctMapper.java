package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Quantification_ct;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定量结果
 * @createTime 2020/12/23
 */
@Mapper
public interface Quantification_ctMapper {
    /**
     * 添加CT定量结果
     * @param quantification_ct 需要添加的CT定量结果
     * @return 更改的行数
     */
    int addQuantification_ct(Quantification_ct quantification_ct);

    /**
     * 删除CT定量结果
     * @param image_id 需要删除的CT定量结果影像id
     * @return 更改的行数
     */
    int deleteQuantification_ct(int image_id);
}

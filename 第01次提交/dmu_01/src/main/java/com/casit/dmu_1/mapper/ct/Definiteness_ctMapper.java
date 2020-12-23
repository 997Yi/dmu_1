package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Definiteness_ct;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定性结果
 * @createTime 2020/12/23
 */

@Mapper
public interface Definiteness_ctMapper {
    /**
     * 添加CT定性结果
     * @param definiteness_ct 需要添加的CT定性结果
     * @return 更改的行数
     */
    int addDefiniteness_ct(Definiteness_ct definiteness_ct);

    /**
     * 删除CT定性结果
     * @param image_id 需要删除的CT定性结果的影像id
     * @return
     */
    int deleteDefiniteness_ct(int image_id);
}

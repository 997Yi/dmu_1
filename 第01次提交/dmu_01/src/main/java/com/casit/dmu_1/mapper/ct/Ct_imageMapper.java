package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Ct_image;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT影像持久层
 * @createTime 2020/12/23
 */

@Mapper
public interface Ct_imageMapper {
    /**
     * 添加CT影像
     * @param ct_image 需要添加的ct影像
     * @return 更改的行数
     */
    int addCt_image(Ct_image ct_image);

    /**
     * 删除CT影像
     * @param record_id 需要删除的CT批次id
     * @return 更改的行数
     */
    int deleteCt_image(int record_id);

    /**
     * 根据批次id查询影像id
     * @param record_id 批次id
     * @return 影像id
     */
    int queryCt_imageIdByRecord_id(int record_id);
}

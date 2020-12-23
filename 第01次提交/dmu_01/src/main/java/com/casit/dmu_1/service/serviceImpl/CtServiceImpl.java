package com.casit.dmu_1.service.serviceImpl;

import com.casit.dmu_1.mapper.ct.*;
import com.casit.dmu_1.pojo.ct.*;
import com.casit.dmu_1.service.CtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT影像业务层
 * @createTime 2020/12/23
 */

@Service
@Transactional
public class CtServiceImpl implements CtService {

    @Autowired
    Ct_recordMapper ct_recordMapper;
    @Autowired
    Ct_imageMapper ct_imageMapper;
    @Autowired
    Ct_scan_infoMapper ct_scan_infoMapper;
    @Autowired
    Definiteness_ctMapper definiteness_ctMapper;
    @Autowired
    Quantification_ctMapper quantification_ctMapper;

    @Override
    @Transactional
    public int addCtByRecord(Ct_scan_info ct_scan_info, Definiteness_ct definiteness_ct, Quantification_ct quantification_ct) {
        //在数据库中添加一个新的批次
        Ct_record ct_record = new Ct_record(0);//构造函数中的 0 不作为数据库中的id起到占位作用
        ct_recordMapper.addCt_record(ct_record);

        //添加一个新的影像
        Ct_image ct_image = new Ct_image(0, ct_record.getId());
        ct_imageMapper.addCt_image(ct_image);

        //添加扫描信息
        ct_scan_infoMapper.addCt_scan_info(ct_scan_info);
        //添加定性结果
        definiteness_ctMapper.addDefiniteness_ct(definiteness_ct);
        //添加定量结果
        quantification_ctMapper.addQuantification_ct(quantification_ct);
        return 1;
    }

    @Override
    @Transactional
    public int deleteCtByRecord(int record_id) {
        //删除批次
        ct_recordMapper.deleteCt_record(record_id);
        //查询对应批次的图像id
        int image_id = ct_imageMapper.queryCt_imageIdByRecord_id(record_id);
        //删除图像
        ct_imageMapper.deleteCt_image(record_id);
        //删除扫描信息
        ct_scan_infoMapper.deleteCt_scan_info(record_id);
        //删除定性结果
        definiteness_ctMapper.deleteDefiniteness_ct(image_id);
        //删除定量结果
        quantification_ctMapper.deleteQuantification_ct(image_id);
        return 1;
    }
}

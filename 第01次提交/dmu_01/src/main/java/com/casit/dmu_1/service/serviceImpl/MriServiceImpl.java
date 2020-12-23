package com.casit.dmu_1.service.serviceImpl;

import com.casit.dmu_1.mapper.mri.*;
import com.casit.dmu_1.pojo.mri.*;
import com.casit.dmu_1.service.MriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI影像业务层
 * @createTime 2020/12/23
 */

@Service
public class MriServiceImpl implements MriService {

    @Autowired
    Mri_recordMapper mri_recordMapper;
    @Autowired
    Mri_imageMapper mri_imageMapper;
    @Autowired
    Mri_scan_infoMapper mri_scan_infoMapper;
    @Autowired
    Definiteness_mriMapper definiteness_mriMapper;
    @Autowired
    Quantification_mriMapper quantification_mriMapper;

    @Override
    @Transactional
    public int addMriByRecord(Mri_scan_info mri_scan_info, Definiteness_mri definiteness_mri, Quantification_mri quantification_mri) {
        //在数据库中添加一个新的批次
        Mri_record mri_record = new Mri_record(0);//构造函数中的 0 不作为数据库中的id起到占位作用
        mri_recordMapper.addMri_record(mri_record);

        //添加一个新的影像
        Mri_image mri_image = new Mri_image(0, mri_record.getId());
        mri_imageMapper.addMri_image(mri_image);

        //添加扫描信息
        mri_scan_infoMapper.addMri_scan_info(mri_scan_info);
        //添加定性结果
        definiteness_mriMapper.addDefiniteness_mri(definiteness_mri);
        //添加定量结果
        quantification_mriMapper.addQuantification_mri(quantification_mri);
        return 1;
    }

    @Override
    @Transactional
    public int deleteMriByRecord(int record_id) {
        //删除批次
        mri_recordMapper.deleteMri_record(record_id);
        //查询对应批次的图像id
        int image_id = mri_imageMapper.queryMri_imageIdByRecord_id(record_id);
        //删除图像
        mri_imageMapper.deleteMri_image(record_id);
        //删除扫描信息
        mri_scan_infoMapper.deleteMri_scan_info(record_id);
        //删除定性结果
        definiteness_mriMapper.deleteDefiniteness_mri(image_id);
        //删除定量结果
        quantification_mriMapper.deleteQuantification_mri(image_id);
        return 1;
    }
}

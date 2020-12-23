package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import com.casit.dmu_1.pojo.mri.Definiteness_mri;
import com.casit.dmu_1.pojo.mri.Mri_scan_info;
import com.casit.dmu_1.pojo.mri.Quantification_mri;
import com.casit.dmu_1.service.MriService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI控制层
 * @createTime 2020/12/23
 */

@Api(description = "MRI影像接口")
@RestController
@RequestMapping("mri")
public class MriController {

    @Autowired
    MriService mriService;

    @ApiOperation(value = "增加MRI",notes = "增加MRI")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mri_scan_info",value = "扫描信息"),
            @ApiImplicitParam(name="definiteness_mri",value = "定性结果"),
            @ApiImplicitParam(name="quantification_mri",value = "定量结果")
    })
    @PostMapping("add")
    public ResultBean add(@RequestBody Mri_scan_info mri_scan_info, @RequestBody Definiteness_mri definiteness_mri, @RequestBody Quantification_mri quantification_mri){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, mriService.addMriByRecord(mri_scan_info, definiteness_mri, quantification_mri));
    }

    @ApiOperation(value = "删除MRI",notes = "删除MRI")
    @ApiImplicitParam(name="record_id",value = "需要删除MRI的批次id")
    @GetMapping("delete")
    public ResultBean delete(@RequestParam(value = "record_id") int record_id){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, mriService.deleteMriByRecord(record_id));
    }
}

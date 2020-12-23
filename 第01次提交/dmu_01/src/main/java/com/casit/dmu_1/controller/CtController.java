package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.Patient;
import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import com.casit.dmu_1.pojo.ct.Ct_scan_info;
import com.casit.dmu_1.pojo.ct.Definiteness_ct;
import com.casit.dmu_1.pojo.ct.Quantification_ct;
import com.casit.dmu_1.pojo.mri.Definiteness_mri;
import com.casit.dmu_1.pojo.mri.Mri_scan_info;
import com.casit.dmu_1.pojo.mri.Quantification_mri;
import com.casit.dmu_1.service.CtService;
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
 *      CT控制层
 * @createTime 2020/12/23
 */

@Api(description = "CT影像接口")
@RestController
@RequestMapping("ct")
public class CtController {

    @Autowired
    CtService ctService;

    @ApiOperation(value = "增加CT",notes = "增加CT")
    @ApiImplicitParams({
            @ApiImplicitParam(name="ct_scan_info",value = "扫描信息"),
            @ApiImplicitParam(name="definiteness_ct",value = "定性结果"),
            @ApiImplicitParam(name="quantification_ct",value = "定量结果")
    })
    @PostMapping("add")
    public ResultBean add(@RequestBody Ct_scan_info ct_scan_info, @RequestBody Definiteness_ct definiteness_ct, @RequestBody Quantification_ct quantification_ct){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, ctService.addCtByRecord(ct_scan_info, definiteness_ct, quantification_ct));
    }

    @ApiOperation(value = "删除CT",notes = "删除CT")
    @ApiImplicitParam(name="record_id",value = "需要删除CT的批次id")
    @GetMapping("delete")
    public ResultBean delete(@RequestParam(value = "record_id") int record_id){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, ctService.deleteCtByRecord(record_id));
    }
}

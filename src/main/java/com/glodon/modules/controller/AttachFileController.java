package com.glodon.modules.controller;


import com.glodon.common.api.CommonResult;
import com.glodon.modules.model.AttachFile;
import com.glodon.security.annotation.Log;
import com.glodon.modules.service.impl.AttachFileServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LC
 * @since 2021-03-15
 */
@Controller
@RequestMapping("/attachFile")
public class AttachFileController {

    @Autowired
    private AttachFileServiceImpl attachFileService;

    @ApiOperation("test")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    @Log
    public CommonResult test(AttachFile attachFile) {
        AttachFile byId = attachFileService.getById(1);
        return  CommonResult.success(byId);
    }

}


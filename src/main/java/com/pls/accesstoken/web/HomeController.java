package com.pls.accesstoken.web;

import com.pls.accesstoken.model.Result;
import com.pls.accesstoken.service.SellerPublicService;
import com.pls.accesstoken.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 81046 on 2018-07-12
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private SellerPublicService sellerPublicService;

    /**
     * 获取所有的公众号信息   produces是防止中文乱码
     */
    @GetMapping(value = "/getAllList",produces = "application/json; charset=utf-8")
    public Result getAllList(){
        return ResultUtil.success(sellerPublicService.getAllList());
    }

}

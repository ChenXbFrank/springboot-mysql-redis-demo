package com.pls.accesstoken.dao;

import com.pls.accesstoken.model.SellerPublicNumber;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 81046 on 2018-07-12
 */
public interface SellerPublicDao {

    /**
     * 这里查询所有的公众号信息，select *   只会自动映射属性和列名一样的值，如果需要全部的值，需要自己手动添加映射值在Results里面的
     * @return
     */
    @Select("select * from tb_seller_publicnumber")
    @Results({
            @Result(property="id",column="id"),
            @Result(property="publicNumberName",column="publicnumber_name"),
            @Result(property="appid",column="appid"),
            @Result(property="appsecret",column="appsecret"),
            @Result(property="shopNumber",column="shop_number"),
            @Result(property="payKey",column="pay_key"),
            @Result(property="company",column="company"),
            @Result(property="token",column="token")
    })
    List<SellerPublicNumber> getAllList();

}

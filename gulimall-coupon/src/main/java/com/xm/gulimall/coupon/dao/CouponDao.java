package com.xm.gulimall.coupon.dao;

import com.xm.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xuman
 * @email xmlemonmarshmallow@gmail.com
 * @date 2021-12-21 22:51:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

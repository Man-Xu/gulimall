package com.xm.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xm.common.utils.PageUtils;
import com.xm.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author xuman
 * @email xmlemonmarshmallow@gmail.com
 * @date 2021-12-21 22:51:13
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


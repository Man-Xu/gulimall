package com.xm.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xm.common.utils.PageUtils;
import com.xm.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xuman
 * @email xmlemonmarshmallow@gmail.com
 * @date 2021-12-21 22:28:17
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


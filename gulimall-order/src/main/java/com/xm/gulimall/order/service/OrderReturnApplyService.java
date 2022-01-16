package com.xm.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xm.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author xuman
 * @email xmlemonmarshmallow@gmail.com
 * @date 2021-12-25 18:35:49
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


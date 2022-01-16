package com.xm.gulimall.order.dao;

import com.xm.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xuman
 * @email xmlemonmarshmallow@gmail.com
 * @date 2021-12-25 18:35:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

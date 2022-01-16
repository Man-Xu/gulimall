package com.xm.gulimall.product.dao;

import com.xm.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xuman
 * @email xmlemonmarshmallow@gmail.com
 * @date 2021-12-21 22:28:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

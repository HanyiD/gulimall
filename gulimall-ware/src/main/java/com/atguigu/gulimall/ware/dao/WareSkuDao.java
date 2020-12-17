package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hanyidong
 * @email hanyidong@gmail.com
 * @date 2020-12-03 17:33:50
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

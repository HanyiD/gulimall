package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hanyidong
 * @email hanyidong@gmail.com
 * @date 2020-12-03 17:14:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

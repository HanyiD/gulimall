package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hanyidong
 * @email hanyidong@gmail.com
 * @date 2020-04-30 14:45:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

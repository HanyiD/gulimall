package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Han
 * @version V1.0
 * @Package com.atguigu.gulimall.member.feign
 * @date 2020/12/18 11:25
 * FeignClient这个注解表明是一个远程服务
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

	//在这里将要注册进去的服务写进来，requestMapping中写全路径
	@RequestMapping("/coupon/coupon/member/list")
	public R memberCoupons();

}

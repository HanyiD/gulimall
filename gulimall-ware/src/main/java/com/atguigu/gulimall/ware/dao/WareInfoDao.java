package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author hanyidong
 * @email hanyidong@gmail.com
 * @date 2020-12-03 17:33:50
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}

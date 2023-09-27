package com.p.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.p.entity.Complaint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ComplaintDao extends BaseMapper<Complaint> {//基本的增删改查方法
}

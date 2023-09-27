package com.p.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.p.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Admin)表数据库访问层
 *
 * @author makejava
 * @since 2023-09-25 14:53:12
 */
@Mapper
public interface AdminDao  extends BaseMapper<Admin> {


}


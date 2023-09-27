package com.p.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p.entity.Admin;

/**
 * (Admin)表服务接口
 *
 * @author makejava
 * @since 2023-09-25 14:53:12
 */
public interface AdminService extends IService<Admin> {
public boolean selectByIdAndPassword(Admin admin);

}

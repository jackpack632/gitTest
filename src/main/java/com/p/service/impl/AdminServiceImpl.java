package com.p.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p.entity.Admin;
import com.p.dao.AdminDao;
import com.p.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * (Admin)表服务实现类
 *
 * @author makejava
 * @since 2023-09-25 14:53:12
 */
@Service("adminService")
public class AdminServiceImpl extends ServiceImpl<AdminDao,Admin> implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public boolean selectByIdAndPassword(Admin admin) {
        Admin returnAdmin=adminDao.selectById(admin.getId());
        if(returnAdmin!=null){
            if(Objects.equals(returnAdmin.getPassword(), admin.getPassword())){
                return true;
            };
        }
        return false;
    }
}

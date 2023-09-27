package com.p.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2023-09-25 14:50:02
 *
 */
@Data
public class Admin {
/**
     * 标识管理员的唯一id
     */

    private Integer adminid;
/**
     * 管理员账号
     */@TableId
    private String id;
/**
     * 登录密码
     */
    private String password;




}


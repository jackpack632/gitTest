package com.p.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Weather)表实体类
 *
 * @author makejava
 * @since 2023-09-26 16:30:39
 */
@Data
public class Weather {
//景区id
    @TableId
    private Integer spotId;
//天气信息
    private String weatherMsg;



}


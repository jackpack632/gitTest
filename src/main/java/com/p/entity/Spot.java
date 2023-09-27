package com.p.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Spot)表实体类
 *
 * @author makejava
 * @since 2023-09-26 16:29:31
 */
@SuppressWarnings("serial")
@Data
public class Spot  {
    @TableId
    private Integer spotId;

    private String spotName;

    private String spotImg;

    private String spotMsg;


}


package com.p.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


/**
 * (Route)表实体类
 *
 * @author makejava
 * @since 2023-09-26 16:23:11
 */
@SuppressWarnings("serial")
@Data
public class Route {
//路线id
    @TableId
    private Integer routeId;
//路线经过景点id
    private String spotsid;
//路线状态1/0(堵或不堵)
    private String routeState;

}


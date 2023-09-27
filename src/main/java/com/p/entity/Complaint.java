package com.p.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

/**
 * (Complaint)实体类
 *
 * @author makejava
 * @since 2023-09-22 10:12:57
 */
@Data
public class Complaint { /**
     * 投诉事件对应id
     */
@TableId
    private Integer thingid;
/**
     * 投诉内容
     */
    private String notion;
/**
     * 其他如照片视频等资料
     */
    private String other;
/**
     * 投诉游客id
     */
    private Integer visitor_id;
/**
     * 投诉时间
     */
    private Date time;
/**
     * 投诉状态  处理中/待处理/已完成
     */
    private String state;
/**
     * 投诉结果  null/投诉处理后的结果描述
     */
    private String result;
/**
     * 游客评价   null/内容
     */
    private String evaluate;

}


package com.p.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Msg  {
    //紧急信息id
    @TableId
    private Integer msg_id;
    //信息内容
    private String msg_notion;
    //信息状态 已发布/未发布
    private String msg_state;


}


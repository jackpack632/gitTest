package com.p.controller;


import com.p.entity.Msg;
import com.p.service.MsgService;
import com.p.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Msg)表控制层
 *
 * @author makejava
 * @since 2023-09-22 15:52:05
 */
@RestController
@RequestMapping("/EmergencyInfo")
public class MsgController  {
    @Autowired//?
    private MsgService msgService;
    @PostMapping
    public R save(@RequestBody Msg msg){
        return new R().success();
    }

}


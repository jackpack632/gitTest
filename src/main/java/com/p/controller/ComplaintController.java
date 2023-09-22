package com.p.controller;

import com.p.entity.Complaint;
import com.p.service.ComplaintService;
import com.p.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ComplaintSystem")
public class ComplaintController {
    @Autowired
    private ComplaintService complaintService;

    //接收表单数据
    @PostMapping
    public R save(@RequestBody Complaint complaint){
        return new R(complaintService.save(complaint));
    }
    @GetMapping
    public R list(){
        return new R(200,complaintService.list(),null);
    }
}

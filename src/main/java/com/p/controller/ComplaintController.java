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
        return new R().success();
    }
    @GetMapping
    public R list(){
        return new R().success(complaintService.list(),"查询成功");
    }
    @GetMapping("/{id}")
    public R get(@PathVariable("id") Integer id){
        return new R().success(complaintService.getById(id),"查询成功");
    }
}

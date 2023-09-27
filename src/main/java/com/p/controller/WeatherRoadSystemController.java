package com.p.controller;

import com.p.service.SpotService;
import com.p.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WeatherRoadSystem")
public class WeatherRoadSystemController {
    @Autowired
    private SpotService spotService;
    @GetMapping
    public R list(){
        return new R().success(spotService.list(),"查询成功");
    }
}

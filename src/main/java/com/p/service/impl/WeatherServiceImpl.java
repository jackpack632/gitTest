package com.p.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p.dao.WeatherDao;
import com.p.entity.Weather;
import com.p.service.WeatherService;
import org.springframework.stereotype.Service;

/**
 * (Weather)表服务实现类
 *
 * @author makejava
 * @since 2023-09-26 16:21:05
 */
@Service("weatherService")
public class WeatherServiceImpl extends ServiceImpl<WeatherDao, Weather> implements WeatherService {

}


package com.p.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p.dao.RouteDao;
import com.p.entity.Route;
import com.p.service.RouteService;
import org.springframework.stereotype.Service;

/**
 * (Route)表服务实现类
 *
 * @author makejava
 * @since 2023-09-26 16:21:05
 */
@Service("routeService")
public class RouteServiceImpl extends ServiceImpl<RouteDao, Route> implements RouteService {

}


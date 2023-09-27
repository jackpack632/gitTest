package com.p.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p.dao.SpotDao;
import com.p.entity.Spot;
import com.p.service.SpotService;
import org.springframework.stereotype.Service;

/**
 * (Spot)表服务实现类
 *
 * @author makejava
 * @since 2023-09-26 16:21:05
 */
@Service("spotService")
public class SpotServiceImpl extends ServiceImpl<SpotDao, Spot> implements SpotService {

}


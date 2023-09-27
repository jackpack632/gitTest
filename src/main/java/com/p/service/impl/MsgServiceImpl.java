package com.p.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p.dao.MsgDao;
import com.p.entity.Msg;
import com.p.service.MsgService;
import org.springframework.stereotype.Service;

/**
 * (Msg)表服务实现类
 *
 * @author makejava
 * @since 2023-09-22 15:52:05
 */
@Service
public class MsgServiceImpl extends ServiceImpl<MsgDao, Msg> implements MsgService {

}


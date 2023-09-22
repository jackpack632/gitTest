package com.p.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p.dao.ComplaintDao;
import com.p.entity.Complaint;
import com.p.service.ComplaintService;
import org.springframework.stereotype.Service;

@Service
public class ComplaintServiceImpl extends ServiceImpl<ComplaintDao, Complaint> implements ComplaintService {
}

package com.p.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTestCase {
    @Autowired
    protected ComplaintDao complaintDao;
    @Test
    public void test(){
        System.out.println(complaintDao.selectById(1));
    }
}

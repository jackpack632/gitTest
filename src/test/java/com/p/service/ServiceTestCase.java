package com.p.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTestCase {
    @Autowired
    protected ComplaintService complaintService;
    @Test
    public void test(){
        System.out.println(complaintService.getById(1));
    }
    @Test
    public void test2(){
        System.out.println(complaintService.list());
    }
}

package com.p;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

//@SpringBootTest
class TravelServerApplicationTests {
    private static final long expire=3600000L;//一个小时的有效期

    @Test
    public void jwtGenTest() {//生成jwt令牌
        HashMap<String, Object> claims=new HashMap<>();
        claims.put("id","123456");
        claims.put("name","张三");
        claims.put("role","admin");
        String jwt=Jwts.builder()//链式调用
                .signWith(SignatureAlgorithm.HS256,"123456")//签名算法，设置加密方式和密钥
                .setClaims(claims)//设置自定义数据
                .setExpiration(new Date(System.currentTimeMillis()+expire))//设置过期时间一个小时
                .compact();//压缩成一个字符串
        System.out.println(jwt);
    }
    @Test
    public void jwtParse(){//解析令牌
        Claims claims=Jwts.parser()
                .setSigningKey("123456")//设置解析密钥，和生成密钥一样
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJuYW1lIjoi5byg5LiJIiwiaWQiOiIxMjM0NTYiLCJleHAiOjE2OTU2MzU4NjR9.abkwUz49ZBUBFCGUxu_hFfgNySfJNwxGLnohqZP0dbk")//设置要解析的令牌
                .getBody();//获取解析后的数据
        System.out.println(claims);
    }

}

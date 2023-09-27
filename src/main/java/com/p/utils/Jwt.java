package com.p.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Jwt {
    private static final String signKey="penglinmao";
    private static final long expire=3600000;//一个小时的有效期
    public String create(Map<String, Object> claims){
        String jwt= Jwts.builder()//链式调用
                .signWith(SignatureAlgorithm.HS256,signKey)//签名算法，设置加密方式和密钥
                .setClaims(claims)//设置自定义数据
                .setExpiration(new Date(System.currentTimeMillis()+expire))//设置过期时间一个小时
                .compact();
        return jwt;
    }
    //解析令牌
    public static Claims parseJwt(String jwt){
        Claims claims= Jwts.parser()
                .setSigningKey(signKey)//设置解析密钥，和生成密钥一样
                .parseClaimsJws(jwt)//设置要解析的令牌
                .getBody();
        return claims;
    }
}

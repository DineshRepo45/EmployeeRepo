package com.dt.emp.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {
    private final String JWT_SECREAT="employee_secret_key";
    private  final  long JWT_EXPIRATION=86400000;
    public String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+JWT_EXPIRATION))
                .signWith(SignatureAlgorithm.HS512,JWT_SECREAT)
                .compact();
    }
    public String getUserName(String token){
        Claims claims=Jwts.parser()
                .setSigningKey(JWT_SECREAT)
                .parseClaimsJws(token)
                .getBody();
        return  claims.getSubject();
    }

    public boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(JWT_SECREAT).parseClaimsJws(token);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}

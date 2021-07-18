package com.api.seminar.security;

import com.api.seminar.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.List;

public class JwtUtils {

    private static final String SECRET = "secret";

    private static final long EXPIRATION = 60 * 60 * 1000L;

    private static final long EXPIRATION_REMEMBER = 7 * 60 * 60 * 1000L;

    public static String createToken(User user, List<String> roles, boolean isRemembered) {
        long expiration = isRemembered ? EXPIRATION_REMEMBER : EXPIRATION;
        return Jwts.builder()
                .claim("id", user.getId())
                .setSubject(user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    public static Claims getTokenBody(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();
    }
}

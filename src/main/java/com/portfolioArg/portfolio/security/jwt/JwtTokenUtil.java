package com.portfolioArg.portfolio.security.jwt;

import com.portfolioArg.portfolio.entitys.Usuario;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION=1*60*60*1000;

    @Value("${app.jwt.secret}")
    private String secretKey;

    public String generateAccesToken(Usuario usuario){
        return Jwts.builder()
                .setSubject(usuario.getId() + "," + usuario.getEmail())
                .setIssuer("MiPortfolio")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }
    public boolean validateAccessToken(String token){
        try{
            Jwts.parser().setSigningKey(secretKey).parseClaimsJwt(token);
            return true;
        }catch (ExpiredJwtException ex){
            LOGGER.error("Jwt expired", ex);
        }catch (IllegalArgumentException ex){
            LOGGER.error("Token is null, empty or has only whitespaces",ex);
        }catch (MalformedJwtException ex){
            LOGGER.error("Jwt is invalid", ex);
        }catch (UnsupportedJwtException ex){
            LOGGER.error("Jwt is not suported", ex);
        }

        return false;
    }

    public String getSubject(String token){
        return parseClaims(token).getSubject();
    }
    private Claims parseClaims(String token){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJwt(token)
                .getBody();
    }
}

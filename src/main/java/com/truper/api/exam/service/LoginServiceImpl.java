package com.truper.api.exam.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;

@Service
public class LoginServiceImpl implements ILoginService{
	
	@Value("${jwt.secret}")
	private String secret;

	@Override
	public Optional<String> getToken() {
		final Instant now = Instant.now();
		final String jwt = Jwts.builder()
				.setSubject("user@test.com")
				.setIssuedAt(Date.from(now))
				.setExpiration(Date.from(now.plus(1, ChronoUnit.DAYS)))
				.signWith(SignatureAlgorithm.HS256, TextCodec.BASE64.encode(secret))
				.compact();
		return Optional.of(jwt);
	}

}

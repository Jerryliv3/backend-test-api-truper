package com.truper.api.exam.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.util.Objects.isNull;

import static  com.truper.api.exam.common.GlobalConstant.SEC_API_LISTACOMPRAS;

import java.io.IOException;

@WebFilter(urlPatterns = SEC_API_LISTACOMPRAS)
public class JwtFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		final HttpServletRequest request = (HttpServletRequest) req;
		final HttpServletResponse response = (HttpServletResponse) res;
		String authHeader = request.getHeader("authorization");
		
		if (isNull(authHeader) || authHeader.startsWith("Bearer ")) {
			
		}
		
		
	}
	
	

}

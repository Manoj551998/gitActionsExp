package com.postApp.interceptor;

import java.io.IOException;
import java.net.CookieStore;
import java.sql.SQLException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.postApp.dao.postAppDAO;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter{
	postAppDAO dao= new postAppDAO();
	@Override
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws IOException, ClassNotFoundException, SQLException
	{
		Cookie cookie[]=req.getCookies();
		for(Cookie ck:cookie)
		{
			if(ck.getName().equals("email")&&dao.emailExist(ck.getValue()))
			{
				return true;
			}
		}
		res.sendRedirect("login");
		return false;
	}
	@Override
	public void postHandle(HttpServletRequest req,HttpServletResponse res,Object handler,ModelAndView modelAndView)
	{
		
	}
	@Override
	public void afterCompletion(HttpServletRequest req,HttpServletResponse res,Object handler,Exception ex)
	{
		
	}
}

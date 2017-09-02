package com.msc.test.springmvc.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/** 
 * 登录认证的拦截器 
 */
public class TestInterceptor implements HandlerInterceptor{
	 /** 
	  * Handler执行完成之后调用这个方法 
	  */
	 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception { 
		 System.out.println("执行afterCompletion");
	 } 
	  
	 /** 
	  * Handler执行之后，ModelAndView返回之前调用这个方法 
	  */
	 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception { 
		 System.out.println("执行postHandle");
	 } 
	  
	 /** 
	  * Handler执行之前调用这个方法 
	  */
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception { 
		 System.out.println("执行preHandle");
		 return true;
	 }
}

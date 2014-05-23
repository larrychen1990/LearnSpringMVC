package com.hawk.home.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorldInterceptor implements HandlerInterceptor  {
	private Log logger=LogFactory.getLog(getClass());
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        System.out.println("Pre-handle");

        return true;
    }

    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("Post-handle");
    }

    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("After completion handle");
        logger.info("infoDone");
        logger.debug("debugDone");
        logger.error("errorDone");
        logger.fatal("fatalDone");
        String result = "";
        response.getWriter().println(result);
        System.out.println(result);
    }
}
package com.zlikun.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/5/11 15:06
 */
@Controller
public class LogoutController extends ControllerBase {

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout (HttpServletRequest request, HttpServletResponse response) {
		logger.info("请求：{}" ,request.getRequestURI());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}
	
}

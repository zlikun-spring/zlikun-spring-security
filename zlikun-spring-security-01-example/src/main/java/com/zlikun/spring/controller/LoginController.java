package com.zlikun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/5/11 14:58
 */
@Controller
public class LoginController extends ControllerBase {

    /**
     * 去登录页
     * @param error
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView toLogin(HttpServletRequest request ,@RequestParam(value = "error", required = false) String error) {
        logger.info("请求：{}" ,request.getRequestURI());
        ModelAndView model = new ModelAndView("login");
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        return model;
    }

}

package com.zlikun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/5/11 15:06
 */
@Controller
public class IndexController extends ControllerBase {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        logger.info("请求：{}" ,request.getRequestURI());
        ModelAndView model = new ModelAndView("index");
        return model;
    }

}

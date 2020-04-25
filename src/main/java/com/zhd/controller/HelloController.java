package com.zhd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: HelloController
 * Package: com.zhd.controller
 * Desc:
 *
 * @Date: 2020/4/22 9:06
 * @authow: ZHD
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test1")
    public ModelAndView test1() throws UnsupportedEncodingException {
        System.out.println("hello");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","张三");
        modelAndView.addObject("age",15);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}

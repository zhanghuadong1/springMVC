package com.zhd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: RestfulController
 * Package: com.zhd.controller
 * Desc:
 *
 * @Date: 2020/4/23 14:20
 * @authow: ZHD
 */
@Controller
public class RestfulController {
    @RequestMapping("/testRestful/{id}")
    @ResponseBody
    public Integer testRestful(@PathVariable("id") Integer id ){
        System.out.println(id);
        return id;
    }
}

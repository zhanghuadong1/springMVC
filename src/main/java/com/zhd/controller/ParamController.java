package com.zhd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: ParamController
 * Package: com.zhd.controller
 * Desc:
 *
 * @Date: 2020/4/23 13:35
 * @authow: ZHD
 */
@Controller
public class ParamController {
    @RequestMapping("/testParams")
    @ResponseBody
    public Integer[] testParams(Integer[] params){
        System.out.println(params);
        return params;
    }
}

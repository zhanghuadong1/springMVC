package com.zhd.controller;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;
import com.zhd.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: TestResponseBodyController
 * Package: com.zhd.controller
 * Desc:
 *
 * @Date: 2020/4/23 13:19
 * @authow: ZHD
 */
@Controller
public class TestResponseBodyController {
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public Student testResponseBody(Student student){
        return student;
    }
}

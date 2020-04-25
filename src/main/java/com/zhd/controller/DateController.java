package com.zhd.controller;

import com.zhd.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: DateController
 * Package: com.zhd.controller
 * Desc:
 *
 * @Date: 2020/4/23 12:43
 * @authow: ZHD
 */
@Controller
public class DateController {
    @RequestMapping("/testDate")
    public String testDate(@ModelAttribute("stu") Student student){
        System.out.println(student.getUsername());
        System.out.println(student.getPassword());
        System.out.println(student.getCreateTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = simpleDateFormat.format(student.getCreateTime());
        System.out.println(date);
        return "date";
    }
}

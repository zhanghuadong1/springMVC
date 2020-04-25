package com.zhd.controller;

import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * ClassName: PicController
 * Package: com.zhd.controller
 * Desc:
 *
 * @Date: 2020/4/23 15:14
 * @authow: ZHD
 */
@Controller
public class PicController {
    @RequestMapping("/download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Disposition","attachment;filename="+fileName);
        Files.copy(Paths.get("E:\\upload\\2019-11-15","1.jpg"),response.getOutputStream());
    }
    @RequestMapping("/upload")
    public String upload(MultipartFile fileName,HttpServletRequest request) {
        String uuid = UUID.randomUUID().toString();
        String originalFilename = fileName.getOriginalFilename();
        //得到后缀jpg
        String extendName =
                originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        //拼接成新的名字
        String newName = uuid+extendName;
        //得到路径
        String realPath = request.getSession().getServletContext().getRealPath("upload");

        System.out.println(realPath);
        String datePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        File file = new File(realPath + "/" + datePath);
        if(!file.exists()){
            file.mkdirs();
            System.out.println("年号");
        }
        try {
            fileName.transferTo(new File(file,newName));
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}

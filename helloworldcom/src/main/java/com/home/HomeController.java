package com.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class HomeController {
    // 请求映射地址 http://localhost:8080/gitcode/test，其中 8080 为默认端口
    @RequestMapping(value = "/test")
    public String goTest(HttpServletRequest request) {
        System.out.println(23*23);
        // 输出请求 URL 路径
        System.out.println(request.getRequestURL());
        // 返回逻辑名
        return "index";
    }
}

package com.example.springbootservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @author: zhengfei.tan
 * @since: 2020/1/6 17:30
 * @history: 1.2020/1/6 created by zhengfei.tan
 */
@Controller
public class TestController {

    @GetMapping("/index")
    public String index () {
        return "index";
    }
}

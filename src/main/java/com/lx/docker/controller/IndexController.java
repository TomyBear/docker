package com.lx.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liux
 * @create 2019-07-17 15:48
 **/
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "hello docker";
    }
}

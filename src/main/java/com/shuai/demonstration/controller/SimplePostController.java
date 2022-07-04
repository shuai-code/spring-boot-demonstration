package com.shuai.demonstration.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangs
 */
@RestController
public class SimplePostController {

    /**
     * 默认参数为接口地址
     * */
    @PostMapping("/add/user")
    public String add1(String name) {
        return name;
    }

    /**
     * 指定接口的名称(value)
     * */
    @PostMapping(value = "/add/user", name = "添加用户")
    public String add2(String name) {
        return name;
    }

    /**
     * 指定接口的名称(path)
     * path和value如果同时配置, 则必须保持一致, 否则报错
     * */
    @PostMapping(path = "/add/user", name = "添加用户")
    public String add3(String name) {
        return name;
    }

    /**
     * 指定接口的名称
     * */
    @PostMapping(value = "/add/user", name = "添加用户")
    public String add4(@RequestBody String name) {
        return name;
    }

//    /**
//     * 指定接口的名称
//     * */
//    @PostMapping(value = "/add/user", name = "添加用户")
//    public String add4(@RequestBody String name) {
//        return name;
//    }
//
//    /**
//     * 指定接口的名称
//     * */
//    @PostMapping(value = "/add/user", name = "添加用户")
//    public String add6(@RequestParam String name) {
//        return name;
//    }
}

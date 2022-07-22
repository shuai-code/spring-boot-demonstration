package com.shuai.demonstration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Yangs
 */
@Slf4j
@RestController
public class RestFulUserController {

    /**
     * POST 用于创建资源,每次请求都会添加一个新资源
     * value和path同时配置时,内容必须一直
     */
    @PostMapping(value = "/add/user", name = "添加用户")
    public String add(String name) {
        return name;
    }

    /**
     * GET 用于获取资源, 不会对资源产生影响
     */
    @GetMapping("/get/user")
    public String getUser(Integer id) {
        return "1";
    }

    /**
     * DELETE 用于删除一个资源
     */
    @DeleteMapping("/remove/user")
    public String removeUser(Integer id) {
        return "";
    }
}

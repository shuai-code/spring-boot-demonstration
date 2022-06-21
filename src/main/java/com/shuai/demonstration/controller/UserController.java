package com.shuai.demonstration.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Yangs
 */
@RestController
public class UserController {

    /**
     * POST
     * value he path one
     */
    @PostMapping(value = "/add/user", path = "/add/user", name = "add User")
    public String addUser(String name) {
        return name;
    }

    /**
     * GET
     */
    @GetMapping("/get/user")
    public String getUser() {
        return "1";
    }

    /**
     * GET and POST
     */
    @RequestMapping("/user")
    public String queryUser() {
        return "1";
    }

    @DeleteMapping("/remove/user")
    public String removeUser(String name) {
        return "";
    }

    @PutMapping("/put/user")
    public String putUser(String name) {
        return "";
    }

    @PatchMapping("/patch/user")
    public String patchUser(String name) {
        return "";
    }
}

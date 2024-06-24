package com.apiweb.ApiWeb.controller;

import com.apiweb.ApiWeb.entity.Users;
import com.apiweb.ApiWeb.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    List<Users> create(@RequestBody Users users) {
        return userService.create(users);
    }

    @GetMapping
    List<Users> list() {
        return userService.list();
    }
}

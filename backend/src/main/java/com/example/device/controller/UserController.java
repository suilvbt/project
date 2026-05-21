package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("")
    public Object listUsers() { return null; }

    @PostMapping("")
    public Object addUser() { return null; }

    @GetMapping("/{id}")
    public Object getUser(@PathVariable Integer id) { return null; }

    @PutMapping("/{id}")
    public Object updateUser(@PathVariable Integer id) { return null; }

    @DeleteMapping("/{id}")
    public Object deleteUser(@PathVariable Integer id) { return null; }
}

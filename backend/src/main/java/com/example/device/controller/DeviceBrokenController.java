package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device-broken")
public class DeviceBrokenController {
    @GetMapping("")
    public Object listBrocken() { return null; }

    @PostMapping("")
    public Object addBroken() { return null; }
}

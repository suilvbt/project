package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device-borrow-return")
public class DeviceBorrowReturnController {
    @GetMapping("")
    public Object listBorrowReturns() { return null; }

    @PostMapping("/borrow")
    public Object borrowDevice() { return null; }

    @PostMapping("/return")
    public Object returnDevice() { return null; }
}

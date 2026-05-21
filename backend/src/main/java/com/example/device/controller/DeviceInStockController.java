package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device-instock")
public class DeviceInStockController {
    @GetMapping("")
    public Object listInStocks() { return null; }

    @PostMapping("")
    public Object addInStock() { return null; }
}

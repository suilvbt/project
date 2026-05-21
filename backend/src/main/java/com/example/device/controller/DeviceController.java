package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device")
public class DeviceController {
    @GetMapping("")
    public Object listDevices() { return null; }

    @PostMapping("")
    public Object addDevice() { return null; }

    @GetMapping("/{id}")
    public Object getDevice(@PathVariable Integer id) { return null; }

    @PutMapping("/{id}")
    public Object updateDevice(@PathVariable Integer id) { return null; }

    @DeleteMapping("/{id}")
    public Object deleteDevice(@PathVariable Integer id) { return null; }
}

package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device-category")
public class DeviceCategoryController {
    @GetMapping("")
    public Object listCategories() { return null; }

    @PostMapping("")
    public Object addCategory() { return null; }

    @GetMapping("/{id}")
    public Object getCategory(@PathVariable Integer id) { return null; }

    @PutMapping("/{id}")
    public Object updateCategory(@PathVariable Integer id) { return null; }

    @DeleteMapping("/{id}")
    public Object deleteCategory(@PathVariable Integer id) { return null; }
}

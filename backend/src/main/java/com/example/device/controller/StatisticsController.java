package com.example.device.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {
    // 统计各种类型设备的数量
    @GetMapping("/device-category-count")
    public Object getDeviceCategoryCount() { return null; }

    // 统计指定月份设备领用归还情况
    @GetMapping("/device-borrow-return/monthly")
    public Object getDeviceMonthlyBorrowReturn(@RequestParam String month) { return null; }
}

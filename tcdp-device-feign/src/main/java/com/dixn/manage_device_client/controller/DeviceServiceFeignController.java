package com.dixn.manage_device_client.controller;

import com.dixn.manage_device_client.service.DeviceServiceFeignInterface;
import com.dixn.model.domain.device.response.DevicePageResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/device")
public class DeviceServiceFeignController {

    @Resource
    DeviceServiceFeignInterface deviceServiceFeignInterface;

    @GetMapping("/queryByParam")
    public DevicePageResult getDate(@RequestParam String param ) {
        return deviceServiceFeignInterface.process(param);
    }
}

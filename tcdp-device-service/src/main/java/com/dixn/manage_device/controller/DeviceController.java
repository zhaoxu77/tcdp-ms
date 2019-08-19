package com.dixn.manage_device.controller;

import com.dixn.api.device.DeviceServiceApi;
import com.dixn.model.domain.device.Device;
import com.dixn.model.domain.device.response.DevicePageResult;
import com.dixn.common.model.response.CommonCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DeviceController implements DeviceServiceApi {
    /*@Value("${server.port}")
    String port;

    @RequestMapping("/process")
    public String process() {
        return "hi " + ",i am from port:" + port;
    }*/
    @Override
    @GetMapping("/api/device/queryByParam")
    public DevicePageResult process(String param) {
        String info = "hi " + ",i am from port:" + param;
        Device device = new Device();
        device.setId("1");
        device.setName(info);
        device.setCreateTime(new Date());
        DevicePageResult responseResult = new DevicePageResult(CommonCode.SUCCESS, device);
        return responseResult;
    }
}

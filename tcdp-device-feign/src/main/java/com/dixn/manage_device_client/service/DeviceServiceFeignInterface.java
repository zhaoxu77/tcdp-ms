package com.dixn.manage_device_client.service;

import com.dixn.api.device.DeviceServiceApi;
import com.dixn.manage_device_client.hystrix.DeviceServiceApiHystrix;
import com.dixn.model.domain.device.response.DevicePageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "tcdp-device-service" , fallback = DeviceServiceApiHystrix.class)
public interface DeviceServiceFeignInterface extends DeviceServiceApi {
    @GetMapping("/api/device/queryByParam")
    DevicePageResult process(@RequestParam("param") String param);
}

package com.dixn.manage_device_client.hystrix;

import com.dixn.common.model.response.CommonCode;
import com.dixn.manage_device_client.service.DeviceServiceFeignInterface;
import com.dixn.model.domain.device.Device;
import com.dixn.model.domain.device.response.DevicePageResult;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class DeviceServiceApiHystrix implements DeviceServiceFeignInterface {

    @Override
    public DevicePageResult process(String param) {
        Device device = new Device();
        device.setId("1");
        device.setName("进入到Hystric");
        device.setCreateTime(new Date());
        DevicePageResult devicePageResult = new DevicePageResult(CommonCode.FAIL, device);
        return devicePageResult;
    }
}

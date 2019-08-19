package com.dixn.model.domain.device.response;

import com.dixn.model.domain.device.Device;
import com.dixn.common.model.response.ResponseResult;
import com.dixn.common.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DevicePageResult extends ResponseResult {
    Device device;
    public DevicePageResult(ResultCode resultCode, Device device) {
        super(resultCode);
        this.device = device;
    }
}
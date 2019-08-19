package com.dixn.api.device;

import com.dixn.model.domain.device.response.DevicePageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;


@Api(value = "设备管理接口", tags = "设备管理接口")
public interface DeviceServiceApi {
    @ApiOperation(value = "设备查询")
    @ApiImplicitParams({@ApiImplicitParam(name="param",value="查询参数",required=true)})
    DevicePageResult process(@RequestParam("param") String param);
}

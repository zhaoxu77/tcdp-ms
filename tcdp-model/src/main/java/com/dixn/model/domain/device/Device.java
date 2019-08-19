package com.dixn.model.domain.device;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
public class Device {
    private String id;
    private String name;
    private Date createTime;
}

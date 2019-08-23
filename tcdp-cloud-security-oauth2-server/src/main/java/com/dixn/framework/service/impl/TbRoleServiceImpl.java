package com.dixn.framework.service.impl;

import com.dixn.framework.mapper.TbRoleMapper;
import com.dixn.framework.service.TbRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}

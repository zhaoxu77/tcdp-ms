package com.dixn.framework.service.impl;

import com.dixn.framework.domain.TbPermission;
import com.dixn.framework.mapper.TbPermissionMapper;
import com.dixn.framework.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}

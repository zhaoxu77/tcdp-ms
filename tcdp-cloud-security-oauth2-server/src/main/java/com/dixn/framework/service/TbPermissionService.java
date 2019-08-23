package com.dixn.framework.service;


import com.dixn.framework.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}

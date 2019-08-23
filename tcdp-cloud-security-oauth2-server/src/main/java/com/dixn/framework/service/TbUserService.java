package com.dixn.framework.service;


import com.dixn.framework.domain.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}

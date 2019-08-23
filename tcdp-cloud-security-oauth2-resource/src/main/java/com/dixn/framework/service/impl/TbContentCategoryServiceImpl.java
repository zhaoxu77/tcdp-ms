package com.dixn.framework.service.impl;

import com.dixn.framework.mapper.TbContentCategoryMapper;
import com.dixn.framework.service.TbContentCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}

package com.spring.dubbo.service;

import com.spring.dubbo.bean.RoleBean;
import com.spring.dubbo.exception.ServiceException;

public interface RoleService {
    //录入角色
    public int insertRole(RoleBean roleBean) throws ServiceException;
}

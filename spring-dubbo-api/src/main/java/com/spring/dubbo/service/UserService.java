package com.spring.dubbo.service;

import com.spring.dubbo.bean.UserBean;
import com.spring.dubbo.exception.ServiceException;

public interface UserService {
    //录入用户数据
    public int insertUser(UserBean userBean) throws ServiceException;
}

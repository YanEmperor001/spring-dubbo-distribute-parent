package com.spring.dubbo.service.impl;

import com.spring.dubbo.bean.UserBean;
import com.spring.dubbo.dao.UserMapper;
import com.spring.dubbo.exception.ServiceException;
import com.spring.dubbo.model.User;
import com.spring.dubbo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = ServiceException.class)
    public int insertUser(UserBean userBean) throws ServiceException {
        User user = new User();
        if (null != userBean) {
            BeanUtils.copyProperties(userBean, user);
        }
        int result = userMapper.insertSelective(user);
        if (result != 1) {
            throw new ServiceException("用户录入异常！");
        }
        return result;
    }
}

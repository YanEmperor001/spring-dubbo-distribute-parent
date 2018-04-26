package com.spring.dubbo.service.impl;

import com.spring.dubbo.bean.RoleBean;
import com.spring.dubbo.bean.UserBean;
import com.spring.dubbo.dao.RoleMapper;
import com.spring.dubbo.exception.ServiceException;
import com.spring.dubbo.model.Role;
import com.spring.dubbo.service.RoleService;
import com.spring.dubbo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.serial.SerialException;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserService userService;

    @Override
    @Transactional(rollbackFor = SerialException.class)
    public int insertRole(RoleBean roleBean) throws ServiceException {
        Role role = new Role();
        if (null != roleBean) {
            BeanUtils.copyProperties(roleBean, role);
        }
        int result = roleMapper.insertSelective(role);
        UserBean userBean = new UserBean();
        userBean.setUsername("郭靖");
        userBean.setPassword("是德国");
        userBean.setAge(28);
        int userResult = userService.insertUser(userBean);
        if(result != 1 && userResult != 1) {
            throw new ServiceException("录入角色失败！");
        }
        return result;
    }
}

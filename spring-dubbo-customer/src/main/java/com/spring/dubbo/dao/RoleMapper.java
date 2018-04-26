package com.spring.dubbo.dao;

import com.spring.dubbo.model.Role;
import org.springframework.stereotype.Component;

@Component("roleMapper")
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}
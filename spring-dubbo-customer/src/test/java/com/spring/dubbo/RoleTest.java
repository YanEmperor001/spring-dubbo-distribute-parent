package com.spring.dubbo;

import com.spring.dubbo.bean.RoleBean;
import com.spring.dubbo.exception.ServiceException;
import com.spring.dubbo.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {
    public static void main(String[] args) throws ServiceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:application.xml");
        RoleService roleService = (RoleService) ctx.getBean("roleService");
        RoleBean roleBean = new RoleBean();
        roleBean.setRolename("社长");
        roleService.insertRole(roleBean);
    }
}

package com.spring.dubbo;

import com.spring.dubbo.bean.UserBean;
import com.spring.dubbo.exception.ServiceException;
import com.spring.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) throws ServiceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:application.xml");
        /*UserService userService = (UserService) ctx.getBean("userService");
        UserBean userBean = new UserBean();
        userBean.setUsername("蝈蝈");
        userBean.setPassword("654321");
        userBean.setAge(27);
        userService.insertUser(userBean);*/
    }
}

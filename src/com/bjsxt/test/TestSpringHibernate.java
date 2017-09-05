package com.bjsxt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.bjsxt.service.impl.UserServiceImpl;

/**
 * @author:jwzhang
 * @date:2017年9月4日下午3:10:16
 */
public class TestSpringHibernate {

	public static void main(String[] args) {
		//	如何拿到spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("application-spring.xml");
		// 	取得容器 中的对象
		//	在spring核心配置文件中添加一个标签<aop:aspectj-autoproxy proxy-target-class="true"/> 表示的是基于类代理。cglib
//		UserServiceImpl userService = (UserServiceImpl) ac.getBean("userServiceImpl");
		//	基于接口的动态代理-jdk动态代理.
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		List<User> list = userService.fingAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
}

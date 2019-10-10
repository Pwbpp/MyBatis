package com.peng.sm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.peng.sm.dao.Customermapper;
import com.peng.sm.domain.Customer;
import com.peng.sm.service.CustomerService;

public class MyBatisSpringTest {
	
	@Test
	public void test() {
		//加载spring配置
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//获取对象
//		Customermapper c = (Customermapper)applicationContext.getBean("customermapper");
//		//调用方法

		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		
		Customer customer = new Customer();
		customer.setName("英语老师");
		customer.setGender("女");
		customer.setTelephone("2656-1681-474");
		customer.setAddress("深圳莲花山");
		customerService.saveCustomer(customer);
	}

}

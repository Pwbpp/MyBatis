package com.peng.sm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.peng.sm.dao.Customermapper;
import com.peng.sm.domain.Customer;

public class MyBatisSpringTest {
	
	@Test
	public void test() {
		//加载spring配置
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		Customermapper c = (Customermapper)applicationContext.getBean("customerMapper");
		//调用方法
		Customer customer = new Customer();
		customer.setName("语文老师");
		customer.setGender("女");
		customer.setTelephone("2123-2645474");
		customer.setAddress("深圳宝体");
		c.saveCustomer(customer);
		
	}

}

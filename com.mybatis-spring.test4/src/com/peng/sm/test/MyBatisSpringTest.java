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
		Customermapper c = (Customermapper)applicationContext.getBean("customermapper");
		//调用方法
		Customer customer = new Customer();
		customer.setName("数学老师");
		customer.setGender("男");
		customer.setTelephone("21681-474");
		customer.setAddress("深圳中心书城");
		c.saveCustomer(customer);
		
	}

}

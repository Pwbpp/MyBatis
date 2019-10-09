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
		customer.setName("副班主任");
		customer.setGender("女");
		customer.setTelephone("23333-4784654");
		customer.setAddress("深圳宝安中心");
		c.saveCustomer(customer);
		
	}

}

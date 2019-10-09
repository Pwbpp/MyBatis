package com.peng.sm.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.peng.sm.dao.Customermapper;
import com.peng.sm.domain.Customer;

public class MyBatis{

	
	@Test
	public void test() throws IOException {
		//创建SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder(); 
		//加载sqlMapConfig.xml文件
		InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = builder.build(is);
		//打开SqlSession
		SqlSession sqlSession = factory.openSession();
		//获取Mapper接口对象
		Customermapper customerMapping = sqlSession.getMapper(Customermapper.class);
		//操作
		Customer customer = new Customer();
		customer.setName("班主任");
		customer.setGender("女");
		customer.setTelephone("253-4894654");
		customer.setAddress("深圳湾");
		customerMapping.saveCustomer(customer);
		//提交事务
		sqlSession.commit();
		//关闭资源
		sqlSession.close();
	}

}




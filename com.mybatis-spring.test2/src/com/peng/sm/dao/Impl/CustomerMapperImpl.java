package com.peng.sm.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.peng.sm.dao.Customermapper;
import com.peng.sm.domain.Customer;

public class CustomerMapperImpl extends SqlSessionDaoSupport implements Customermapper {

	public void saveCustomer(Customer customer) {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.insert("saveCustomer",customer);
		//不需要事务提交
		
	}

}

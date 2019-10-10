package com.peng.sm.service.Imple;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.peng.sm.dao.Customermapper;
import com.peng.sm.domain.Customer;
import com.peng.sm.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//注入Mapper对象
	@Resource
	private Customermapper customermapper;
	
	public void saveCustomer(Customer customer) {
		customermapper.saveCustomer(customer);
		//异常 
		int i=100/0;
		customermapper.saveCustomer(customer);
	}

}

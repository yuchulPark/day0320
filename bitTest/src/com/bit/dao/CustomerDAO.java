package com.bit.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.CustomerManager;
import com.bit.vo.CustomerVO;

@Repository
public class CustomerDAO {
	public List<CustomerVO> listAll(HashMap<String, String> map){
		return CustomerManager.listAll(map);
	}
	public CustomerVO getCustomer(int custid) {
        return CustomerManager.getCustomer(custid);
    }
	public int insertCustomer(CustomerVO c) {
		return CustomerManager.insertCustomer(c);
	}
	public int deleteCustomer(int custid) {
		return CustomerManager.deleteCustomer(custid);
	}
	public int updateCustomer(CustomerVO c) {
		return CustomerManager.updateCustomer(c);
	}

}

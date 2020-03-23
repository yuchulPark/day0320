package com.bit.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.CustomerManager;
import com.bit.voo.CustomerVO;

@Repository // 의존관계 자동으로 생성. 다오가 심플한 이유 : xml설정파일에 둬서
public class CustomerDAO {
	public List<CustomerVO> list(HashMap map){
		return CustomerManager.listAll(map); // customerManager가 statiC이니 객체 없이 사용 가능함
	}
	public CustomerVO getCustomer(int custid) {
		return CustomerManager.getCustomer(custid);
	}
	public int insertCustomer(CustomerVO c) {
		return CustomerManager.insertCustomer(c);
	}
	public int updateCustomer(CustomerVO c) {
		return CustomerManager.updateCustomer(c);
	}
	public int deleteCustomer(int custid) {
		return CustomerManager.deleteCustomer(custid);
	}
}

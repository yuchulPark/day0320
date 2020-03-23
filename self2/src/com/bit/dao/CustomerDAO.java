package com.bit.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.CustomerManager;
import com.bit.voo.CustomerVO;

@Repository // �������� �ڵ����� ����. �ٿ��� ������ ���� : xml�������Ͽ� �ּ�
public class CustomerDAO {
	public List<CustomerVO> list(HashMap map){
		return CustomerManager.listAll(map); // customerManager�� statiC�̴� ��ü ���� ��� ������
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

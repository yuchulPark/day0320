package com.bit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.CustomerManager;
import com.bit.vo.CustomerVO;

@Repository
public class CustomerDAO {
	public List<CustomerVO> listAll(){
		return CustomerManager.listAll();
	}
}

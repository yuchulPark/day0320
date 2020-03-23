package com.bit.dao;

import org.springframework.stereotype.Repository;

import com.bit.db.OrdersManager;
import com.bit.vo.OrdersVO;

@Repository
public class OrdersDAO {
	public int insertOrders(OrdersVO o) {
		return OrdersManager.insertOrders(o);
	}
}

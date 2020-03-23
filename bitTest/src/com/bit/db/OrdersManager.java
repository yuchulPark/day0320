package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.vo.BookVO;
import com.bit.vo.OrdersVO;

public class OrdersManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static int insertOrders(OrdersVO o) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.insert("orders.insert",o);
		session.commit();
		session.close();
		return re;
	}
}

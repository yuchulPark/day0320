package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.CustomerVO;

public class CustomerManager {
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
	public static List<CustomerVO> listAll(HashMap map){
		SqlSession session = factory.openSession(); // 권한을 얻어옴
		List<CustomerVO> list = session.selectList("customer.selectAll",map); // 아까의 id이름. customer에 있는 selectAll
		session.close();
		return list;
	}
	public static CustomerVO getCustomer(int custid) {
        SqlSession session = factory.openSession();
        CustomerVO c= session.selectOne("customer.detail", custid);
        session.close();
        return c;
    }
	public static int insertCustomer(CustomerVO c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("customer.insert", c);
		session.commit(); // 안 적으면 반영이 안 됨
		session.close();
		return re;
	}
	public static int deleteCustomer(int custid) {
		int re = -1;
		SqlSession session = factory.openSession(); // factory.openSession(true);로 지정하면 밑에 session.commit();를 안써도 되지만 (자동으로 커밋 되므로) 권장하지는 않음
		re = session.delete("customer.delete",custid);
		session.commit();
		session.close();
		return re;
	}
	public static int updateCustomer(CustomerVO c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.update("customer.update",c);
		session.commit();
		session.close();
		return re;
	}
}

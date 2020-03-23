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
		SqlSession session = factory.openSession(); // ������ ����
		List<CustomerVO> list = session.selectList("customer.selectAll",map); // �Ʊ��� id�̸�. customer�� �ִ� selectAll
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
		session.commit(); // �� ������ �ݿ��� �� ��
		session.close();
		return re;
	}
	public static int deleteCustomer(int custid) {
		int re = -1;
		SqlSession session = factory.openSession(); // factory.openSession(true);�� �����ϸ� �ؿ� session.commit();�� �Ƚᵵ ������ (�ڵ����� Ŀ�� �ǹǷ�) ���������� ����
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

package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.voo.CustomerVO;


public class CustomerManager { // dao�� xml���̿��� ���������� �ϴ� Ŭ����
	private static SqlSessionFactory factory;
	// xml�� id�� ��û�� �� �ִ� �����. static ����� ��ü�� �������� �ʾƵ� ����ȴٴ� ��
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml"); // ������ �о���� ������ ���. xml�� �ִ� ��ġ
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static List<CustomerVO> listAll(HashMap map){
		SqlSession session = factory.openSession(); // ������ ����
		List<CustomerVO> list = session.selectList("customer.listAll", map); // �Ʊ��� id�̸�. customer�� �ִ� listAll
		session.close();
		return list;
	}
	public static CustomerVO getCustomer(int custid) {
		SqlSession session = factory.openSession();
		CustomerVO c = session.selectOne("customer.detail",custid);
		session.close();
		return c;
	}
	public static int insertCustomer(CustomerVO c) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.insert("customer.insert",c);
		session.commit();
		session.close();
		return re;
	}
	public static int updateCustomer(CustomerVO c) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.update("customer.update",c);
		session.commit();
		session.close();
		return re;
	}
	public static int deleteCustomer(int custid) {
		int re = -1;
		SqlSession session = factory.openSession(); // factory.openSession(true);�� �����ϸ� �ؿ� session.commit();�� �Ƚᵵ ������ (�ڵ� Ŀ�ԵǹǷ�) ���������� ����
		re = session.delete("customer.delete",custid);
		session.commit();
		session.close();
		return re;
	}
}

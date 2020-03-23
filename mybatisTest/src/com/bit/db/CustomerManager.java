package com.bit.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.CustomerVO;

public class CustomerManager { // dao�� xml���̿��� ���������� �ϴ� Ŭ����
	private static SqlSessionFactory factory;  // xml�� id�� ��û�� �� �ִ� �����. static ����� ��ü�� �������� �ʾƵ� ����ȴٴ� ��.
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static List<CustomerVO> listAll(){
		SqlSession session = factory.openSession();
		List<CustomerVO> list = session.selectList("customer.selectAll"); // ���̵� �̸�
		session.close();
		return list;
	}
}

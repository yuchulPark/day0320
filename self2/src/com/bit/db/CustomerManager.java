package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.voo.CustomerVO;


public class CustomerManager { // dao와 xml사이에서 교량역할을 하는 클래스
	private static SqlSessionFactory factory;
	// xml의 id를 요청할 수 있는 담당자. static 블락은 객체를 생성하지 않아도 실행된다는 뜻
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml"); // 파일을 읽어들일 파일의 경로. xml이 있는 위치
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static List<CustomerVO> listAll(HashMap map){
		SqlSession session = factory.openSession(); // 권한을 얻어옴
		List<CustomerVO> list = session.selectList("customer.listAll", map); // 아까의 id이름. customer에 있는 listAll
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
		SqlSession session = factory.openSession(); // factory.openSession(true);로 지정하면 밑에 session.commit();를 안써도 되지만 (자동 커밋되므로) 권장하지는 않음
		re = session.delete("customer.delete",custid);
		session.commit();
		session.close();
		return re;
	}
}

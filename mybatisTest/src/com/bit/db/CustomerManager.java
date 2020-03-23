package com.bit.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.CustomerVO;

public class CustomerManager { // dao와 xml사이에서 교량역할을 하는 클래스
	private static SqlSessionFactory factory;  // xml의 id를 요청할 수 있는 담당자. static 블락은 객체를 생성하지 않아도 실행된다는 뜻.
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
		List<CustomerVO> list = session.selectList("customer.selectAll"); // 아이디 이름
		session.close();
		return list;
	}
}

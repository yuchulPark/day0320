package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.voo.BookVO;

public class BookManager {
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
	public static List<BookVO> listAll(HashMap map){
		SqlSession session = factory.openSession();
		List<BookVO> list = session.selectList("book.selectAll", map);
		session.close();
		return list;
	}
	public static int insertBook(BookVO b) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.insert("book.insert",b);
		session.commit();
		session.close();
		return re;
	}
	public static BookVO getBook(int bookid) {
		SqlSession session = factory.openSession();
		BookVO b = session.selectOne("book.detail",bookid);
		session.close();
		return b;
	}
	public static int updateBook(BookVO b) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.update("book.update",b);
		session.commit();
		session.close();
		return re;
	}
	public static int deleteBook(int bookid) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.delete("book.delete",bookid);
		session.commit();
		session.close();
		return re;
	}
}

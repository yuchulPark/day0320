package com.bit.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.BookManager;
import com.bit.voo.BookVO;

@Repository
public class BookDAO {
	public List<BookVO> listAll(HashMap map){
		return BookManager.listAll(map);
	}
	public int insertBook(BookVO b) {
		return BookManager.insertBook(b);
	}
	public int updateBook(BookVO b) {
		return BookManager.updateBook(b);
	}
	public int deleteBook(int bookid) {
		return BookManager.deleteBook(bookid);
	}
	public BookVO getBook(int bookid) {
		return BookManager.getBook(bookid);
	}
}

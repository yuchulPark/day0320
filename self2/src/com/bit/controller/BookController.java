package com.bit.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDAO;
import com.bit.voo.BookVO;

@Controller
public class BookController {
	@Autowired
	private BookDAO dao;
	public void setDao(BookDAO dao) {
		this.dao = dao;
	}
	@RequestMapping(value="/listBook.do")
	public ModelAndView listAll(String keyword, String searchColumn, String sortColumn, HttpSession session) {
		HashMap map = new HashMap();
		
		if(keyword == null) {
			keyword = (String)session.getAttribute("keyword");
			searchColumn = (String)session.getAttribute("searchColumn");
		}
		
		map.put("keyword", keyword);
		map.put("searchColumn", searchColumn);
		map.put("sortColumn", sortColumn);
		
		session.setAttribute("keyword", keyword);
		session.setAttribute("searchColumn", searchColumn);
		
		
		ModelAndView m = new ModelAndView();
		m.addObject("list",dao.listAll(map));
		return m;
	}
	@RequestMapping(value="/insertBook.do", method=RequestMethod.GET)
	public void insertForm() {
	}
	@RequestMapping(value="/insertBook.do", method=RequestMethod.POST)
	public ModelAndView insertSubmit(BookVO b) {
		ModelAndView m = new ModelAndView();
		int re = dao.insertBook(b);
		if(re > 0) {
			m.setViewName("redirect:/listBook.do");
		}else {
			m.addObject("msg","등록 실패");
		}
		return m;
	}
	@RequestMapping(value="/detailBook.do")
	public ModelAndView detailBook(int bookid) {
		ModelAndView m = new ModelAndView();
		m.addObject("b",dao.getBook(bookid));
		return m;
	}
	@RequestMapping(value="/updateBook.do", method=RequestMethod.GET)
	public ModelAndView updateForm(int bookid) {
		ModelAndView m = new ModelAndView();
		m.addObject("b",dao.getBook(bookid));
		return m;
	}
	@RequestMapping(value="/updateBook.do", method=RequestMethod.POST)
	public ModelAndView updateSubmit(BookVO b) {
		ModelAndView m = new ModelAndView();
		int re = dao.updateBook(b);
		if(re > 0) {
			m.setViewName("redirect:/listBook.do");
		}else {
			m.addObject("msg","수정 실패");
		}
		return m;
	}
	@RequestMapping(value="/deleteBook.do")
	public ModelAndView deleteBook(int bookid) {
		ModelAndView m = new ModelAndView();
		int re = dao.deleteBook(bookid);
		if(re > 0) {
			m.setViewName("redirect:/listBook.do");
		}else {
			m.addObject("msg","삭제 실패");
		}
		return m;
	}
}

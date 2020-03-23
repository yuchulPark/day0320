package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bit.dao.BookDAO;
import com.bit.vo.BookVO;

@Controller
public class BookController {
	private BookDAO dao;
	public void setDao(BookDAO dao) {
		this.dao = dao;
	}
	@RequestMapping("/listBook.do")
	public ModelAndView listBook() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listBook");
		mav.addObject("list",dao.listBook());
		return mav;
	}
}

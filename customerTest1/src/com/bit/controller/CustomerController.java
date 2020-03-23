package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDAO;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDAO dao;
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}
	@RequestMapping("/listCustomer.do")
	public ModelAndView listCustomer() {
		ModelAndView m = new ModelAndView();
		m.addObject("list",dao.listCustomer());
		m.setViewName("listCustomer"); // 동일한 경로일때니깐 생략 가능
		return m;
	}
	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) { // 상세보기
		ModelAndView m = new ModelAndView();
		m.addObject("vo",dao.getCustomer(custid));
		return m;
	}
}

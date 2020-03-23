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
	public ModelAndView list() {
		ModelAndView m = new ModelAndView();
		m.addObject("list",dao.listAll());
		return m;
	}
}

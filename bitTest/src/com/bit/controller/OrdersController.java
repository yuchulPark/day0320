package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDAO;
import com.bit.dao.CustomerDAO;
import com.bit.dao.OrdersDAO;
import com.bit.vo.OrdersVO;

@Controller
public class OrdersController {
	@Autowired
	private OrdersDAO oDao;
	@Autowired
	private BookDAO bDao;
	@Autowired
	private CustomerDAO cDao;
	public void setoDao(OrdersDAO oDao) {
		this.oDao = oDao;
	}
	public void setbDao(BookDAO bDao) {
		this.bDao = bDao;
	}
	public void setcDao(CustomerDAO cDao) {
		this.cDao = cDao;
	} 
	@RequestMapping(value="/insertOrders.do", method=RequestMethod.GET)
	public ModelAndView insertForm() {
		ModelAndView m = new ModelAndView();
		m.addObject("cList",cDao.listAll(null));
		m.addObject("bList",bDao.listAll(null));
		return m;
	}
	@RequestMapping(value="/insertOrders.do", method=RequestMethod.POST)
	public ModelAndView insertSubmit(OrdersVO o) {
		ModelAndView m = new ModelAndView();
		int re = oDao.insertOrders(o);
		if(re > 0) {
			m.addObject("re",re);
		}
		return m;
	}
}

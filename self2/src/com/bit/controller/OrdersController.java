package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDAO;
import com.bit.dao.CustomerDAO;
import com.bit.dao.OrdersDAO;
import com.bit.voo.OrdersVO;

@Controller
public class OrdersController {
	@Autowired
	private CustomerDAO cdao;
	@Autowired
	private BookDAO bdao;
	@Autowired
	private OrdersDAO odao;
	public void setCdao(CustomerDAO cdao) {
		this.cdao = cdao;
	}
	public void setBdao(BookDAO bdao) {
		this.bdao = bdao;
	}
	public void setOdao(OrdersDAO odao) {
		this.odao = odao;
	}
	@RequestMapping(value="/insertOrders.do", method=RequestMethod.GET)
	public ModelAndView insertForm() {
		ModelAndView m = new ModelAndView();
		m.addObject("cList",cdao.list(null));
		m.addObject("bList",bdao.listAll(null));
		return m;
	}
	@RequestMapping(value="/insertOrders.do", method=RequestMethod.POST)
	public ModelAndView insertSubmit(OrdersVO o) {
		ModelAndView m = new ModelAndView();
		int re = odao.insertOrders(o);
		if(re > 0) {
			m.addObject("re",re);
		}
		return m;
	}
}

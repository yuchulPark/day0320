package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bit.dao.CustomerDAO;
import com.bit.vo.CustomerVO;

@Controller 
public class InsertCustomerController { 
	@Autowired
	private CustomerDAO dao;
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}
	@RequestMapping(value="/insertCustomer.do", method=RequestMethod.GET)
	public void form() { 
	}
	@RequestMapping(value="/insertCustomer.do", method=RequestMethod.POST)
	public ModelAndView sumbit(CustomerVO vo) { // 받아올 VO
		ModelAndView m = new ModelAndView();
		int re = dao.insertCustomer(vo);
		if(re > 0) {
			m.setViewName("redirect:/listCustomer.do");
		}else {
			m.addObject("msg","고객 등록에 실패");
		}
		return m;
	}
}

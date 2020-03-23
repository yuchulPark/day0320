package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDAO;
import com.bit.vo.CustomerVO;

@Controller
public class ModifyCustomerController {
	@Autowired
	private CustomerDAO dao;
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}
	@RequestMapping(value="/updateCustomer.do", method=RequestMethod.GET)
	public ModelAndView form(int custid) {	
		ModelAndView m = new ModelAndView();
		m.addObject("vo",dao.getCustomer(custid));
		return m;
	}
	@RequestMapping(value="/updateCustomer.do", method=RequestMethod.POST)
	public ModelAndView submit(CustomerVO vo) {
		ModelAndView m = new ModelAndView();
		int re = dao.updateCustomer(vo);
		if(re > 0) {
			m.setViewName("redirect:/listCustomer.do");
		}else {
			m.addObject("msg","수정 실패");
		}
		return m;
	}
	@RequestMapping(value="/deleteCustomer.do")
	public ModelAndView del(int custid) {
		ModelAndView m = new ModelAndView();
		int re = dao.deleteCustomer(custid);
		if(re > 0) {
			m.setViewName("redirect:/listCustomer.do");
		}else {
			m.addObject("msg","삭제 실패");
		}
		return m;
	}
}

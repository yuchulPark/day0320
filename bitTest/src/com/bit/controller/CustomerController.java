package com.bit.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDAO;
import com.bit.vo.CustomerVO;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDAO dao;
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}
	@RequestMapping(value="/updateCustomer.do", method=RequestMethod.GET)
	public ModelAndView updateForm(int custid) {
		ModelAndView m = new ModelAndView();
		m.addObject("c",dao.getCustomer(custid));
		return m;
	}
	@RequestMapping(value="/updateCustomer.do", method=RequestMethod.POST)
	public ModelAndView updateSubmit(CustomerVO c) {
		ModelAndView m = new ModelAndView();
		int re = dao.updateCustomer(c);
		if(re > 0) {
			m.setViewName("redirect:/listCustomer.do");
		}else {
			m.addObject("msg","수정 실패");
		}
		return m;
	}
	@RequestMapping(value="/insertCustomer.do", method=RequestMethod.GET)
	public void insertForm() {
	}
	@RequestMapping(value="/insertCustomer.do", method=RequestMethod.POST)
	public ModelAndView insertSubmit(CustomerVO c) { // 매개변수의 이름 : command object
		ModelAndView m = new ModelAndView();
		int re = dao.insertCustomer(c);
		if(re > 0) {
			m.setViewName("redirect:/listCustomer.do");
		}else {
			m.addObject("msg","고객 등록 실패");
		}
		return m;
	}
	@RequestMapping("/listCustomer.do")
	public ModelAndView listCustomer(String all, String keyword, String searchColumn, String sortColumn, HttpSession session) {
		System.out.println("검색어 : " + keyword);
		// 세션에 담긴 검색어가 우선순위보다 새로 검색한 검색어가 우선순위가 더 높음
		// 키워드 값이 null이면 예전에 수행된 keyword값과 searchColumn값을 불러온다. 밑에서 null이 아니면 keyword, searchColumn에 새로운 값을 저장한다.
		if(keyword == null) {
			keyword = (String)session.getAttribute("keyword");
			searchColumn = (String)session.getAttribute("searchColumn");
		}
		if(all != null) {
			keyword = null;
			searchColumn = null;
		}
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchColumn", searchColumn);
		map.put("sortColumn", sortColumn);
		session.setAttribute("keyword", keyword);
		session.setAttribute("searchColumn", searchColumn);
		
		ModelAndView m = new ModelAndView();
		m.addObject("list",dao.listAll(map));
		return m;
	}
	@RequestMapping("/detailCustomer.do")
    public ModelAndView getCustomer(int custid) {
        ModelAndView m = new ModelAndView();
        m.addObject("c", dao.getCustomer(custid));
        return m;
    }
	@RequestMapping("/deleteCustomer.do")
	public ModelAndView deleteCustomer(int custid, HttpSession session) {
		ModelAndView m = new ModelAndView();
		m.setViewName("redirect:/listCustomer.do");
		int re = dao.deleteCustomer(custid);
		if(re <= 0) {
			// m.addObject("msg","삭제 실패");
			session.setAttribute("msg", "고객 삭제 실패");
		}
		return m;
	}
}

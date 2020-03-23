package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("hello.do") // ��û �̸��� ���� (����ڰ� ��û �̸��� �Է��ϸ� ������)
	public ModelAndView hello() {
		ModelAndView m = new ModelAndView();
		m.setViewName("hello");
		m.addObject("msg","�ȳ��ϼ���."); // model�� �����ϱ� ���� object
		return m;
	}
}

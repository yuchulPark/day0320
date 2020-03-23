package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("hello.do") // 요청 이름을 적음 (사용자가 요청 이름을 입력하면 동작함)
	public ModelAndView hello() {
		ModelAndView m = new ModelAndView();
		m.setViewName("hello");
		m.addObject("msg","안녕하세요."); // model을 설정하기 위한 object
		return m;
	}
}

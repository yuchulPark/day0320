package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("listMember.do")
	public ModelAndView listMember() {
		ModelAndView m = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("¹Ú");
		list.add("ÀÌ");
		list.add("±è");
		list.add("ÇÏ");
		list.add("°¡");
		m.addObject("list",list);
		return m;
	}
	@RequestMapping("hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("msg","¾È³çÇÏ¼¼¿ä");
		return mav;
	}
}

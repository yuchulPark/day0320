package com.bit.exam0308.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.exam0308.member.Member;
import com.bit.exam0308.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	// member에 대한 요청이 왔으면 밑에꺼를 다 받은다음에 service의 memberRegister를 호출
	
//	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
//	public String memJoin(Model model, HttpServletRequest request) {
//		String memId = request.getParameter("memId");
//		String memPw = request.getParameter("memPw");
//		String memMail = request.getParameter("memMail");
//		String memPhone1 = request.getParameter("memPhone1");
//		String memPhone2 = request.getParameter("memPhone2");
//		String memPhone3 = request.getParameter("memPhone3");
//		
//		service.memberRegister(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
//		
//		model.addAttribute("memId",memId);
//		model.addAttribute("memPw",memPw);
//		model.addAttribute("memMail",memMail);
//		model.addAttribute("memPhone",memPhone1 + " - " + memPhone2 + " - " + memPhone3);
//		
//		return "memJoinOk";
//	}
	
	// 위에 코딩을 더욱 간추리는 방법
//	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
//	public String memJoin(Member member) {
//		service.memberRegister(member.getMemId(), member.getMemPw(), member.getMemMail(), 
//				member.getMemPhone1(), member.getMemPhone2(), member.getMemPhone3());
//		return "memJoinOk";
//	}
	
	// 닉네임을 새로 정하는 방법, 더욱 간추린 방법
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
	public String memJoin(@ModelAttribute("m") Member member) {
		service.memberRegister(member);
		return "memJoinOk";
	}
	
//	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
//	public String memLogin(Model model, @RequestParam("memId") String memId, @RequestParam("memPw") String memPw) {
//		// String memId = request.getParameter("memId");
//		// String memPw = request.getParameter("memPw");
//		
//		Member member = service.memberSearch(memId, memPw);
//		
//		try {
//			model.addAttribute("memId", member.getMemId());
//			model.addAttribute("memPw", member.getMemPw());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return "memLoginOk";
//	}
	 // 위를 이렇게 써도 됨 (오류나는듯?)
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public String memLogin(Member member) {
		service.memberSearch(member);
		return "memLoginOk";
	}
	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		return dateFormat.format(date);
	}
	@RequestMapping(value="/memRemove", method=RequestMethod.POST)
	public String memRemove(@ModelAttribute("m") Member member) {
		service.memberRemove(member);
		return "memRemoveOk";
	}
//	@RequestMapping(value="/memModify", method=RequestMethod.POST)
//	public String memModify(Model model, Member member) {
//		Member[] members = service.memberModify(member);
//		model.addAttribute("memBefore", members[0]);
//		model.addAttribute("memAfter", members[1]);
//		return "memModifyOk";
//	}
	// 위를 이렇게 써도됨
	@RequestMapping(value="/memModify", method=RequestMethod.POST)
	public ModelAndView memModify(Member member) {
		ModelAndView m = new ModelAndView();
		Member[] members = service.memberModify(member);
		m.addObject("memBefore", members[0]);
		m.addObject("memAfter", members[1]);
		return m;
	}
}

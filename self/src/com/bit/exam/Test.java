package com.bit.exam;

import java.sql.Connection;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		WriterArticleServiceImpl ws = (WriterArticleServiceImpl)context.getBean("ws");
		ws.pro();
		
		/* spring MVC의 주요 구성 요소
		
		DispatcherServelet - 클라이언트의 요청을 전달받아 컨트롤러에게 클라이언트의 요청을 전달하고 컨트롤러가 리턴한 결과값을 view에 전달하여 알맞은 응답을 생성하도록 함
		HandlerMapping - 클라이언트의 요청 URL을 어떤 컨트롤러가 처리할지를 결정
		컨트롤러 (controller) - 클라이언트의  요청을 처리한뒤, 그 결과를 DispatcherServlet에게 알려준다.
							- 스트럿츠의 action과 동일한 역할을 수행
		ModelAndView - 컨트롤러가 처리한 결과 정보 및 뷰 선택에 필요한 정보를 담는다.
		ViewResolver - 컨트롤러의 처리 결과를 생성할 뷰를 결정
		뷰 (view) 컨트롤러의 처리 결과 화면을 생성
		
		
		
		
		
		
		*/
	}
}

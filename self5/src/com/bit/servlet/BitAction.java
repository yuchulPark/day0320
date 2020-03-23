package com.bit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BitAction {
	public String proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException; 
	/*
	 Front controller에 의해서 호출될 일처리 담당자인 모든 Action들이 일처리를 위하여 오버라이딩 해야할 메소드를 proRequest로 일반화합니다.
	 앞으로 만들어질 일처리 담당자들은 모두 BitAction의 후손이 되도록 하려고 합니다. 이 메소드는 FrontController에 의해 호출될 것이므로 사용자 요청이 담긴 request와 응답을 위한 response를 매개변수로 갖도록 함.
	 즉, 서블릿의 doGet, doPost 메소드의 시그너처와 (head) 동일하게 설정
	 
	 */
}

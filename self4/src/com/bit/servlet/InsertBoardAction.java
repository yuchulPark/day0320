package com.bit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertBoardAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int no = 0; //  부모글의 글번호
		String head = "새글 작성";
		if(request.getParameter("no") != null) {
			no = Integer.parseInt(request.getParameter("no"));
			head = "답글 작성"; // title은 생략
		}
		request.setAttribute("head", head);
		request.setAttribute("no", no);
		
		return "insertBoard.jsp";
	}

}

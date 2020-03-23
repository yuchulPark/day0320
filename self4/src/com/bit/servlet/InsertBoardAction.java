package com.bit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertBoardAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int no = 0; //  �θ���� �۹�ȣ
		String head = "���� �ۼ�";
		if(request.getParameter("no") != null) {
			no = Integer.parseInt(request.getParameter("no"));
			head = "��� �ۼ�"; // title�� ����
		}
		request.setAttribute("head", head);
		request.setAttribute("no", no);
		
		return "insertBoard.jsp";
	}

}

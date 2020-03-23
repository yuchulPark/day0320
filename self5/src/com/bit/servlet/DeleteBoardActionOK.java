package com.bit.servlet;

import java.io.File;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDAO;


public class DeleteBoardActionOK implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDAO dao = new BoardDAO();
		String path = request.getRealPath("upload");
		System.out.println(path);
		
		
		int no = Integer.parseInt(request.getParameter("no"));
		String pwd = request.getParameter("pwd");
		String oldFname = dao.detailBoard(no).getFname();
		int re = dao.deleteBoard(no, pwd);
		if(re > 0) {
			if(oldFname != null) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
		}
		request.setAttribute("re", re);
		return "deleteBoard.jsp";
	}

}

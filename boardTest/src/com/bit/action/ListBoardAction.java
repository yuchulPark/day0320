package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDao;

public class ListBoardAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String path = request.getRealPath("upload");
		System.out.println(path);
		
		
		int pageNUM = 1;
		if(request.getParameter("pageNUM")!= null) {
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		
		BoardDao dao = new BoardDao();
		request.setAttribute("list",dao.listAll(pageNUM));
		return "listBoard.jsp";
	}
}












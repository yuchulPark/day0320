package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDao;
import com.bit.vo.BoardVo;

public class DetailBoardAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();
		BoardVo b =  dao.getBoard(no);
		request.setAttribute("b",b);
		request.setAttribute("isImg", dao.isImage(b.getFname()));
		return "detailBoard.jsp";
	}

}








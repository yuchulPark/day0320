package com.bit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDAO;
import com.bit.vo.BoardVO;
import com.oreilly.servlet.MultipartRequest;

public class InsertBoardActionOK implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String path = request.getRealPath("upload");
		System.out.println(path);
		MultipartRequest m = new MultipartRequest(request,path,"utf-8");
		BoardVO b = new BoardVO();
		b.setNo(Integer.parseInt(m.getParameter("no"))); // 새로 등록하려는 글번호가 아니라 부모 글번호
		b.setTitle(m.getParameter("title"));
		b.setWriter(m.getParameter("writer"));
		b.setPwd(m.getParameter("pwd"));
		b.setContent(m.getParameter("content"));
		b.setFname(m.getOriginalFileName("fname"));
		b.setIp(request.getRemoteAddr());
		
		BoardDAO dao = new BoardDAO();
		int re = dao.insertBoard(b);
		if(re > 0) {
			request.setAttribute("msg", "성공");
		}else {
			request.setAttribute("msg", "실패");
		}
		return "insertBoardOK.jsp";
	}

}

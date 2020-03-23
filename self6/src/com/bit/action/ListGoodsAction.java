package com.bit.action;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.BitAction;
import com.bit.dao.GoodsDAO;


public class ListGoodsAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getRealPath("img");
		System.out.println(path);
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		GoodsDAO dao = new GoodsDAO();
		request.setAttribute("list", dao.listAll(pageNUM));
		request.setAttribute("totalPage",dao.totalPage);
		
		return "listGoods.jsp";
	}

}

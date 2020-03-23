package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.BitAction;
import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;
import com.oreilly.servlet.MultipartRequest;

public class InsertGoodsActionOK implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getRealPath("img");
		System.out.println(path);
		MultipartRequest m = new MultipartRequest(request,path,"utf-8");
		GoodsVO vo = new GoodsVO();
		vo.setItem(m.getParameter("item"));
		vo.setPrice(Integer.parseInt(m.getParameter("price")));
		vo.setQty(Integer.parseInt(m.getParameter("qty")));
		vo.setFname(m.getOriginalFileName("fname"));
		vo.setDetail(m.getParameter("detail"));
		GoodsDAO dao = new GoodsDAO();
		int re = dao.insertGoods(vo);
		request.setAttribute("re", re);
		return "insertGoodsOK.jsp";
	}

}

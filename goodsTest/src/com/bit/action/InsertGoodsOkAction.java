package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;
import com.bit.vo.GoodsVo;
import com.oreilly.servlet.MultipartRequest;

public class InsertGoodsOkAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getRealPath("img");
		request.setCharacterEncoding("utf-8");
		MultipartRequest multi = new MultipartRequest(request, path, "utf-8");
		GoodsVo g = new GoodsVo();
		g.setItem(multi.getParameter("item"));
		g.setPrice(Integer.parseInt(multi.getParameter("price")));
		g.setQty(Integer.parseInt(multi.getParameter("qty")));
		g.setFname(multi.getOriginalFileName("fname"));
		g.setDetail(multi.getParameter("detail"));
		
		GoodsDao dao = new GoodsDao();
		int re = dao.insertGoods(g);
		request.setAttribute("re", re);
		return "insertGoodsOk.jsp";
	}

}









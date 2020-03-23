package com.bit.action;

import java.io.File;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.BitAction;
import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;
import com.oreilly.servlet.MultipartRequest;


public class UpdateGoodsActionOK implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GoodsDAO dao = new GoodsDAO();
		String path = request.getRealPath("img");
		System.out.println(path);
		request.setCharacterEncoding("utf-8");
		MultipartRequest m = new MultipartRequest(request,path,"utf-8");
		GoodsVO vo = new GoodsVO();
		int no = Integer.parseInt(m.getParameter("no"));
		String oldFname = dao.getGoods(no).getFname();
		String fname = m.getOriginalFileName("fname");
		
		vo.setNo(no);
		vo.setItem(m.getParameter("item"));
		vo.setPrice(Integer.parseInt(m.getParameter("price")));
		vo.setQty(Integer.parseInt(m.getParameter("qty")));
		vo.setFname(oldFname);
		vo.setDetail(m.getParameter("detail"));
		if(fname != null) {
			vo.setFname(fname);
		}
		int re = dao.updateGoods(vo);
		if(re > 0) {
			if(fname != null) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
		}
		request.setAttribute("re", re);
		return "updateGoodsOK.jsp";
	}

}

package com.bit.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;

public class DeleteGoodsAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDao dao  = new GoodsDao();
		String oldFname = dao.getGoods(no).getFname();
		String path = request.getRealPath("img");
		int re =dao.deleteGoods(no);
		if(re > 0) {
			File file = new File(path + "/" + oldFname);
			file.delete();
		}
		
		request.setAttribute("re", re);
		
		return "deleteGoodsOk.jsp";
		
	}

}










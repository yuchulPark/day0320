package com.bit.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;
import com.bit.vo.GoodsVo;
import com.oreilly.servlet.MultipartRequest;

public class UpdateGoodsOkAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				GoodsDao dao = new GoodsDao();
				String path = request.getRealPath("img");
				request.setCharacterEncoding("utf-8");
				MultipartRequest multi = new MultipartRequest(request, path, "utf-8");
				GoodsVo g = new GoodsVo();
				int no  = Integer.parseInt(multi.getParameter("no"));
				String oldFname = dao.getGoods(no).getFname();
				String fname = multi.getOriginalFileName("fname");
				
				g.setNo(no);
				g.setItem(multi.getParameter("item"));
				g.setPrice(Integer.parseInt(multi.getParameter("price")));
				g.setQty(Integer.parseInt(multi.getParameter("qty")));
				g.setFname(oldFname);
				g.setDetail(multi.getParameter("detail"));
				if(fname != null) {
					g.setFname(fname);
				}
				
				
				int re = dao.updateGoods(g);
				if(re > 0) {
					if(fname != null) {
						File file = new File(path+"/"+oldFname);
						file.delete();
					}
				}
				
				request.setAttribute("re", re);
				return "updateGoodsOk.jsp";
	}

}








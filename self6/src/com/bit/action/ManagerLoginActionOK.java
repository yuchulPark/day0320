package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.BitAction;

public class ManagerLoginActionOK implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		if(id.equals("manager") && pwd.equals("manager")) {
			request.getSession().setAttribute("manager", "ok");
		}
		return "managerLoginOK.jsp";
	}

}

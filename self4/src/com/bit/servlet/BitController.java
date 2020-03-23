package com.bit.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BitController
 */
@WebServlet("*.do") // ��� do �����϶� �����ϵ��� ����
public class BitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<String, BitAction> map = new HashMap<String, BitAction>();
    // ������� ��û�� ��ó�� ����ڸ� map�� ��� (��ó�� ��� if�� ���� ���� ��ȿ����)
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BitController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	@Override
	public void init() throws ServletException {
		// map�� ������� ��û�� ��ó�� ����� ��ü�� �����Ͽ� ����
		map.put("/insertBoard.do", new InsertBoardAction()); // new InsertBoardAction ��ü�� �����ϼ� ����
		map.put("/InsertBoardOK.do", new InsertBoardActionOK());
		map.put("/listBoard.do", new ListBoardAction());
		map.put("/detailBoard.do", new DetailBoardAction());
		map.put("/deleteBoard.do", new DeleteBoardAction());
		map.put("/deleteBoardOK.do", new DeleteBoardActionOK());
	}

	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get���� ���ų� post�� ���ų� ������ ó���� �ϱ� ���Ͽ� �޼ҵ� ����
		//String url = request.getRequestURL().toString();
		//System.out.println(url);
		// url�� http���� �� ��������, uri�� ���� context���� (���ø����̼� �̸�) ��û�� ������ �������
		String uri = request.getRequestURI();
		System.out.println(uri);
		String cmd = uri.substring(uri.lastIndexOf("/")); // ��ġ�� �˷���
		System.out.println(cmd);
		String view = "";
		if(cmd.equals("/listBoard.do")) {
			view = "listBoard.jsp";
		}else if(cmd.equals("/insertBoard.do")) {
			view = "insertBoard.jsp";
		}else if(cmd.equals("/insertBoardOK.do")) {
			view = "insertBoardOK.jsp";
		}else if(cmd.equals("/deleteBoard.do")) {
			view = "deleteBoard.jsp";
		}
		BitAction action = map.get(cmd); // ��ó�� ����ڰ� ������ BitAction�� action��ü�� ���
		view = action.proRequest(request, response); // ���� ���������� view�� ����
		
		RequestDispatcher r = request.getRequestDispatcher(view);
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request,response); // ������ ó���ϱ����ؼ�
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request,response); // ������ ó���ϱ����ؼ�
	}

}

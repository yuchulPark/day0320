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
@WebServlet("*.do") // 모든 do 패턴일때 동작하도록 설정
public class BitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<String, BitAction> map = new HashMap<String, BitAction>();
    // 사용자의 요청별 일처리 담당자를 map에 등록 (밑처럼 계속 if를 쓰는 것은 비효율적)
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BitController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	@Override
	public void init() throws ServletException {
		// map의 사용자의 요청별 일처리 담당자 객체를 생성하여 담음
		map.put("/insertBoard.do", new InsertBoardAction()); // new InsertBoardAction 객체를 생성하서 담음
		map.put("/InsertBoardOK.do", new InsertBoardActionOK());
		map.put("/listBoard.do", new ListBoardAction());
		map.put("/detailBoard.do", new DetailBoardAction());
		map.put("/deleteBoard.do", new DeleteBoardAction());
		map.put("/deleteBoardOK.do", new DeleteBoardActionOK());
	}

	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get으로 오거나 post로 오거나 동일한 처리를 하기 위하여 메소드 설정
		//String url = request.getRequestURL().toString();
		//System.out.println(url);
		// url은 http부터 다 가져오고, uri는 현재 context부터 (어플리케이션 이름) 요청한 정보를 가지고옴
		String uri = request.getRequestURI();
		System.out.println(uri);
		String cmd = uri.substring(uri.lastIndexOf("/")); // 위치를 알려줌
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
		BitAction action = map.get(cmd); // 일처리 담당자가 조상인 BitAction의 action객체에 담김
		view = action.proRequest(request, response); // 어디로 가야할지를 view에 넣음
		
		RequestDispatcher r = request.getRequestDispatcher(view);
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request,response); // 동일한 처리하기위해서
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request,response); // 동일한 처리하기위해서
	}

}

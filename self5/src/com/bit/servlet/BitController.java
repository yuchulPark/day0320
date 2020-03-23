package com.bit.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		String path = config.getServletContext().getRealPath("WEB-INF"); // WEB-INF에 파일이 있음
		try {
			FileReader fr = new FileReader(path + "/bit.properties");
			Properties p = new Properties(); // properties에 있는 파일을 처리해줌
			p.load(fr);
			Set set = p.keySet(); // set 안에 서비스명이 담겨있는 상태. key를 집어넣음
			
			Iterator i = set.iterator();
			while(i.hasNext()) { // 하나씩 뽑아올 수 있는 루프를 돌 수 있는 상태. for로는 못하고, i에 있는 값들을 하나씩 가져올 것
				String key = (String)i.next(); // key를 가져옴
				String clsName = (String)p.get(key); // 클래스를 담당할 액션 클래스 이름
				map.put(key, (BitAction)Class.forName(clsName).newInstance());
				// 클래스 이름을 알면 객체 생성이 가능함. newInstance가 클래스의 객체를 생성해주는 기능
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    
    
//	@Override
//	public void init() throws ServletException {
//		// map의 사용자의 요청별 일처리 담당자 객체를 생성하여 담음
//		map.put("/insertBoard.do", new InsertBoardAction()); // new InsertBoardAction 객체를 생성하서 담음
//		map.put("/InsertBoardOK.do", new InsertBoardActionOK());
//		map.put("/listBoard.do", new ListBoardAction());
//		map.put("/detailBoard.do", new DetailBoardAction());
//		map.put("/deleteBoard.do", new DeleteBoardAction());
//		map.put("/deleteBoardOK.do", new DeleteBoardActionOK());
//	}

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
//		if(cmd.equals("/listBoard.do")) {
//			view = "listBoard.jsp";
//		}else if(cmd.equals("/insertBoard.do")) {
//			view = "insertBoard.jsp";
//		}else if(cmd.equals("/insertBoardOK.do")) {
//			view = "insertBoardOK.jsp";
//		}else if(cmd.equals("/deleteBoard.do")) {
//			view = "deleteBoard.jsp";
//		}
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

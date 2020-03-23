package com.bit.controller;

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
@WebServlet("*.do")
public class BitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HashMap<String, BitAction> map = new HashMap<String, BitAction>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BitController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿이 가동될때 딱 한번만 동작하는 메소드 : init
		String path = config.getServletContext().getRealPath("WEB-INF");
		try {
			FileReader fr = new FileReader(path + "/bit.properties");
			Properties p = new Properties(); // 프로퍼티 파일을 읽기에 용이함
			p.load(fr);
			
			Set set = p.keySet(); // 키를 뽑아옴
			Iterator i = set.iterator();
			while(i.hasNext()) {
				String key = (String)i.next();
				String clsName = (String)p.get(key);
				//System.out.println("요청명 : " + key);
				//System.out.println("클래스명 : " + clsName);
				
				Object obj = Class.forName(clsName).newInstance(); // 객체를 생성해줌
				//System.out.println("생성된 객체 : " + obj);
				map.put(key, (BitAction)obj);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")); // 서비스명 뽑음
		BitAction action = map.get(cmd);
		String view = action.proRequest(request, response);
		request.setAttribute("viewPage", view);
			
		RequestDispatcher r = request.getRequestDispatcher(view);
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request,response);
	}

}

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
		// ������ �����ɶ� �� �ѹ��� �����ϴ� �޼ҵ� : init
		String path = config.getServletContext().getRealPath("WEB-INF");
		try {
			FileReader fr = new FileReader(path + "/bit.properties");
			Properties p = new Properties(); // ������Ƽ ������ �б⿡ ������
			p.load(fr);
			
			Set set = p.keySet(); // Ű�� �̾ƿ�
			Iterator i = set.iterator();
			while(i.hasNext()) {
				String key = (String)i.next();
				String clsName = (String)p.get(key);
				//System.out.println("��û�� : " + key);
				//System.out.println("Ŭ������ : " + clsName);
				
				Object obj = Class.forName(clsName).newInstance(); // ��ü�� ��������
				//System.out.println("������ ��ü : " + obj);
				map.put(key, (BitAction)obj);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")); // ���񽺸� ����
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

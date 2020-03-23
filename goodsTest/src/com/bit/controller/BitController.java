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

import com.bit.action.BitAction;

// Controller�� ��üȭ �մϴ�.
// viewPage���� �ۼ��Ͽ� ����� Ȯ���մϴ�.


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
		// TODO Auto-generated method stub
//		super.init(config);
		
		String path = config.getServletContext().getRealPath("WEB-INF");
		try {
			FileReader fr = new FileReader(path + "/bit.properties");
			Properties prop = new Properties();
			prop.load(fr);
			Set set = prop.keySet();
			Iterator iter = set.iterator();
			while(iter.hasNext()) {
				String key = (String)iter.next();
				String clsName = (String)prop.get(key);
				System.out.println("��û��:"+key);
				System.out.println("Ŭ������:"+clsName);
				
				Object obj = Class.forName(clsName).newInstance();
				System.out.println("������ ��ü:"+obj);
				map.put(key, (BitAction)obj);
				System.out.println("-------------------------------------------");
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}





	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}

	
	private void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/"));
		BitAction action = map.get(cmd);
		String view = action.proRequest(request, response);
		request.setAttribute("viewPage", view);
		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}

}









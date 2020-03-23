package com.bit.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ManagerFilter
 */
@WebFilter(urlPatterns = {"/insertGoods.do","/insertGoodsOk.do","/updateGoods.do","/updateGoodsOk.do","/deleteGoods.do"})
public class ManagerFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ManagerFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		System.out.println("�����ڷ� �α��� �ߴ��� �˻��ϴ� �����Դϴ�.");
		
		// �����ڷ� �α����ߴ��� �ľ��Ͽ� 
		// �����ڰ� ������(���ǰ��� �ִ���) ��û�� ���񽺷� ������.
		if(   ((HttpServletRequest)request).getSession().getAttribute("manager") != null      ) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}else {
			//�׷��� �ʴٸ�(���ǰ��� ���ٸ�) ������ �α��� ���ߴٸ�
			// ������ �α��� ���� ȭ������ ������.
			((HttpServletResponse)response).sendRedirect("managerLogin.do");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

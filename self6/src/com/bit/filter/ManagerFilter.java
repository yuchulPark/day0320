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
@WebFilter(urlPatterns = {"/insertGoods.do","/insertGoodsOK.do","/updateGoods.do","/updateGoodsOK.do","/deleteGoods.do"}) // ���Ϳ� ������ ��. �̷� ��û�϶��� �Ŵ��� ���Ͱ� ����
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
		System.out.println("�����ڷ� �α����ߴ��� �˻��ϴ� ����"); // �����ڷ� �α��� �ߴ��� �ľ��Ͽ� �����ڰ� ������ (���ǰ��� �ִ��� �ľ��Ͽ�) ��û�� ���񽺷� ����.
		if(((HttpServletRequest)request).getSession().getAttribute("manager") != null) { // ServletRequest���� HttpServletRequest�� �� �θ���. ����ȯ ĳ���� ��
			chain.doFilter(request, response); // ���ǿ� �Ŵ��� ������ �������� (�α����� ���°� Ȯ�εǾ����� �� �ڵ��� ��������)
		}else { // ���ǿ� ���� ����. �����ڰ� �α����� �������� ������ �α��� ���� ȭ������ ����
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

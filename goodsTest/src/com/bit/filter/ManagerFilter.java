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

		System.out.println("관리자로 로그인 했는지 검사하는 필터입니다.");
		
		// 관리자로 로그인했는지 파악하여 
		// 관리자가 맞으면(세션값이 있는지) 요청한 서비스로 보내요.
		if(   ((HttpServletRequest)request).getSession().getAttribute("manager") != null      ) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}else {
			//그렇지 않다면(세션값이 없다면) 관리자 로그인 안했다면
			// 관리자 로그인 위한 화면으로 보내요.
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

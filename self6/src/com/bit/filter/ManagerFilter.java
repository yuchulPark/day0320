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
@WebFilter(urlPatterns = {"/insertGoods.do","/insertGoodsOK.do","/updateGoods.do","/updateGoodsOK.do","/deleteGoods.do"}) // 필터에 제한을 줌. 이런 요청일때는 매니저 필터가 동작
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
		System.out.println("관리자로 로그인했는지 검사하는 필터"); // 관리자로 로그인 했는지 파악하여 관리자가 맞으면 (세션값이 있는지 파악하여) 요청한 서비스로 보냄.
		if(((HttpServletRequest)request).getSession().getAttribute("manager") != null) { // ServletRequest보다 HttpServletRequest가 더 부모임. 형변환 캐스팅 함
			chain.doFilter(request, response); // 세션에 매니저 변수가 있을때만 (로그인한 상태가 확인되었을때 이 코딩을 만나게함)
		}else { // 세션에 값이 없음. 관리자가 로그인을 안했을때 관리자 로그인 위한 화면으로 보냄
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

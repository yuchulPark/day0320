/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-17 15:16:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodsList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.active{\r\n");
      out.write("\t\tbackground: yellow;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#btn\").click(function(){\r\n");
      out.write("\t\t\tvar arr;\r\n");
      out.write("\t\t\tvar today = new Date();\r\n");
      out.write("\t\t\t$.ajax(\"GoodsServlet\", {success:function(data){\r\n");
      out.write("\t\t\t\tarr = data;\r\n");
      out.write("\t\t\t\t// var arr = eval(\"(\"+data+\")\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.each(arr, function(idx, g){\r\n");
      out.write("\t\t\t\t\tvar td1 = $(\"<td></td>\").html(g.no)\r\n");
      out.write("\t\t\t\t\tvar td2 = $(\"<td></td>\").html(g.item)\r\n");
      out.write("\t\t\t\t\tvar tr = $(\"<tr></tr>\").attr(\"idx\",idx)\r\n");
      out.write("\t\t\t\t\t$(tr).append(td1, td2)\r\n");
      out.write("\t\t\t\t\t$(\"#tb\").append(tr)\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(tr).click(function(){\r\n");
      out.write("\t\t\t\t\t\t$(\"tr\").removeClass(\"active\")\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass(\"active\")\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar idx = $(this).attr(\"idx\")\r\n");
      out.write("\t\t\t\t\t\tvar goods = arr[idx]\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#img\").attr(\"src\",goods.fname)\r\n");
      out.write("\t\t\t\t\t\t$(\"#no\").html(goods.no)\r\n");
      out.write("\t\t\t\t\t\t$(\"#item\").html(goods.item)\r\n");
      out.write("\t\t\t\t\t\t$(\"#qty\").html(goods.qty)\r\n");
      out.write("\t\t\t\t\t\t$(\"#price\").html(goods.price)\r\n");
      out.write("\t\t\t\t\t\t$(\"#detail\").html(goods.detail)\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table id=\"tb\" width=\"80%\" border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>상품번호</td>\r\n");
      out.write("\t\t\t<td>상품명</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<button id=\"btn\">상품 정보 읽어오기</button>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<img id=\"img\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t상품번호 : <span id=\"no\"></span><br>\r\n");
      out.write("\t\t\t\t상품명 : <span id=\"item\"></span><br>\r\n");
      out.write("\t\t\t\t수량 : <span id=\"qty\"></span><br>\r\n");
      out.write("\t\t\t\t가격 : <span id=\"price\"></span><br>\r\n");
      out.write("\t\t\t\t상세정보 : <span id=\"detail\"></span><br>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

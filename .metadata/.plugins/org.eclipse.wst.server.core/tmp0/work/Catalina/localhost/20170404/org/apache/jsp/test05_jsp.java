/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.42
 * Generated at: 2017-04-04 04:50:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test05_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>form test</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!--# 은 request할 주소 나타낸다.\r\n");
      out.write("        mrthod 는 전송 방식(get/post)\r\n");
      out.write("        id는 유일한 갑인게 좋다.\r\n");
      out.write("        for\r\n");
      out.write("        name\r\n");
      out.write("    -->\r\n");
      out.write("\t<form action=\"#\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("            <label for =\"text1\">아이디</label>\r\n");
      out.write("                <input type=\"text\" id = \"text1\">\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <label for = \"password1\">패스워드</label>\r\n");
      out.write("                <input type=\"password\" id = \"password1\">\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <input type=\"radio\" name=\"lang\" value=\"Java\">자바\r\n");
      out.write("            <input type=\"radio\" name=\"lang\" value=\"C++\">C++\r\n");
      out.write("            <input type=\"radio\" name=\"lang\" value=\"C\">C\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <input type=\"checkbox\" name = \"choice\" value=\"check1\"> 선택1\r\n");
      out.write("            <input type=\"checkbox\" name = \"choice\" value=\"check2\"> 선택2\r\n");
      out.write("            <input type=\"checkbox\" name = \"choice\" value=\"check3\"> 선택3\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <!--action에 기입된 url로 이동(파라미터 전달) -->\r\n");
      out.write("            <input type=\"submit\" name=\"\" value=\"확인\">\r\n");
      out.write("            <!--해당 폼에 있는 내용을 전부 초기화 -->\r\n");
      out.write("            <input type=\"reset\" name=\"\" value=\"재입력\">\r\n");
      out.write("            <input type=\"button\" name=\"\" value=\"일반 버튼\">\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <!-- 사용자가 옵션 같은 것들을 선택 할 수 있게 해준다.(DropDown) -->\r\n");
      out.write("            <!-- ex) 전화번호 앞자리 선택(010,011,017)-->\r\n");
      out.write("            <select class=\"\" name=\"select\">\r\n");
      out.write("                <option value=\"\" selected=\"\">item1</option>\r\n");
      out.write("                <option value=\"\">item2</option>\r\n");
      out.write("                <option value=\"\">item3</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <!-- 장문의 글을 입력하고 싶을 때 사용한다.-->\r\n");
      out.write("            <textarea name=\"name\" rows=\"8\" cols=\"80\" placeholder=\"입력하세요\"></textarea>\r\n");
      out.write("        </p>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

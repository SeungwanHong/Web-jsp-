<%@ page import="hsw.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%!
	UserDao user = new UserDao();
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <% 
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        
    %>
    <% 
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        
    %>
    <% 
		String id =  request.getParameter("id"); 
		String pw =  request.getParameter("pw"); 
	%>
	<h2>�α��� </h2>
	<%
		if(user.login(id,pw)){
			out.println("�α��� ����");
		}else{
			out.println("�α��� ����");
		}
	
    %>

</body>
</html>
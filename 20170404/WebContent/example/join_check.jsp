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
	String joinId = request.getParameter("join_id");
	String joinPw = request.getParameter("join_pw");
	String joinName = request.getParameter("join_name");
	String joinEmail = request.getParameter("join_email");
	if(user.joinUser(joinId,joinPw,joinName,joinEmail)==1){
		out.println("가입 성공");
	}else{
		out.println("가입 실패");
	}
%>
</body>
</html>
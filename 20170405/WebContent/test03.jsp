<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>session �ǽ�</title>
</head>
<body>
<%
	if(session.isNew()){
		out.print("New <br/>");
		out.print("Session ID : "+session.getId()+"<br/>");
		out.print("Creation Time : "+ new Date(session.getCreationTime())+"<br/>");
		out.print("Last Access Time : " + new Date(session.getLastAccessedTime())+"<br/>");
		out.print("Max Inactive Interval : " + session.getMaxInactiveInterval()+"<br/>");
	}else{
		out.print("old <br/>");
		out.print("Session ID : "+session.getId()+"<br/>");
		out.print("Creation Time : "+ new Date(session.getCreationTime())+"<br/>");
		out.print("Last Access Time : " + new Date(session.getLastAccessedTime())+"<br/>");
		out.print("Max Inactive Interval : " + session.getMaxInactiveInterval()+"<br/>");
	}

%>

</body>
</html>
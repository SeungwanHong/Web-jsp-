<%@page import="hsw.vo.user.LoginVo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>main page</title>
</head>
<body>
<% 
	LoginVo loginVo = (LoginVo)session.getAttribute("LOGIN");
	if(loginVo == null){ 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/User");
		dispatcher.forward(request, response);
	}else{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Board");
		dispatcher.forward(request, response);
	}
%>
</body>
</html>
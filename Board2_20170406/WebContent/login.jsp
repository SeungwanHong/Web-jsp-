<%@page import="hsw.vo.user.LoginVo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login page</title>
</head>
<body>
<h1>����� �α���</h1>
<% LoginVo loginVo = (LoginVo)session.getAttribute("LOGIN"); %>
	<% if(loginVo == null){ %>
	<h1>�α��� �ϼ���</h1>
	<p>���̵�</p>
	<p>�н�����</p>
	<%}else{ %>
	<h1>���帮��Ʈ�� ���ϴ�.</h1>
	<%} %>

</body>
</html>
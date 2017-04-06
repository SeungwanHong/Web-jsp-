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
<h1>여기는 로그인</h1>
<% LoginVo loginVo = (LoginVo)session.getAttribute("LOGIN"); %>
	<% if(loginVo == null){ %>
	<h1>로그인 하세요</h1>
	<p>아이디</p>
	<p>패스워드</p>
	<%}else{ %>
	<h1>보드리스트로 갑니다.</h1>
	<%} %>

</body>
</html>
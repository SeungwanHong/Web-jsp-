<!-- 버퍼의 크기는 1kb 버퍼 주가 x 
(autoFlush - 원래있던 버버를 지워 버리고 새로운 데이터를 채운다.-->
<%@ page buffer = "1kb" autoFlush="true" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>버퍼 autoFlush false</title>
</head>
<body>
<%
	for(int i = 0 ; i<2000 ; i++){
		out.println("data");
	}
%>
</body>
</html>
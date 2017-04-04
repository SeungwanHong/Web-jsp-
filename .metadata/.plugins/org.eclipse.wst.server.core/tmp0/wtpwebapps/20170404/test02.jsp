<!-- 임폴트 방법 -->
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import = "java.util.ArrayList"
    %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>import 실습</title>
</head>
<body>
<%
    ArrayList<String> arr = new ArrayList<>();
    arr.add("10");
    arr.add("20");
    arr.add("30");
%>
<%=arr.get(0) %><br/>
<%=arr.get(1) %><br/>
<%=arr.get(2) %><br/>

<%	for(String str : arr){%>
		<span style = "color : red"><%=str%></span>
<%	}%>

</body>
</html>

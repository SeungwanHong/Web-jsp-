<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 직접적인 예외 발생 시에는 500 error 발생 -->
	<%-- throw new NullPointerException(); --%>
	<!-- 자바의 객체나 자바 코드를 사용하는 중에 나는 예외에는 해당 에외처리 페이지로 이동 -->
	<% request.getParameter("ID").toUpperCase(); %>
</body>
</html>
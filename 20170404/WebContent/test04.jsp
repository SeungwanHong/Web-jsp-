<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String start = ">>";
	String end = "<<";
%>
현재 날짜와 시간은
<%-- <%@ include file ="포함시킬 파일" %> --%>
<%-- 동일한 형태의 페이지가 반복 될 때 사용(매뉴, 페이지가 이동해서 지속적으로 띄워줘야할 부분
ex) 광고 안내 사항 등)
 --%>
 <%@ include file = "/include/date.jinc" %>
 입니다.
 <br/>
 <%= incVar %>
</body>
</html>

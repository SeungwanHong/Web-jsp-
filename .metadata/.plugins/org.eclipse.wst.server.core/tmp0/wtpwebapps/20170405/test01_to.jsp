<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("euc-kr");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
당신의 관심제품은 <br/>
<%-- 채크박스는 배열로 가져온다. => getParameterValues("checkBox name 값") --%>
<%
String[] chks = request.getParameterValues("chk");
for(int i =0 ; i<chks.length ; i++){
	out.print("<b>"+chks[i] +"</b>");
}
%>
이고, <br/>
요금제는 <b><%= request.getParameter("rate") %></b>를 선택하셨습니다.

</body>
</html>
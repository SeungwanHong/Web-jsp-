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
����� ������ǰ�� <br/>
<%-- äũ�ڽ��� �迭�� �����´�. => getParameterValues("checkBox name ��") --%>
<%
String[] chks = request.getParameterValues("chk");
for(int i =0 ; i<chks.length ; i++){
	out.print("<b>"+chks[i] +"</b>");
}
%>
�̰�, <br/>
������� <b><%= request.getParameter("rate") %></b>�� �����ϼ̽��ϴ�.

</body>
</html>
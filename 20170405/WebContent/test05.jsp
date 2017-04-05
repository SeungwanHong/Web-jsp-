<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%!
	String sGold;
	int gold;

	//jsp 파일이 최초로 컴파일 되었을 때 딱 한번만 실행 된다.
	public void jspInit() {
		ServletConfig myConfig = getServletConfig();
		sGold = myConfig.getInitParameter("startValue");
		gold = Integer.parseInt(sGold);
	}
	
	//서버가 재실행 되거나 jsp 파일이 컴파일 되기 직전 실행 된다.
	public void jspDestroy() {
		gold = Integer.parseInt(sGold);
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	시작값 :
	<%=gold%>
	<%
		gold = gold + 10;
	%>
</body>
</html>
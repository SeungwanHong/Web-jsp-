<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    �Է��� ���� �Դϴ�.<br/>
    <!-- request �ϸ鼭 ���� �Ķ���� �� ���´�.-->
    <%-- --%>
    ID :            <%= request.getParameter("id") %><br/>
    Password :      <%= request.getParameter("pw") %><br/>
    �ڱ�Ұ� :      <%= request.getParameter("desc") %><br/>
</body>
</html>

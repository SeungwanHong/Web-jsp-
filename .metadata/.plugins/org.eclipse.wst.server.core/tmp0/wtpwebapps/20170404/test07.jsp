<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    입력한 정보 입니다.<br/>
    <!-- request 하면서 보낸 파라미터 를 얻어온다.-->
    <%-- --%>
    ID :            <%= request.getParameter("id") %><br/>
    Password :      <%= request.getParameter("pw") %><br/>
    자기소개 :      <%= request.getParameter("desc") %><br/>
</body>
</html>

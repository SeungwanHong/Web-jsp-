<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    ������ ID�� Password �� �ڱ�Ұ��� �Է��ϼ���.
    <form action="test07.jsp" method="post" name="textform">
        ID :        <input type="text" name="id" >
        Password :  <input type="password" name="pw" >
		�ڱ�Ұ� <br/>
        <textarea name="desc" rows="4" cols="50"></textarea>
        <br/>
        <center>
            <input type="submit" name="����" value="submitbtn">
            <input type="reset" name="�ʱ�ȭ" value="resetbtn">
        </center>
    </form>
</body>
</html>
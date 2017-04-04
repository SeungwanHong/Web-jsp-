<!-- 지시문(directive) -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%-- jsp 선언문 --%>
<%-- jsp 페이지 전체에서 사용할 변수나(전역변수) 메소드를 선언 가능하다. --%>
<%-- 보통 <head> 태그 또는 <body> 맨 위에 넣어 주는 것이 좋다. --%>
<%-- Servlet 클래스의 멤버변수와 메소드의 역할을 한다.
제일 먼저 등장해야 하는 아이들 jsp 페이지에서 사용할 매소드 맴버변수를 선언하여 하용한다.
--%>
<%!
	String name = "test01 jsp";
	public int addNumber(int a, int b) {
		return a + b;
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test01</title>
</head>


<body>
    여기는 일반 html 영역입니다.<br/>
	<!--스클립 틀립(scliptlet) -->
	<!--jsp 페이지내에서 java 코드가 사용되어지는 공간 -->
	<!--html 코드와 섞아사 사용 할 수 있다. -->
	<!--여러가지 jsp 내장 객체(기본적으로 주어지는 jsp관련객체)를 사용할 수 있다. -->

    <!--html : 클라이언트 에게 보여줄 페이지를 꾸미는 공간 -->
    <!--프로그래밍 적인 요소가 없다. -->
    <!--html코드와 비지니스 로직을 한번에 만들어 낼수가 있다. -->

    <!--단점 : 디자이너와 개발자 사이의 업무분담이 애매해진다. 충돌도 많이 일어난다. -->

    <!--스클립틀릿의 자바코드가 모두 실행이 완료 되어야 클라이언트가 페이지를 볼 수있다.
        코드 블럭이 올 수 있는건가?
    -->
    스클립트 시작<br/>
	<%
	  for(int i = 0 ; i<=10 ; i++){
          //안에 있는 out은 프린터 객체(내장 객체)
	    out.println("Hello World" + i + "<br/>");
	  }
	%>
    스클립트 끝<br/>
    표현식 시작<br/>
    <!-- 표현식
         자바의 식을 표현하고, 세미콜론(;)이 필요 없다.
         표현하려고 하는 하나의 식만 와야한다.
         여러문장이 올수 없고 단 하나의 식만 와야한다.
         존재하지 않는 변수나 매소드는 사용 될 수 없다.
     -->
    1+2 = <%= 1+2 %><br/>
    addNumber(10,20)의 결과 = <%= addNumber(10,20) %><br/>
    <%--= a+b --%> <%= name %>
    표현식 시작<br/>
</body>
</html>

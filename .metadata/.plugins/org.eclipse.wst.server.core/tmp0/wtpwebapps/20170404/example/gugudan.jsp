<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--!
	public void gugudan() {
    	for(int i = 2 ; i<10 ; i++){
    		JspWriter out = JspWriter();
    		out.println(i+"단<br/>");
            for(int j = 1 ; j<10 ; j++){
                out.println(i+"*"+j+" = "+i*j+"<br/>");
            }
        }
	}
--%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!--
 2 * 1 = 2
 2 * 2 = 4
 2 * 3 = 6
 2 * 4 = 8
 2 * 5 = 10
 2 * 6 = 12
 2 * 7 = 14
 2 * 8 = 16
 2 * 8 = 18
 5 * 1 = 5
 5 * 2 = 10
 5 * 3 = 15
 5 * 4 = 20
 5 * 5 = 25
 5 * 6 = 30
 5 * 7 = 35
 5 * 8 = 40
 5 * 8 = 45
 8 * 1 = 8
 8 * 2 = 16
 8 * 3 = 24
 8 * 4 = 32
 8 * 5 = 40
 8 * 6 = 48
 8 * 7 = 56
 8 * 8 = 64
 8 * 8 = 72
  -->
  <%
  	for(int i = 2 ; i<10 ; i++){
        for(int j = 1 ; j<10 ; j++){
            out.println(i+"*"+j+" = "+i*j+"<br/>");
        }
    }
  %>
  a 라는 변수가 10이면 hello 출력, 20이면, bye 출력, 그 외 값이면 hello world 출력<br/>
  <%
      int a = 10;
      if(a == 10){
          out.println("hello");
      }else if(a == 20){
          out.println("bye");
      }else{
          out.println("Hello World!");
      }
  %><br/>
  b 라는 변수가 10이면 h1태그를 작성, 20이면 h2태그를 적용 그 외에는 h3 태그를 적용<br/>
  <%
  int b = 10;
    if(b == 10){ %>
    <h1 style="color: red">Hello</h1>
<%	}else if(b == 20){%>
    <h2 style="color: blue">bye</h2>
<%	}else{ %>
    <h3 style="color: green">Hello World!</h3>
<%	} %>
<span style="background-color:red" >testsesd</span>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>form test</title>
</head>
<body>
    <!--
        form 태그
        # 은 request할 주소 나타낸다.
        mrthod 는 전송 방식(get/post)
        input 태그
        id 는 유일한 갑인게 좋다.
        name 은 파라미터의 키값이 된다.
        label 태그
        for
    -->
	<form action="#" method="get">

        <p>
            <label for ="text1">아이디</label>
                <input type="text" id = "text1" >
        </p>
        <p>
            <label for = "password1">패스워드</label>
                <input type="password" id = "password1">
        </p>
        <p>
            <input type="radio" name="lang" value="Java">자바
            <input type="radio" name="lang" value="C++">C++
            <input type="radio" name="lang" value="C">C
        </p>
        <p>
            <input type="checkbox" name = "choice" value="check1"> 선택1
            <input type="checkbox" name = "choice" value="check2"> 선택2
            <input type="checkbox" name = "choice" value="check3"> 선택3
        </p>
        <p>
            <!--action에 기입된 url로 이동(파라미터 전달) -->
            <input type="submit" name="" value="확인">
            <!--해당 폼에 있는 내용을 전부 초기화 -->
            <input type="reset" name="" value="재입력">
            <input type="button" name="" value="일반 버튼">
        </p>
        <p>
            <!-- 사용자가 옵션 같은 것들을 선택 할 수 있게 해준다.(DropDown) -->
            <!-- ex) 전화번호 앞자리 선택(010,011,017)-->
            <select class="" name="select">
                <option value="" selected="">item1</option>
                <option value="">item2</option>
                <option value="">item3</option>
            </select>
        </p>
        <p>
            <!-- 장문의 글을 입력하고 싶을 때 사용한다.-->
            <textarea name="name" rows="8" cols="80" placeholder="입력하세요"></textarea>
        </p>
	</form>

</body>
</html>

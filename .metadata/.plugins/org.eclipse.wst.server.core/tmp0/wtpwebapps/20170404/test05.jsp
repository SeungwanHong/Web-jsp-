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
        form �±�
        # �� request�� �ּ� ��Ÿ����.
        mrthod �� ���� ���(get/post)
        input �±�
        id �� ������ ���ΰ� ����.
        name �� �Ķ������ Ű���� �ȴ�.
        label �±�
        for
    -->
	<form action="#" method="get">

        <p>
            <label for ="text1">���̵�</label>
                <input type="text" id = "text1" >
        </p>
        <p>
            <label for = "password1">�н�����</label>
                <input type="password" id = "password1">
        </p>
        <p>
            <input type="radio" name="lang" value="Java">�ڹ�
            <input type="radio" name="lang" value="C++">C++
            <input type="radio" name="lang" value="C">C
        </p>
        <p>
            <input type="checkbox" name = "choice" value="check1"> ����1
            <input type="checkbox" name = "choice" value="check2"> ����2
            <input type="checkbox" name = "choice" value="check3"> ����3
        </p>
        <p>
            <!--action�� ���Ե� url�� �̵�(�Ķ���� ����) -->
            <input type="submit" name="" value="Ȯ��">
            <!--�ش� ���� �ִ� ������ ���� �ʱ�ȭ -->
            <input type="reset" name="" value="���Է�">
            <input type="button" name="" value="�Ϲ� ��ư">
        </p>
        <p>
            <!-- ����ڰ� �ɼ� ���� �͵��� ���� �� �� �ְ� ���ش�.(DropDown) -->
            <!-- ex) ��ȭ��ȣ ���ڸ� ����(010,011,017)-->
            <select class="" name="select">
                <option value="" selected="">item1</option>
                <option value="">item2</option>
                <option value="">item3</option>
            </select>
        </p>
        <p>
            <!-- �幮�� ���� �Է��ϰ� ���� �� ����Ѵ�.-->
            <textarea name="name" rows="8" cols="80" placeholder="�Է��ϼ���"></textarea>
        </p>
	</form>

</body>
</html>

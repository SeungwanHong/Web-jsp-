<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="test01_to.jsp" method="post" name="testform">
	<table>
		<tr>
			<td>관심제품</td>
			<td>요금제</td>
		</tr>
		<tr>
			<td>
				<input type="checkbox" name="chk" value="갤럭시 노트" checked="checked">갤럭시 노트<br/>
				<input type="checkbox" name="chk" value="갤럭시 s3" >갤럭시 s3<br/>
				<input type="checkbox" name="chk" value="아이폰 4s" >아이폰 4s<br/>
				<input type="checkbox" name="chk" value="옵티머스 LTE2" >옵티머스 LTE2<br/>
				<input type="checkbox" name="chk" value="옵티머스뷰" >옵티머스뷰<br/>
			</td>
			<td>
				<input type="radio" name="rate" value="LTE62" checked="checked">LTE62<br/>
				<input type="radio" name="rate" value="LTE72" >LTE72
			</td>
		</tr>
		<tr>
			<td colspan="1" align="center">
				<input type="submit" value="전송">
				<input type="reset" value="초기화">
			</td>
		</tr>
	</table>
</form>
</body>
</html>
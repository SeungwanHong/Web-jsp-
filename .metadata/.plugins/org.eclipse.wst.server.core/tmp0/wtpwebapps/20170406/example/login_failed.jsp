<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- �������� �ּ�ȭ�� �ֽ� CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- �ΰ����� �׸� -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- �������� �ּ�ȭ�� �ֽ� �ڹٽ�ũ��Ʈ -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="page-header">
				<h2>�α��� �ϼ���</h2>
			</div>
			<div class="col-md-3">
				<div class="login-box well">
					<form role="form" method="post" action="../user/login">
						<legend>�α���</legend>
						<div class="form-group">
							<label for="userid">�̸��� or ���̵�</label> <input name="userid"
								value='<%=request.getParameter("userid") %>' id="userid" placeholder="E-mail or Username"
								type="text" class="form-control" />
						</div>
						<div class="form-group">
							<label for="password">��й�ȣ</label> <input name="userpw"
								id="password" value='' placeholder="Password" type="password"
								class="form-control" />
						</div>
						<div class="form-group">
							<input type="submit"
								class="btn btn-default btn-login-submit btn-block m-t-md"
								value="Login" />
						</div>
					</form>
				</div>
			</div>
			
		</div>
	</div>

</body>
</html>
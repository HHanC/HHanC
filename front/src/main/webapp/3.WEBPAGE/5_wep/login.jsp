<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 부트 스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- 사용자 정의 css -->
	<link href="index.css" rel="stylesheet">
	<!-- 폰트어썸[아이콘] -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">

</head>
<body>

	<div class="col-md-12">
		<div class="row">
			<div class="col-md-8 offset-2 row">
				<div class="text-center">
					<h2>LOGIN</h2>	
				</div>
				<div class="col-md-8">
					<form action="" method="get">
						<div>
							<input type="text" class="form-control py-3" placeholder="아이디" maxlength="10">
							<input type="password" class="form-control py-3" placeholder="비밀번호" maxlength="10">
						</div>
					</form>
				</div>
				<div class="col-md-4">
					<form action="" method="get">
						<div>
							<input class="form-control py-3" type="button" value="Login">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
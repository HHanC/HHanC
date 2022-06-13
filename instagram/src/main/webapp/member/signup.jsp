<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ISTAGRAM</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자정의 css -->
	<link href="/instagram/css/signup.css" rel="stylesheet">
</head>
<body style="background-color:#fafafa">

	<div class="container" style="background-color: #fafafa" >
		<br><br>
		<div class="col-md-4 offset-4 py-5" style="background-color: white; border: 1px solid #dbdcdd; margin-top: 100px;">
			<div class="col-md-10 offset-1">
				<form id="signupform" action="../Signup" method="post">
					<img class="rounded mx-auto d-block my-2" alt="" src="/instagram/img/photogram.png">
					<h4 class="text-center text-secondary my-3">친구들의 사진과 동영상을 보려면 가입하세요.</h4>
					<hr>
					<div class="input_container">
						<input class="form-control my-2 box" type="text" id="memail" name="memail" placeholder="이메일 주소">
						<span id="memailcheck"></span>
					</div>
					<div class="input_container">
						<input class="form-control my-2 box" type="text" id="mname" name="mname" placeholder="성명">
						<span id="namecheck"></span>
					</div>
					<div class="input_container">
						<input class="form-control my-2 box" type="text" id="mname2" name="mname2" placeholder="사용자 이름">
						<span id="namecheck2"></span>
					</div>
					<div class="input_container">
						<input class="form-control my-2 box" type="password" id="mpassword" name="mpassword" placeholder="비밀번호">
						<span id="pwcheck"></span>
					</div>
					<button class="form-control my-2" style="background-color: #0d6efd; color: white;" onclick="signup()" type="button">가입</button>
				</form>
			</div>
		</div>
		<div class="col-md-4 offset-4 my-2" style="background-color: white; border: 1px solid #dbdcdd; ">
			<div class="col-md-10 offset-1 py-3">
				<p class="text-center"> 계정이 있으신가요? <a href="login.jsp">로그인</a> </p>
			</div>
		</div>
	</div>
	
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/signup.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>
</body>
</html>






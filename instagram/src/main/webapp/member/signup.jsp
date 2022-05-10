<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ISTAGRAM</title>
</head>
<body>

	<form action="../signup" method="post">
		<input type="text" id="mep" name="mep" placeholder="휴대폰 번호 또는 이메일 주소">
		<span id="mepcheck"></span>
		<br>
		<input type="text" id="mname" name="mname" placeholder="성명">
		<span id="namecheck"></span>
		<br>
		<input type="text" id="mname2" name="mname2" placeholder="사용자 이름">
		<span id="namecheck2"></span>
		<br>
		<input type="password" id="mpassword" name="mpassword" placeholder="비밀번호">
		<span id="pwcheck"></span>
	</form>

	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/signup.js" type="text/javascript"></script>
	
</body>
</html>






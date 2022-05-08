<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>instagram</title>
</head>
<body>

	<form action="../signup" method="post">
		<input type="text" id="memail" name="memail" placeholder="이메일 주소">
		@
		<input type="text" id="memailaddress" name="memailaddress">
		<select id="emailselect">
			<option value="">직접입력</option>
			<option value="naver.com">naver.com</option>
			<option value="gmail.com">gmail.com</option>
			<option value="hanmail.net">hanmail.net</option>
			<option value="nate.com">nate.com</option>
			<option value="yahoo.com">yahoo.com</option>
		</select>
		<span id="emailcheck"></span>
		<br>
		<input type="text" id="mname" name="mname" placeholder="이름"> <br>
		<span id="namecheck"></span>
		<input type="text" id="mid" name="mid" placeholder="아이디"> <br>
		<span id="idcheck"></span>
		<input type="password" id="mpassword" name="mpassword" placeholder="비밀번호">
	</form>

	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/signup.js" type="text/javascript"></script>
	
</body>
</html>






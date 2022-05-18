<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp"%>

	<form id="loginform" action="../main.jsp" method="post">
		<input id="mname2" name="mname2" placeholder="사용자 이름">
		<span id="namecheck2"></span>
		<br>
		<input id="mpassword" name="mpassword" placeholder="비밀번호">
		<span id="pwcheck"></span>
		<br>
		<button onclick="login()" type="button">로그인</button>
	</form>
	
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/login.js" type="text/javascript"></script>

</body>
</html>
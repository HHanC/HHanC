<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id="fpwform" action="../Fpw" method="post">
		<input type="text" id="fep" name="fep" placeholder="이메일을 입력해 주세요.">
		<span id="fepcheck"></span>
		<br>
		
		<input type="text" id="fname" name="fname" placeholder="이름을 입력해 주세요.">
		<span id="fnamecheck"></span>
		<br>
		
		<input type="text" id="fname2" name="fname2" placeholder="사용자 이름을 입력해 주세요.">
		<span id="fname2check"></span>
		<br>
		
		<button onclick="findpw()" type="button">비밀번호 찾기</button>
		
	</form>
	
	
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/find.js" type="text/javascript"></script>
</body>
</html>
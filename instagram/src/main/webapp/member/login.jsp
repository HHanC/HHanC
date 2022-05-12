<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 게시판 api -->
  <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
  
 <!-- 썸머노트 기본 부트스트랩 버전 3버전 -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

 <!-- 썸머노트 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">

</head>
<body>
	<h3>회원가입 성공</h3>
	
	<form action="../Login" method="post">
		<input name="mep" placeholder="휴대폰 번호 또는 이메일 주소"> <br>
		<input name="mpassword" placeholder="비밀번호"> <br>
		
		<%
			String result = request.getParameter("result");
			if(result != null && result.equals("2")){
		%>
			<span>동일한 회원 정보가 없습니다.</span>
		<%		
			}
		%>
		
		<input type="submit" value="로그인">
	</form>
	
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>
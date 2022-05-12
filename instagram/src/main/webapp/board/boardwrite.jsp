<%@page import="dto.Board"%>
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
	<form action="../board/Main" method="post" enctype="multipart/form-data">
		<input type="file" name="bfile">
		<textarea id="summernote" name="bcontent"> </textarea>
		<input type="submit" value="공유">
	</form>
	<div>
		<ul>
			<li> <a href="../main.jsp"> 〈 </a> </li>
		</ul>
	</div>
	
	<!-- 한글 버전 -->
	<script src=" https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.18/lang/summernote-ko-KR.min.js"></script>
	<!-- 게시판api( 썸머노트) js cdn -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<!-- 썸머노트 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<!-- 사용자정의 게시판관련 스크립트 호출  -->
	<script src="/instagram/js/board.js" type="text/javascript"></script>
	<!-- 사용자 정의 js -->
	<script src="/instagram/js/main.js" type="text/javascript"></script>
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>
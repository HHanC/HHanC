<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

 <!-- 게시판 api -->
  <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
  
 <!-- 썸머노트 기본 부트스트랩 버전 3버전 -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

 <!-- 썸머노트 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">

</head>
<body>

	<%@include file = "../header.jsp" %>
	
		
	
		<div class="container">
			<a href="boardlist.jsp"> <button>글목록</button> </a>
			<h3>글쓰기</h3>
			<form action="../board/write" method="post" enctype="multipart/form-data">
				<!-- form 전송 인코딩 타입 : 기본 타입은 첨부파일 불가능 -->
				<!-- form 첨부파일 인코딩 타입 : enctype="multipart/form-data -->
				제목 : <input type="text" name="btitle"> <br>
				내용 : <textarea name="bcontent" id="summernote"></textarea>
				첨부파일 : <input type="file" name="bfile"> <br>
				<input type="submit" value="등록"> 
				<input type="reset" value="취소">
			</form>
		</div>
	
	<!-- 한글 버전 -->
	<script src=" https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.18/lang/summernote-ko-KR.min.js"></script>
	<!-- 게시판api( 썸머노트) js cdn -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<!-- 썸머노트 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<!-- 사용자정의 게시판관련 스크립트 호출  -->
	<script src="/jspweb/js/board.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>

</body>
</html>
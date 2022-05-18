<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file ="../header.jsp" %>
	<br><br><br>
	<div class="container">
		<div class="text-center">
			<h4> 리뷰작성 </h4>
		</div>
	<!-- ---------------------- 테이블 구역 -------------------------- -->
		<table class="table table-hover text-center"> <!-- 테이블 -->
			<tr>
				<th width="10%"> 번호 </th> 
				<th width="50%"> 제목 </th> 
				<th width="15%"> 작성자 </th> 
				<th width="15%"> 작성일 </th> 
			</tr>
			<tr>
				<th width="10%">1</th>
				<th width="50%"> <a href="boardupdate.jsp"> 티셔트 문의 </a> </th>
				<th width="15%">나야나</th>
				<th width="15%">10.10.10</th>
			</tr>
		</table>
		
		<!-- ---------------------- 글쓰기 버튼 구역 -------------------------- -->
		<div class="col-md-2 offset-10">
			<a href="boardwrite.jsp"> <button class="form-control">글쓰기</button> </a>
		</div>
	</div>
	
	<%@include file ="../footer.jsp" %>
</body>
</html>
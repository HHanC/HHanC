<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	<br><br><br><br><br><br><br><br>
	
	<div class="container">
		<h3 class="text-center titleline"> 문의 글 </h3>
		
		<!-- 버튼 -->
		<div class="my-3">
			<a href="boardlist.jsp"> <button class="btn btn-outline-info"> 목록보기 </button> </a>
			<a href="boardlist.jsp"> <button class="btn btn-outline-info"> 삭제 </button> </a> <!-- 작성자 가능 [유효성 검사] -->
			<a href="boardlist.jsp"> <button class="btn btn-outline-info"> 수정 </button> </a> <!-- 작성자 가능 [유효성 검사] -->
			<a href="boardlist.jsp"> <button class="btn btn-outline-info"> 답변 </button> </a> <!-- 관리자 가능 [유효성 검사] -->
		</div>
		<!-- 작성자 입력한 내용 -->
		<div> <!-- 박스권 : display : block / span박스권 : display : inline --> 
			<div> <span>작성자</span> <span>한준석</span> </div>
			<div> <span>문의날짜</span> <span>2022-04-05</span> </div>
		</div>
	
		<div>
			<textarea rows="20" cols="" class="form-control" readonly></textarea>
		</div>
	
		<div class="row my-4"> <!-- 첨부된 사진들 -->
			<h3>첨부 사진</h3>
			<div class="col-md-3">
				<img alt="" src="img/무신사1.jpg" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/무신사2.jpg" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/무신사3.jpg" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/무신사4.jpg" width="100%">
			</div>
		</div>
	
		<div>
			환불해주세요~~
		</div>
		
		<div>
			<textarea rows="20" cols="" class="form-control" readonly style="resize: none;"> 하........................</textarea>
		</div>														<!-- textarea의 크기 고정 -->
		<!-- 관리자가 답변한 내용 -->
		<h4> 답변 </h4>
		<p> 답변일 : 2022-04-23 12:10</p>
		<div>
			<textarea rows="" cols="" class="form-control" readonly style="resize: none;"> 하하..........................</textarea>
		</div>
	</div>
	
	<br><br><br><br><br><br><br><br>
	<%@include file="footer.jsp" %>

</body>
</html>
















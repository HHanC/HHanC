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
		
		 <br><br><br><br><br><br><br><br><br><br>
		
		<div class="container"> <!-- 본문 -->
			<h3 class="text-center">문의 글쓰기</h3>
			<div class="titleline"></div>
			<form action="#" method="get"> <!-- 폼 양식 [입력값을 전송 가능] -->
			<div class="row">
				<div class="col-md-3">
					작성자 <input type="text" class="form-control" placeholder="작성자" maxlength="10">
				</div>
				<div class="col-md-3">
					비밀먼호 <input type="password" class="form-control" placeholder="비밀번호" maxlength="4" >
				</div>
			</div>
			<div class="row">
				<div class="col-md-8">
					제목 <input type="text" class="form-control" placeholder="문의 제목을 작성해 주세요" maxlength="50"> <!-- 아디디 글자 수 : maxlength -->
				</div>
			</div>
				내용 <textarea rows="20" cols="" class="form-control" placeholder="문의 내용을 작성해주세요"></textarea>
				<div class="row">
					<div class="col-md-3">
						*첨부파일 <input type="file" class="form-control"> <!-- 첨부파일 입력상자 -->
					</div>
				</div>
				
				<div class="col-md-4 offset-4">
					<div class="col-md-4">
						<input type="submit" value="등록" class="form-control"> <!-- 폼(action ->) 전송버튼 -->
					</div>
						
					<div class="col-md-4">
						<input type="reset" value="다시쓰기" class="form-control"> <!-- 폼(action ->) 전송버튼 -->
					</div>
						
					<div class="col-md-4">
							<a href="boardlist.jsp"> <button class="form-control"> 목록 </button> </a>
					</div>
				</div>
			
			</form>
		</div>
	
	<br><br><br><br><br><br><br><br><br><br>
	
	<%@include file="footer.jsp" %>

</body>
</html>
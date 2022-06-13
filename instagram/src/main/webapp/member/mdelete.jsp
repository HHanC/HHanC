<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body style="background-color:#fafafa">
	
	<%
		String memail = (String)session.getAttribute("login");
	%>
	<div class="container" style="background-color: #fafafa; margin-top: 100px;" >
		<br><br>
		<div class="container row">
			<div class="col-md-4 offset-4 py-5" style="background-color: white; border: 1px solid #dbdcdd; ">
				<div class="col-md-10 offset-1">
					<form id="fpwform" action="../Fpw" method="post">
						<p class="text-center">
						안녕히가세요.
						</p>
	
						<input class="form-control my-2 box" type="password" id="mpassword" name="mpassword" placeholder="비밀번호를 입력해주세요.">
						<br>
						<button class="form-control my-2" style="background-color: #0d6efd; color: white;" id="btncoform" onclick="passwordcheck('<%=memail%>')" type="button">확인</button>
						<span id="checkmsg"></span>
						<button class="form-control my-2" style="background-color: #0d6efd; color: white; display: none;" id="btndelete" onclick="mdelete('<%=memail%>')" type="button">탈퇴승인</button>
	
	
	
	
	
	
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/delete.js" type="text/javascript"></script>
	
	<%@include file = "../footer.jsp" %>
</body>
</html>
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
<div class="container" style="background-color: #fafafa; margin-top: 100px;" >
	<br><br>
	<div class="container row">
		<div class="col-md-4 offset-4 py-5" style="background-color: white; border: 1px solid #dbdcdd; ">
			<div class="col-md-10 offset-1">
				<form id="fpwform" action="../Fpw" method="post">
					<img class="rounded mx-auto d-block my-2" alt="" src="/instagram/img/비번찾기.png">
					<h6 class="text-center text-secondary my-3"style="font-weight:bold;">로그인에 문제가 있나요?</h6>
					
					<p class="text-center">
					이메일 주소를 입력하시면 계정에 다시 액세스할 수 있는 링크를 보내드립니다.
					</p>
					
					<input class="form-control my-2 box" type="text" id="femail" name="femail" placeholder="이메일 주소">
					<br>
					<button class="form-control my-2" style="background-color: #0d6efd; color: white;" onclick="findpw()" type="button">로그인 링크 보내기</button>
					<div class="container row">
						<div class="col-md-4 mx-0 px-0"><hr></div>
						<div class="col-md-4">
							<p class="text-center text-secondary mx-0 my-1 px-0 py-0">또는</p>
						</div>
						<div class="col-md-4 mx-0 px-0"><hr></div>
					</div>
					
					<a href="signup.jsp" style="text-decoration-line:none; font-weight:bold;"> <p class="text-center text-secondary mt-3 mb-5 ">새 계정 만들기</p></a>
					<a href="login.jsp" style="text-decoration-line:none; font-weight:bold;"> <p class="text-center text-secondary my-0 ">로그인으로 돌아가기</p></a>
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
	<script src="../js/find.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>
</body>
</html>
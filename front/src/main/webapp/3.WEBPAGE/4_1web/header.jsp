<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<!-- 부트스트랩css -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- 사용자가 정의한 css포함 -->
	<link href="css/main.css" rel="stylesheet">
	<!-- 폰트어썸[아이콘] -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	
</head>
<body>

	<div class="fixed-top bg-white">
		<div class="container">
			<div class="py-3"> <!-- 상단 메뉴 -->
				<!-- p : 안쪽 여백  py : 위 아래 안쪽 여백-->
				<!-- m : 바깥 여백  my : 위 아래 바깥 여백-->
				<div class="row">
					<div class="col-md-4 offset-4 text-center">
							<!-- text-center : 박스권 내 내용물 가운데 정렬 -->
							<!-- offset : 여백 그리드 -->
						<a href="main.jsp" class="header_logo" > 준신사 </a>
					</div>
					<div class="col-md-4 d-flex justify-content-end">
						<ul class="nav">
							<li> <a href="#" >로그인</a> | </li>
							<li> <a href="#" >회원가입</a> | </li>
							<li> <a href="#" >장바구니</a> </li>
						</ul>
					</div>
				</div>
			</div>
			
			<div class="navbar navbar-expand-md navbar-light bg white"> <!-- 본메뉴 -->
				<!-- 숨겨진 메뉴 펼치기 -->
				<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navcl">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				<div class="collapse navbar-collapse" id = "navcl">
					<ul class="navbar-nav col-md-12 justify-content-between">
														<!-- justify-content-between : 자동 간격 배치 -->
						<li class="nav-item"> <a href="#" class="nav-link">베스트 상품</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">수트</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">상의</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">니트</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">셔츠</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">바지</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">신발</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">악세사리</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">스타일</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">리뷰</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">고객센터</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link"> <i class="fas fa-serch"></i> </a> </li>
					
					</ul>
				</div>
				<!-- 부트스트랩js -->
				<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
			</div>
		</div>
	</div>

</body>
</html>






















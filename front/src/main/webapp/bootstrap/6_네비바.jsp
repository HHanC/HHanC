<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		*{border: solid 1px red;}
	
	</style>
	
</head>
<body>

	<%@include file="1.설치.jsp" %>

	<!-- container / grid / -->

	<div class="container"> <!-- 박스권-->
		<div class="navbar navbar-expand-md"> <!-- 네비게이션 바 -->
		
			
			<!-- 메뉴 사이즈 작아지는 경우 -->
			<button type="button" data-bs-toggle="collapse" 
			data-bs-target="#navmenu" aria-controls="navbarcpmtemts" 
			aria-expanded="false" aria-label="Toggle navi"
			>
				<span class="navbar-toggler-icon"></span>
			</button>
			
			<div class="collapse navbar-collapse" id="navmenu"> <!-- 760px 이하로 되면 메뉴 사라짐 -->
			
				<a href="#" class="navbar-brand">로고</a>
				
				<ul class="navbar-nav"> <!-- 네비게이션 목록 -->
					<li class="nav-item">  <a href="#" class="nav-link"> 메뉴1 </a> </li> <!-- 네비게이션 목록 값 -->
					<li class="nav-item"> <a href="#" class="nav-link"> 메뉴2 </a> </li>
					<li class="nav-item"> <a href="#" class="nav-link"> 메뉴3 </a> </li>
					<li class="nav-item dropdown"> <!-- 드랍다운 메뉴 --> 
						
						<!-- 하단 텍스트를 클릭했을때 메뉴 펼치기 -->
						
						<!-- nav-link : 링크 설정값 : 밑줄제거, 여백, 색상 -->
						<!-- dropdown-toggle : 아래화살표 표시 -->
						
						<a href="#" class="nav-link" data-bs-toggle="dropdown">  
							드랍다운
						</a>
						
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#"> 드랍다운 메뉴1 </a>
							<a class="dropdown-item" href="#"> 드랍다운 메뉴2 </a>
							<a class="dropdown-item" href="#"> 드랍다운 메뉴3 </a>
						</div>
						
					</li>
				</ul> <!-- 네이베이션 목록 끝 -->
				
				<form action="">
					<div class="row">
						<div class="col-md-5">
							<input type="text" class="form-control" placeholder="검색어">
						</div>
						<div class="col-md-5">
							<button class="btn btn-info" type="submit">검색</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
















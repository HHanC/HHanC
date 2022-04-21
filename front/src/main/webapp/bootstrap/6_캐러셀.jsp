<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<style type="text/css">
	
		*{border: solid 1px red;}
		.carousel-item{
			width: 100%;
			height: 100%;
		}
	
	</style>

</head>
<body>

	<!-- 이미지 슬라이드 : 캐러셀 -->
	<%@include file="1.설치.jsp" %>
	<!-- 이미지 슬라이드 : 캐러셀 -->
	<div class="container"> <!-- 박스권 -->
		<!-- 캐러셀 -->
		<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="1000"> <!-- 캐러셀 -->
			
			<!-- 캐러셀 [내용위치] 하단 버튼 : 인디케이터-->
			
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
				<button type="button" data-bs-target="#cs" data-bs-slide-to="1"></button>
				<button type="button" data-bs-target="#cs" data-bs-slide-to="2"></button>
			</div>
			
			
			<div class="carousel-inner">
				<div class="carousel-item active"> <!-- 캐러셀 내용 -->
					<img alt="" src="../img/마동석3.jpg">
					<div class="carousel-caption">
						fdasfdsafdsafdsafdsaf
					</div>
				</div>
				<div class="carousel-item"> <!-- 캐러셀 내용 --><img alt="" src="../img/마동석2.jpg"></div>
				<div class="carousel-item"> <!-- 캐러셀 내용 --><img alt="" src="../img/마동석1.jpg"></div>
			</div>
			
			<!-- 개러셀 이동 이전 버튼 -->
			<button type="button" class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</button>
			
			<!-- 개러셀 이동 다음 버튼 -->
			<button type="button" class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
				<span class="carousel-control-next-icon" ></span>
			</button>
		</div>
	</div>

</body>
</html>
























<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "header.jsp" %>
	<br><br><br>
	<div class="container">
		<div id="mainslide" class="carousel slide row" data-bs-ride="carousel" data-bs-interval="1000">
			<div class="col-md-3">
				<h3>사이드바</h3>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
				<p>사이드바 입니다.</p>
			</div>
			<div class="col-md-9">
					<!-- 슬라이드 하단 위치 버튼  -->
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#mainslide" data-bs-slide-to="0" class="active"></button>
					<button type="button" data-bs-target="#mainslide" data-bs-slide-to="1" ></button>
					<button type="button" data-bs-target="#mainslide" data-bs-slide-to="2" ></button>
				</div>
				<!-- 이미지 목록 -->	
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img alt="" src="img/헤일로1.PNG">
					</div>
					<div class="carousel-item">
						<img alt="" src="img/헤일로2.PNG">
					</div>
					<div class="carousel-item">
						<img alt="" src="img/헤일로3.PNG">
					</div>
					<!-- 왼쪽 이동 버튼  -->
					<button class="carousel-control-prev" type="button" data-bs-target="#mainslide" data-bs-slide="prev">
						<span class="carousel-control-prev-icon"></span>
					</button>
					<!-- 오른쪽 이동 버튼  -->
					<button class="carousel-control-next" type="button" data-bs-target="#mainslide" data-bs-slide="next">
						<span class="carousel-control-next-icon"></span>
					</button>
				</div>
				<div class="main_box">	<!--베스트-->
			<h6 class="main_title"> </h6>
			<div class="row">
				<div class="col-md-3 best_box">
					<img alt="" src="img/헤일로베스트1.webp">
				</div>
				<div class="col-md-3 best_box">
					<img alt="" src="img/헤일로베스트2.jpg">
				</div>
				<div class="col-md-3 best_box">
					<img alt="" src="img/헤일로베스트3.gif">
				</div>
				<div class="col-md-3 best_box">
					<img alt="" src="img/헤일로베스트4.gif">
				</div>
			</div>
		</div>
			</div>
		</div>
	</div>
	
	<%@include file="footer.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 부트 스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- 사용자 정의 css -->
	<link href="index.css" rel="stylesheet">
	<!-- 폰트어썸[아이콘] -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	
	
	<!--  <style type="text/css">
	
		*{border: solid 1px red;}
	
	</style>
	-->

</head>
<body>
	<!-- https://huns.co.kr  : 훈스 -->
	<div class="col-md-10 offset-2 fixed-top pd-1 pt-5 px-5">
		<div class="col-md-7 offset-5 d-flex justify-content-end"> <!-- 헤더 메뉴 -->
			<ul class="nav"> <!-- 해당 리스트[ul, ol] 가로 배치 [inline] -->
				<li class="tophead"> <a href="login.jsp"> LOGIN </a> </li>
				<li class="tophead"> <a href="#"> JOIN </a> </li>
				<li class="tophead"> <a href="#"> CART </a> </li>
				<li class="tophead"> <a href="#"> MY PAGE </a> </li>
				<li class="tophead"> <a href="#"> SNS </a> </li>
				<li class="tophead"> <a href="#"> BOOKMARK </a> </li>
			</ul>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2 sidemenu"> <!-- 사이드바 -->
			<h3>HUNS</h3>
			<ul>
				<li>BEST</li>
				<li>NEW</li>
				<li>당일배송</li>
				<li>1+1/코디세트</li>
			</ul>
			<ul>
				<li>아우터</li>
				<li>상의</li>
				<li>셔츠</li>
				<li>니트/가디건</li>
				<li>팬츠</li>
				<li>트레이닝</li>
				<li>신발</li>
				<li>악세사리</li>
				<li>세일</li>
			</ul>
			<ul>
				<li>NOTICE</li>
				<li>Q&A</li>
				<li>REVIEW</li>
				<li>EVENT</li>
			</ul>
			<div>
				<input type="text"><i class="fas fa-search"></i>
			</div>
			<br>
			<div>
				고객센터　070-7710-4745 <br>
				카카오채널 @훈스 <br>
				MON - FRI AM9 - PM4 <br>
				(LUNCH TIME PM12:30 - PM13:30) <br>
				SAT, SUN, HOLIDAY CLOSE <br>
				업무시간외 문의는 <br>
				Q＆A 게시판을 이용부탁드립니다. <br>
				우리은행 1005-504-072722 <br>
				예금주 : (주)유엔미컴퍼니 <br>
			</div>
		</div>
		
		<div class="col-md-10 offset-2 content"> <!-- 본문 -->
		
			<div  id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-intervar="1000"> <!-- 캐러셀 -->
			
				<div class="carousel-inner">
					<div class="carousel-item active"> <img alt="" src="img/무신사1.jpg"> </div>
					<div class="carousel-item"> <img alt="" src="img/무신사2.jpg"> </div>
					<div class="carousel-item"> <img alt="" src="img/무신사3.jpg"> </div>
					<div class="carousel-item"> <img alt="" src="img/무신사4.jpg"> </div>
					<div class="carousel-item"> <img alt="" src="img/무신사5.jpg"> </div>
				</div>
				
				<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>
				<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
					<span class="carousel-control-next-icon"></span>
				</button>
				
				<div class="carousel-indicators">
					<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
					<button data-bs-target="#cs" data-bs-slide-to="1"></button>
					<button data-bs-target="#cs" data-bs-slide-to="2"></button>
					<button data-bs-target="#cs" data-bs-slide-to="3"></button>
					<button data-bs-target="#cs" data-bs-slide-to="4"></button>
				</div>
				
			</div>
			
			<div class="text-center">
				<br><br><br>
				<h3>BEST SELLER</h3>
				<p class="text-secondary">#베스트 셀러</p>
				<br><br><br>
			</div>
			
			<div> <!-- 제품 -->
				<div class="row">
					
					<%for (int i=0; i<26; i++) { %>
				
					<div class="col-md-4 col-sm-8">
						<div class="card">
							<img class="card-img-top" alt="" src="img/해일로2.gif">
							<div class="card-body">
								<p class="item">
								<span class="title">준석이 티셔츠</span>
							</div>
							<hr>
							<span class="text-dark"> 22,000원 </span>
						</div>
					</div>
					<% } %>
				</div>
			</div>
			
			<div class="text-center">
				<br><br><br>
				<h3>NEW ARRIVALS</h3>
				<p class="text-secondary">#이번주 신상품</p>
				<br><br><br>
			</div>
			
			<div> <!-- 제품 -->
				<div class="row">
					
					<%for (int i=0; i<26; i++) { %>
				
					<div class="col-md-4 col-sm-8">
						<div class="card">
							<img class="card-img-top" alt="" src="img/해일로2.gif">
							<div class="card-body">
								<p class="item">
								<span class="title">준석이 티셔츠</span>
							</div>
							<hr>
							<span class="text-dark"> 22,000원 </span>
						</div>
					</div>
					<% } %>
				</div>
			</div>
			
			<div class="text-center">
				<br><br><br><br><br><br>
				<h3>INSTAGRAM</h3>
				<p class="text-secondary">@hunsgram</p>
				<br><br><br>
			<div> <!-- 푸터 -->
			<br><br><br><br><br><br>
			<hr>
			<br><br><br><br><br><br>
				
				<div class="row">
					<div class="col-md-4">
					 	<div>
					 		<h4 class="text-secondary">SHOP INFO.</h4>
					 		<ul>
					 			<li> <a href="#"> ABOUT US </a> </li>
					 			<li> <a href="#"> AGREEMENT </a> </li>
					 			<li> <a href="#"> PRIVACY POLICY </a> </li>
					 			<li> <a href="#"> SHOPPING GUIDE </a> </li>
					 		</ul>
					 	</div>
					</div>
					<div class="col-md-4">
						<h4 class="text-secondary">SHOP INFO.</h4>
						<h2>내 전화 번호~</h2>
					 		<ul>
					 			<li> <a href="#"> 카카오채널 : @훈스 </a> </li>
					 		</ul>
					 	<p>
					 		MON - FRI AM9 - PM4 <br><br>
							(LUNCH TIME PM12:30 - PM13:30) <br><br>
							SAT, SUN, HOLIDAY CLOSE <br><br>
							업무시간외 문의는 <br><br>
							Q＆A 게시판을 이용부탁드립니다. <br><br>
							B A N K    A C C O U N T . <br><br>
							우리은행 1005-504-072722 <br><br>
							예금주 : (주)유엔미컴퍼니 <br><br>
					 	</p>
					</div>
					
					<div class="col-md-4">
						<h4 class="text-secondary">C O M P A N Y    I N F O .</h4>
						<p >
							COMPANY : (주)유엔미컴퍼니 CEO : 유재갑 TEL : 070-7710-4745 <br><br>
							BUSINESS NUMBER : 693-81-01950 / 2021-경기하남-0552 [사업자정보확인] <br><br>
							ADDRESS : 13024 경기도 하남시 하남대로 506 (하산곡동) 2층 <br><br>
							ADMIN : 김미연 (youandme3800@naver.com) HOSTING : (주)CAFE24 <br><br>
							온라인 전자상거래 안전 서비스 [서비스가입사실확인] <br><br>
							반품주소 / CJ대한통운(1588-1255) <br><br>
							CJ대한통운 반품주소 : 우편번호 05839) 서울시 송파구 충민로52 CJ대한통운 잠실유정대리점 <br><br>
							타택배이용 반품주소 : 우편번호 12729) 경기도 광주시 초월읍 산수로 625-12 A동 3층 <br><br>
							※타택배 이용시 로젠택배,롯데택배불가(반송될수 있습니다)※ <br><br>
							Copyright © (주)유엔미컴퍼니. All rights reserved. by uuniq. <br><br>
						</p>
					</div>
					
				</div>
			</div>
				
			</div>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
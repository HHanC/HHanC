<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<!-- 현재 위치(파일)에 다른 파일 포함하기 -->
	<%@include file="header.jsp" %>
	<br><br><br><br><br><br>
	<!-- 캐러셀 : 이미지 슬라이드 -->
	<div id="cs" class="caroucel slide" data-bs-ride="carousel" data-bs-interval="1000">
												<!-- interval : 밀리초(1000/1초) -->
		<!-- 슬라이드 위치 표시 : 인디케이터  -->
		
		<div class="carousel-indicators">
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="1"></button>
			<button data-bs-target="#cs" data-bs-slide-to="2"></button>
			<button data-bs-target="#cs" data-bs-slide-to="3"></button>
		</div>
		
		<!-- 캐러셀 내용물 -->							
		<div class="carousel-inner">
			<div class="carousel-item active"> <img alt="" src="img/무신사1.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/무신사2.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/무신사3.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/무신사4.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/무신사5.jpg"> </div>
		</div>
		
		<!-- 이미지 이동 버튼 -->
		<button class="carousel-control-prev" data-bs-taget="#cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		
		<button class="carousel-control-next" data-bs-taget="#cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
	</div> <!-- 캐러셀 end -->
	<br><br>
	
	<div class="container text-center">
		<hr> <!-- 실선 -->
			<h3> new ARRIVAL </h3>
			<p> 신상품 </p>
	</div>
	
	<div class="container">
		<div class="row">
		
			<% for(int i = 0; i<8; i++) { %>
		
			<div class="col-md-3 col-sm-6"> <!-- col-md : 760px 이상일경우 col-sm : 570px 이상일경우 -->
				<div class="card"> <!-- 카드형식 -->
					<img class="card-img-top" alt="" src="img/해일로2.gif"><!-- 이미지 -->
					<div class="card-body">
						<p class="item">
						<span class="title">스탠다드 세미 오버핏 7부 무지티</span>
						<br>
						<span class="content">
							마하그리드(MAHAGRID)는 '위대함'을 나타내는 인도네시아어 MAHA와 격자무늬를 뜻하는 GRID라는 두 가지의 키워드를 섞어 '위대한 이정표'라는 의미를 지닙니다. 
							미국의 하위 문화부터 성장한 스트릿 컬처의 역사를 하나의 이정표로 삼고 그 안에서 가치를 지닌 다양한 요소를 현재의 시점에서 재해석한다는 의미를 내포합니다.
						</span>
						<br>
						<span class="price1">79,000원 </span>
						<span class="price2">75,900 </span>
						<br>
						<span class="badge bg-warning text-dark my-3">주문 폭주</span>
						<span class="badge bg-danger text-dark my-3">품절 임박</span>
						
					</div>
				</div>
			</div>
			
			<% } %>
			
		</div>
	</div>
	
	<%@include file="footer.jsp" %>

</body>
</html>




















<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	<br><br><br><br><br><br>
	<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="1000">
		
		<div class="carousel-inner round">
			<div class="carousel-item active"> <img alt="" src="img/���Ż�1.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/���Ż�2.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/���Ż�3.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/���Ż�4.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/���Ż�5.jpg"> </div>
		</div>
		
		<button class="carousel-control-prev" data-bs-taget="#cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		
		<button class="carousel-control-next" data-bs-taget="#cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
		
		<div class="carouser-indicators">
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="1"></button>
			<button data-bs-target="#cs" data-bs-slide-to="2"></button>
			<button data-bs-target="#cs" data-bs-slide-to="3"></button>
			<button data-bs-target="#cs" data-bs-slide-to="4"></button>
		</div>
	</div>
	
	<br><br>
	
	<div class="container text-center">
			<h3>BEST SELLER</h3>
			<p>#����Ʈ����</p>
	</div>
	
	<div class="container">
		<div class="row">
		
			<%for (int i=0; i<8; i++) { %>
		
			<div class="col-md-4 col-sm-8">
				<div class="card">
					<img class="card-img-top" alt="" src="img/���Ϸ�2.gif">
					<div class="card-body">
						<p class="item">
						<span>[1+1+1]���̽� �� ����Ƽ</span>
					</div>
					<hr>
					<span class="badge text-dark"> 22,900 </span>
				</div>
			</div>
			<% } %>
		</div>
		<br><br>
		<div class="container text-center my-3">
			<h3>NEW ARRIVALS</h3>
			<p>#�̹��� �Ż�ǰ</p>
		</div>
		
		<div class="row">
		
			<%for (int i=0; i<8; i++) { %>
		
			<div class="col-md-4 col-sm-8">
				<div class="card">
					<img class="card-img-top" alt="" src="img/���Ϸ�2.gif">
					<div class="card-body">
						<p class="item">
						<span>[1+1+1]���̽� �� ����Ƽ</span>
					</div>
					<hr>
					<span class="badge text-dark"> 22,900 </span>
				</div>
			</div>
			<% } %>
		</div>
		<br><br><br><br><br><br><br><br>
		<div class="container text-center my-3">
			<h3>INSTAGRAM</h3>
			<p>???????</p>
		</div>
	</div>
	<br><br><br><br><br><br><br><br>
	<%@include file="footer.jsp" %>
	
</body>
</html>













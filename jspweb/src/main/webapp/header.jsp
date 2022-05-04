<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>준석이월드</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<!-- 사용자 정의 css -->
	<link href="/jspweb/css/main.css" rel="stylesheet">
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	
	<!-- 헤더 페이지 [모든 페이지 사용되기 때문에 = 절대경로]-->
	
	<%
		String loginid = (String)session.getAttribute("login"); // 세션 호출 (기본타입 = Object)
	%>
	
	<!-- 공통 -->
	<a href="/jspweb/main.jsp">준신사</a>
	<a href="#"> BIG SIZE ! </a>
	<a href="#"> MUSCLE-FIT </a>
	<a href="#"> 아우터 </a>
	<a href="#"> 상의 </a>
	<a href="#"> 바지 </a>
	<a href="#"> 슈즈 </a>
	<a href="#"> 악세사리 </a>
	<a href="#"> 트레이닝 </a>
	<a href="#"> 모델처럼입자! </a>
	<a href="#"> 50% 할인 </a>
	<input type="text"> <button> 검색 </button>
	<a href="#"> <img alt="" src=""> 장바구니이미지 </a>
	
	<!-- 로그인이 안된 상태 = 만약에 세션이 없으면 -->
	<%if(loginid == null){%>
	<a href="/jspweb/member/login.jsp">로그인</a>
	<a href="/jspweb/member/signup.jsp">회원가입</a>
	<%} %>
	<!-- 만약에 로그인된 상태 = 만약에 세션이 있으면 -->
	<%if(loginid != null){%>
		<span><%=loginid %>님</span>
		<a href="/jspweb/logout">로그아웃</a>
		<a href="/jspweb/member/myshopping.jsp">나의쇼핑</a>
	<%} %>
	<a href="#"> 고객샾 </a>
	
	<!-- 사용자 정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>












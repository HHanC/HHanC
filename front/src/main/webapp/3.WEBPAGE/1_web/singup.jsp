<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		#contents{
			margin: 200px 200px;
		}
	
		h3{text-align: center;}
		li {list-style-type: none;} /*글머리 제거*/
		#join{
			width: 600px;
			margin: 0 auto; /*가운데 정렬*/
			border-top: solid 2px red; 
			border-bottom: solid 2px red;
			padding: 30px; 
		}
		.cols{padding: 5px;}
		.cols li{display: inline-block;}
		.col1{width: 150px;}
		.col2 input{width: 200px; height: 20px;}
		.email input, select {height: 20px;}
		.hello{vertical-align: top;} /*텍스트 세로정렬*/
	</style>

</head>
<body>

	<!-- 헤더 -->
	<%@include file="header.jsp"%> 
	
	<%@include file="mainimage.jsp"%> 
	<!-- 헤더 이미지 -->
	<!-- 본문 -->
	<div id="contents">
		<form>
		<h3>회원 가입 폼</h3>
			<ul id="join">
				<li>		
					<ul class="cols">
						<li class="col1">아이디</li>
						<li class="col2"> <input type="text"> </li>
					</ul>
				</li>
				<li> 
					<ul class="cols">
						<li class="col1">비밀번호</li>
						<li class="col2"> <input type="password"> </li>
					</ul>
				</li>
				<li>
					<ul class="cols">
						<li class="col1">비밀번호 확인</li>
						<li class="col2"> <input type="password"> </li>
					</ul> 
				 </li>
				<li>
					<ul class="cols">
						<li class="col1">이름</li>
						<li class="col2"> <input type="text"> </li>
					</ul> 
				</li>		
				<li>
					<ul class="cols">
						<li class="col1">이메일</li>
						<li class="col2"> <input type="text"> @
					<select>
						<option>직접입력</option>
						<option>www.naver.com</option>
						<option>www.google.com</option> 
					</select>  </li>
					</ul>	
				 </li>
				 <li>
				 	<ul class="cols">
				 		<li class="col1">이메일 수신</li>
				 		<li class="col2"> <input type="radio" name="qweqwe"> 비수신 
						<input type="radio" name="qweqwe"> 수신</li>
				 	</ul>	 
				 </li>
				 <li>
				 	<ul class="cols">
				 		<li class="col1">가입 경로 </li>
				 		<li class="col2"> <input type="checkbox"> 친구추천
					 	<input type="checkbox"> 인터넷 검색
					 	<input type="checkbox"> 기타 </li>
				 	</ul>
				  </li>
				 <li>
				 	<ul class="cols">
				 		<li class="col1 hello">인사말</li>
				 		<li class="col2"><textarea rows="6" cols="40"></textarea></li>
				 	</ul>
				 </li>				
			</ul>
	
	</form>
	</div>
	<!-- 푸터 -->
	<%@include file="footer.jsp" %>

</body>
</html>
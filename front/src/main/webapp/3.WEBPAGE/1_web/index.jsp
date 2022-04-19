<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		a{text-decoration: none; color: black;}
		a:hover {color: orange;}
		/* 기본값으로 여백이 들어가는 경우 기본 여백 제거 */
		*{padding: 0px; margin: 0px; }
		
		#header{
			width: 1150px;
			margin: 0 auto; /*박스권 가운데 정렬*/
			height: 100px;
		}
		#main_img{
			width: 100%;
			height: 250px;
		}
		#contents{
			width: 1150px;
			margin: 0 auto;
		}
		#footer{
			width: 100%;
			clear: both;
			height: 150px;
			background-color: black;
			margin-top: 100px;
		}
	
	</style>

</head>
<body>

	<!-- jsp문법 : 속성 태그[자바 사용가능] -->
	<%@include file="header.jsp"%> 
	
	<%@include file="mainimage.jsp"%> 
	
	<%@include file="main.jsp" %>
	
	<%@include file="footer.jsp" %>
	
</body>
</html>












<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<style type="text/css">
		
		li{list-style-type: none;}
		a{text-decoration: none; color: black;} /*밑줄 제거*/
		a:hover{color: orange;}
		#header{height: 200px;}
		#box{width: 1100px; margin: 0 auto;}
		#logo{float: left; margin: 50px 0 0 50px;}
		#menus{float: right; text-align: right;}
		#menus li{display: inline;}
		@font-face { /*웹 폰트*/
		    font-family: 'HallymGothic-Regular';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2204@1.0/HallymGothic-Regular.woff2') format('woff2');
		    font-weight: 400;
		    font-style: normal;
		}
		#top_menu{margin: 30px 0px;}
		#top_menu li{margin-left: 10px;}
		#main_menu li{
			font-family: "HallymGothic-Regular";
			font-size: 20px; margin: 50px 0 0 100px;
		}
	
	</style>

</head>
<body>

	<div id="header"> <!-- 헤더 전체  -->
		<div id="box"> <!-- 헤더내 박스권 -->
			<div id="logo"> <!-- 로고 -->
				<img alt="" src="img/logo.png">
			</div>
			
			<div id="menus"> <!-- 메뉴 -->
				<ul id="top_menu"> <!-- 상단 메뉴 -->
					<li> 한준석(junseook)님 | </li>
					<li> <a href="#"> 로그아웃 </a> | </li>
					<li> <a href="#"> 정보수정 </a> | </li>
				</ul>
				
				<ul id="main_menu"> <!-- 하단 메뉴 -->
					<li> <a href="index.jsp"> Home </a> </li>
					<li> <a href="#"> 출석부 </a> </li>
					<li> <a href="galley.jsp"> 작품갤러리 </a> </li>
					<li> <a href="#"> 게시판 </a> </li>
				</ul>
			</div>
		</div>
	</div>

</body>
</html>
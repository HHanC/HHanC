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
		*{padding: 0px; margin: 0px;}
		
		#header{
			width: 1150px;
			margin: 0 auto;
			height: 100px;
		}
		#logo{
			float: left; margin: 20px 0 0 20px; /* 시계방향 : 왼쪽 위 오른쪽 아래 */
		}
		#menu{
			float: right;
		}
		#top_menu{
			text-align: right;
			margin-top: 20px;
		}
		#main_menu{
			margin-top: 20px; font-family: "궁서";
			font-size: 20px;
		}
		#main_menu li{
			display: inline; /* 메뉴 가로 배치 */
			margin-left: 80px;
		}
		
	</style>

</head>
<body>

	<div id="header"> <!-- header -->
		<div id="logo"> <!-- 로고 -->
			<a href="index.jsp"> <img alt="" src="img/배킹.png"> </a>
		</div>
		
		<div id="menu"> <!-- menu -->
			<div id="top_menu"> <!-- 상단메뉴 -->
				<a href="login.jsp">로그인</a>
				<a href="logout">로그아웃</a>
				<a href="modify">정보수정</a>
			</div>
			<ul id="main_menu"> <!-- 메인 메뉴 -->
				<li> <a href="#"> Home </a> </li>
				<li> <a href="#"> 출석부 </a> </li>
				<li> <a href="#"> 작품갤러리 </a> </li>
				<li> <a href="#"> 게시판 </a> </li>
			</ul>
		</div>
	</div>

</body>
</html>
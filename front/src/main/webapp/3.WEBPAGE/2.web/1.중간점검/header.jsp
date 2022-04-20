<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		li {list-style-type: none;}
		a{text-decoration: none; color: black;}
		a:hover {color: orange;}
		#header{height: 30px;}
		#box{width: 1100px; margin: 0 auto;}
		
		#logo1{
			font-weight: bold;
			font-size: 20px;
			color: blue;
			float: left;
			width: 40px;
			margin: 20px 0 0 20px;
		}
		#logo2{
			font-weight: bold;
			font-size: 20px;
			float: left;
			margin: 20px 0 0 20px;
		}
		#logo{float: left; margin: 20px 0 0 20px;}
		#menus{float: right; text-align: right;}
		#menus li{display: inline;}
		@font-face {
		    font-family: 'HallymGothic-Regular';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2204@1.0/HallymGothic-Regular.woff2') format('woff2');
		    font-weight: 400;
		    font-style: normal;
		}
		#top_menu{margin: 20px 0px;}
		#top_menu li{margin-left: 10px;}
		#main_menu li{
			font-family: "HallymGothic-Regular";
			font-size: 20px; margin: 50px 0 0 100px;
		}
		
		
		
	</style>

</head>
<body>

	<div id="header">
		<div id="box">
			<div id="logo1"> THE </div>
			<div id="logo2"> 스튜디오 </div>
			
			<div id="menus">
				<ul id="top_menu">
					<li> <a href="#"> 스튜디오 소개 </a> </li>
					<li> <a href="#"> 스튜디오 예약 </a> </li>
					<li> <a href="#"> 블로그 </a> </li>
					<li> <a href="#"> 포토 갤러리 </a> </li>
					<li> <a href="#"> 오시는 길 </a> </li>
				</ul>
			</div>
			
		</div>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		#all{
			margin: 0 auto; width: 900px;
		}
	
		#content{
			width: 1150px;
			margin: 0 auto;
		}
		li{list-style-type: none;}
		#sub_menu{
			width: 240px;
			float: left;
		}
		.빵_1{
			width: 80px; height: 80px;
			border: 1px #eeeeee solid;
		}
		#main_content{
			  display: inline-block;
   			 float: left;
		}
		#빵all{
			float: left;
		}
		
	</style>

</head>
<body>
	<div id="all">
	<div id="content">
		<div id="sub_menu"> <!-- 왼쪽 사이드바 -->
			<h3> The 베이킹 </h3>
			<ul>
				<li>
					안녕하세요. 쿠키와 빵 만들<br>
					기 정보를 공유하고 소통하<br>
					는 공간입니다.
				</li>
			</ul>
			<div>
				<input type="text"> 
				<input type="button" value="검색"> 
			</div>
			<h3>베이킹/요리</h3>
			<ul>
				<li><a href="#">쿠키 만들기</a></li>
				<li><a href="#">빵 만들기</a></li>
				<li><a href="#">마카롱 만들기</a></li>
			</ul>
			<h3>최근 댓글</h3>
			<ul>
				<li><a href="#">쿠키 만들기</a></li>
				<li><a href="#">빵 만들기</a></li>
				<li><a href="#">마카롱 만들기</a></li>
			</ul>
			
		</div>
		
		<div id="main_content">
		<table border="1" style="border-collapse: collapse;">
			<tr> <th colspan="10">알림</th> </tr>
			<tr>
				<td>쿠키 클래스를 연기합니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>쿠키 클래스를 연기합니다.</td>
				<td>09:30</td>
			</tr>
			<tr>	
				<td>쿠키 클래스를 연기합니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>쿠키 클래스를 연기합니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>쿠키 클래스를 연기합니다.</td>
				<td>09:30</td>
			</tr>
		</table>
		<table border="1" style="border-collapse: collapse;">
			<tr> <th colspan="10">게시판</th> </tr>
			<tr>
				<td>안녕하세요. 반갑습니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>안녕하세요. 반갑습니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>안녕하세요. 반갑습니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>안녕하세요. 반갑습니다.</td>
				<td>09:30</td>
			</tr>
			<tr>
				<td>안녕하세요. 반갑습니다.</td>
				<td>09:30</td>
			</tr>
		</table>
		</div>
		
		<table id="빵all" style="border-collapse: collapse;">
			<tr > <th colspan="2"> 제빵 클래스 </th> </tr>
			<tr class="빵1">
				<td> <img class="빵_1" alt="" src="img/빵.jpg">
				<p style="font-weight: bold;">도너츠만들기</p>
				<p>21:09:30</p>
				</td>
				<td> <img class="빵_1" alt="" src="img/빵.jpg"> 
				<p style="font-weight: bold;">도너츠만들기</p>
				<p>21:09:30</p>
				</td>
			</tr>
			<tr class="빵2">
				<td> <img class="빵_1" alt="" src="img/빵.jpg">
				<p style="font-weight: bold;">도너츠만들기</p>
				<p>21:09:30</p>
				</td>
				<td> <img class="빵_1" alt="" src="img/빵.jpg">
				<p style="font-weight: bold;">도너츠만들기</p>
				<p>21:09:30</p>
				</td>
			</tr>
			
		</table>
		
	</div>
	</div>
</body>
</html>























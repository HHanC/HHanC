<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		
		*{text-align: center;}
		
		#공지사항{text-align: center;}
		#검색{text-align: center;}
		#li1{float: left; width: 400px; border-bottom: solid 1px gray;}
		#li2{float: left; width: 400px; border-bottom: solid 1px gray;}
		#li3{float: left; width: 400px; border-bottom: solid 1px gray;}
		#번제등{margin-left: 400px; border: solid 1px gray; margin-right: 300px;}
		li{list-style-type: none;}
		
		#num3{clear:both; float: left; width: 400px; border-bottom: solid 1px gray;}
		#공3{float: left; width: 400px; border-bottom: solid 1px gray;}
		#날3{float: left; width: 400px; border-bottom: solid 1px gray;}
		#삼공날{margin-left: 400px;}
		
		#num2{clear:both; float: left; width: 400px; border-bottom: solid 1px gray;}
		#공2{float: left; width: 400px; border-bottom: solid 1px gray;}
		#날2{float: left; width: 400px; border-bottom: solid 1px gray;}
		#이공날{margin-left: 400px;}
		
		#num1{clear:both; float: left; width: 400px; border-bottom: solid 1px gray;}
		#공1{float: left; width: 400px; border-bottom: solid 1px gray;}
		#날1{float: left; width: 400px; border-bottom: solid 1px gray;}
		#일공날{margin-left: 400px;}
		
		#검색2{
			width: 300px; height: 40px; 
			margin: 10px;
		}
		#검색3{
			width: 200px; height: 45px; 
			margin: 10px;
		}
		
	</style>

</head>
<body>

	<%@include file="header.jsp"%> 
	<%@include file="mainimage.jsp"%> 
	
	<div id="contents">
		
		<div id="공지사항">
			<h3>공지사항</h3>
		</div>
		<div id="검색"> 
			<input id="검색2" type="text" value="검색어를 입력해주세요."> 
			<input id="검색3" type="button" value="검색">
		</div>
		<div>
			<div id="번제등">
				<ul>
					<li id="li1">번호</li>
					<li id="li2">제목</li>
					<li id="li3">등록일</li>
				</ul>
			</div>
			<div id="삼공날">
				<ul>
					<li id="num3">3</li>
					<li id="공3">[공지사항] 개인정보 처리방침 변경안내처리방침</li>
					<li id="날3">2017.07.13</li>
				</ul>
			</div>
			<div id="이공날">
				<ul>
					<li id="num2">2</li>
					<li id="공2">공지사항 안내입니다. 이용해주셔서 감사합니다.</li>
					<li id="날2">2017.06.15</li>
				</ul>
			</div>
			<div id="일공날">
				<ul>
					<li id="num1">1</li>
					<li id="공1">공지사항 안내입니다. 이용해주셔서 감사합니다.</li>
					<li id="날1">2017.06.15</li>
				</ul>
			</div>
		</div>
			
	</div>
	
	<%@include file="footer.jsp" %>
	
</body>
</html>
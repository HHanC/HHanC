<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	 <style type="text/css">
	 
	 	*{border: solid 1px red; }
	 
	 </style>

</head>
<body>

	<!-- 부트 스트랩 가져오기 -->
	<%@include file="1.설치.jsp" %>
	
	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<ul>
					<li> 메뉴1 </li>
					<li> 메뉴2 </li>
					<li> 메뉴3 </li>
					<li> 메뉴4 </li>
				</ul>
			</div>
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-5"> col-md-5 </div>
					<div class="col-md-5 offset-2"> col-md-5 </div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
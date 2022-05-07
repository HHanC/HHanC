<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "../header.jsp" %>
	<br><br><br><br><br>
		<div class="container"> 
			<div class="row">
				<div class="col-md-3"> <!-- 사이드바 -->
					<%@include file = "infosidebar.jsp" %>
				</div>
				<div class="col-md-9"> <!-- 본문 -->
					<h3>주문현황</h3>
				</div>
			</div>
		</div>
	<br><br><br><br><br>
	<%@include file = "../footer.jsp" %>

</body>
</html>
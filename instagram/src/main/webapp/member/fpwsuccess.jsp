<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String fpw =request.getParameter("fpw"); %> 
	<div>
		<%if(fpw != null){ %>
			회원님의 비밀번호는 <%=fpw %> 입니다.
		<%} %>
	</div>
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>
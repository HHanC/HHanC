<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String mname2 =request.getParameter("mname2"); %> 
	<div>
		<%if(mname2 != null){ %>
			회원님의 아이디는 <%=mname2 %> 입니다.
		<%} %>
	</div>
	
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>
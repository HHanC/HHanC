<%@page import="dao.ReplyDao"%>
<%@page import="dto.Reply"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		int bno = Integer.parseInt(request.getParameter("bno"));
		String memail = (String)session.getAttribute("login");
	%>
	
	<div>
		<div>댓글</div>
		<% if(memail != null){ %>
			<div> 
				<textarea id="rcontent" rows="" cols=""></textarea>
			</div>
			<div>
				<button onclick="replywrite(<%=bno%>)">게시</button>
			</div>
			<div id="replylist"></div>
		<%}else{%>
			로그인 후 사용
		<%} %>
		
		
		
	</div>
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/reply.js" type="text/javascript"></script>
</body>
</html>









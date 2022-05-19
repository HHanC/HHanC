<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
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

	<h3>메인 페이지</h3>
	<%
		String mid = (String)session.getAttribute("login");
		if(mid != null){
	%>
	 <a href="/instagram/board/boardwrite.jsp"> 게시물 작성으로 이동 </a> 
	<%} %>
	<div>
		<table>
			<% 
				// 모든 게시물 호출
				ArrayList<Board> boardlist = BoardDao.getBoardDao().getboardlist();
				for(Board board : boardlist) {
			%>
			<tr>
				<td><%=board.getBno() %></td>
				<td><%=board.getBfile() %></td>
				<td><%=board.getmname2()%></td>
				<td><%=board.getBcontent()%></td>
				<td><%=board.getBdate() %></td>
			</tr>
			<%}%>
		</table>
	</div>
	
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- jquery 연결 -->
	<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>
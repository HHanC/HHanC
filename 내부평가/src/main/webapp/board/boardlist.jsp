<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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

	<%@include file ="../header.jsp" %>
	
	<%
		ArrayList<Board> boardlist = BoardDao.getBoardDao().getboardlist();
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String today = dateFormat.format(date);
	%>
	
	<br><br><br>
	<div class="container">
		<div class="text-center">
			<h4> 리뷰작성 </h4>
		</div>
	<!-- ---------------------- 테이블 구역 -------------------------- -->
		<table class="table table-hover text-center"> <!-- 테이블 -->
			<tr>
				<th width="10%"> 번호 </th> 
				<th width="50%"> 제목 </th> 
				<th width="15%"> 작성자 </th> 
				<th width="15%"> 작성일 </th> 
			</tr>
			<%
				for(Board board : boardlist){
					String a = board.getBdate().split(" ")[0];
					String b = board.getBdate().split(" ")[1];
			%>
			<tr>
				<th width="10%"><%=board.getBno() %></th>
				<th width="50%"> <a href="boardview.jsp?bno=<%=board.getBno()%>"> <%=board.getBtitle()%> </a> </th>
				<th width="15%"><%=board.getBwrite() %></th>
				<%if(a.equals(today)){ %>
					<th width="15%"><%=b %></th>
				<%}else{ %>
					<th width="15%"><%=a %></th>
				<%} %>
			</tr>
			<%}%>
		</table>
		
		<!-- ---------------------- 글쓰기 버튼 구역 -------------------------- -->
		<div class="col-md-2 offset-10">
			<a href="boardwrite.jsp"> <button class="form-control">글쓰기</button> </a>
		</div>
	</div>
	
	<%@include file ="../footer.jsp" %>
</body>
</html>
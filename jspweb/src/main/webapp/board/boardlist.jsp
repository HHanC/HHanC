<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="dao.MemberDao"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%@include file = "../header.jsp" %>

	<div class="container">
	<h3> 자유게시판 </h3>
		<%
			String mid = (String)session.getAttribute("login");
			if(mid != null){
		%>
			<a href="boardwrite.jsp"> 글쓰기 </a>
		<%
		
			}
		%>
		<table class="table"> <!-- 테이블 -->
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th> <th> 조회수 </th> <th> 작성일 </th>
			</tr>
			<!-- for 문 -->
			<%
				ArrayList<Board> boardlist = BoardDao.boardDao.getboardlist();
				for(Board board : boardlist){
			%>
				<!-- 
					행을 클릭했을때[js] 
						<tr onclick="location.href='boardview.jsp'">
					링크(상세 페이지로 이동시) [식별 번호 같이 이동]
						// 1. HTML : <a href='파일명(경로).jsp?변수명=rkqt'">
						// 2. JS : "location.href='파일명(경로).jsp?변수명=값'"
						// 3. java : response.sendRedirect("파일명(경로),jsp?변수명=값");
				-->
				<tr>
					<td><%=board.getBno()%></td>
					<td> <a href="boardview.jsp?bno=<%=board.getBno()%>"> 
					<%=board.getBtitle()%>
					</a> 
					</td>
					<td><%=MemberDao.getMemberDao().getmid(board.getMno())%></td>
					<td><%=board.getBview()%></td>
					
			<%
				LocalDate localDate = LocalDate.now();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				String date2 = localDate.format(dateTimeFormatter);
				String[] date = board.getBdate().split(" ");
				if(date[0].equals(date2)){
			%>
				<td><%=date[1]%></td>
			
				<%}else{%>
			
				<td><%=board.getBdate()%></td>
				<%}%>
				<%}%>
				</tr>
		</table>
	</div>
	<%@include file = "../footer.jsp" %>

</body>
</html>
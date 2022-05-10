<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
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
	
	<%
		ArrayList<Board> list = BoardDao.getBoardeDao().getboardlist();
		String mid = (String)session.getAttribute("login");
		int mno = MemberDao.getMemberDao().getmno(mid);
	%>
	
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<%@include file="../member/infosidebar.jsp"%>
			</div>
			<div class="col-md-9">
				<h3>내가 쓴 글</h3>
				<table class="table">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>작성일</th>
					</tr>
						<%
						for(Board temp : list){
							if(temp.getMno() == mno){%>
							<tr>
								<td><%= temp.getMno()%></td>
								<td><%= temp.getBtitle()%></td>
								<td><%= mid%></td>
								<td><%= temp.getBview()%></td>
								<td><%= temp.getBdate()%></td>
							</tr>	
							<%}%>
						<%}%>
				</table>
			</div>
		</div>
	</div>
	
	
	<%@include file = "../footer.jsp" %>
</body>
</html>
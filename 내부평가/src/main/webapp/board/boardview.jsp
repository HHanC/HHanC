<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
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
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = BoardDao.getBoardDao().getboard(bno);
	%>

	<div class="container">
		
		<table class="table">
			<tr> 
				<td width="25%">번호  </td>
				<td width="25%">제목  </td>
				<td width="25%">내용 </td> 
				<td width="25%">날짜  </td>  
			</tr>
			<tr> 
				<td width="25%"><%=board.getBno() %>  </td>
				<td>
					<div>
						<%=board.getBtitle() %>
					</div>
				</td>
				<td width="25%">
					<div>
						<%=board.getBcontent() %>  
					</div>
				</td> 
				<td width="25%"><%=board.getBdate()%>  </td>  
			</tr>
		</table>	
		<div class="row">
			<div class="col-md-2">
				<a href="../board/delete?bno=<%=board.getBno() %>"><button class="form-control">삭제</button></a> 
			</div>	
			<div class="col-md-2">
				<a  href="../update.jsp?bno=<%=board.getBno() %>"><button class="form-control">수정</button></a>
			</div>
			<div class="col-md-2">
				<a href="boardlist.jsp"> <button class="form-control">목록</button> </a>
			</div>
		</div>
	</div>
	
	<script src="../js/board.js" type="text/javascript"></script>
</body>
</html>
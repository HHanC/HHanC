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
	<div class="container">
		<h4>글 보기</h4>
		
		<%
			int bno = Integer.parseInt(request.getParameter("bno"));
			Board board = BoardDao.getBoardDao().getboard(bno);
		%>
		
		<table>
			<tr>
				<td>
					<%=board.getmname2() %> <br>
					<%=board.getBcontent() %> <br>
					<%=board.getBdate() %> 
				</td>
			</tr>
		</table>
		
		<div>
			<div>
				<a href="../board/Boarddelete?bno=<%=board.getBno()%>"> <button>삭제</button> </a>
			</div>
			<div>
				<a href="boardupdate.jsp?bno=<%=board.getBno()%>"> <button>수정</button> </a>
			</div>
			<div>
				<a href="../main.jsp"> <button>목록</button> </a>
			</div>
		</div>
		
	</div>
	
	
	
</body>
</html>
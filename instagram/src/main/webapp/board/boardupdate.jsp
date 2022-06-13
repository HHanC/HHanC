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
	
	<%
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = BoardDao.getBoardDao().getboard(bno);
	%>
	<div>
		<a href="boardview.jsp?bno=<%=board.getBno()%>"> <button>X버튼</button> </a>
	</div>
	<form action="../board/Boardupdate?bno=<%=board.getBno()%>" method="post">
	
		<h3><%=board.getmname2() %></h3>
		<textarea name="bcontent"> <%=board.getBcontent() %> </textarea>
		<p> <%=board.getBdate() %> </p>
		<input type="reset" value="취소">
		<input type="submit" value="완료">
	</form>
					 
					
					 
			
</body>
</html>
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

	<%
		// view.jsp?bno=게시물번호
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardDao boardDao = new BoardDao();
		Board board = boardDao.get(bno);
		
		// 만약 로그인된 정보와 작성자가 동일할 경우 삭제/수정 표시
		String loginid = (String)session.getAttribute("loginid");
		if(loginid != null && loginid.equals(board.getBwriter())){
	%>
		<a href="bupdate.jsp?bno=<%=bno%>"> <button>수정</button> </a>
		<a href="bdeletecontroller.jsp?bno=<%=bno%>"> <button>삭제</button> </a>
	<%		
		}
	%>
	
	<a href="main.jsp"> <button>목록보기</button> </a>
	<div>제목 : <%=board.getBtitle() %></div>
	<div>작성자 : <%=board.getBwriter() %></div>
	<div>작성일 : <%=board.getBdate() %></div>
	<div>내용 : <%=board.getBcontent() %></div>
	
</body>
</html>












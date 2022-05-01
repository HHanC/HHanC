<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
		request.setCharacterEncoding("UTF-8"); // 요청시 데이터 인코딩 타입 설정
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer = (String)session.getAttribute("loginid");
			Date now = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = simpleDateFormat.format(now);
			
			Board board = new Board(0, title, content, writer, date);
			BoardDao boardDao = new BoardDao();
			boolean result = boardDao.write(board);
			if(result){
				response.sendRedirect("main.jsp");
			}
	
	%>

</body>
</html>
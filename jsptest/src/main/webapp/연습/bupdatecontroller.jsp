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
			request.setCharacterEncoding("UTF-8");
			String content = request.getParameter("content");
			String title = request.getParameter("title");
			int bno = Integer.parseInt((String)session.getAttribute("bno"));
			
			BoardDao boardDao = new BoardDao();
			boolean result = boardDao.update(content, title, bno);
			if(result){
				response.sendRedirect("main.jsp");
			}else{
				response.sendRedirect("main.jsp");
			}
		%>

</body>
</html>
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
		String id = (String)session.getAttribute("loginid");
		BoardDao boardDao = new BoardDao();
		boolean result = boardDao.delete(id);
		if(result){
			session.setAttribute("loginid",null);
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("main.jsp");
		}
	%>

</body>
</html>
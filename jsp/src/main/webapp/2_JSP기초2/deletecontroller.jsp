<%@page import="dao.Dao"%>
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
		Dao dao = new Dao();
		boolean result = dao.delete(id);
		if(result){
			session.setAttribute("loginid", null);
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("main.jsp");
		}
	%>

</body>
</html>
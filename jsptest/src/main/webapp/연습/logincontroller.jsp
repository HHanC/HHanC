<%@page import="dao.MemberDao"%>
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
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		
		MemberDao memberDao = new MemberDao();
		boolean result = memberDao.login(id, pw);
		if(result){
			response.sendRedirect("main.jsp");
			session.setAttribute("loginid", id);
		}else{
			response.sendRedirect("main.jsp");
		}
	%>

</body>
</html>
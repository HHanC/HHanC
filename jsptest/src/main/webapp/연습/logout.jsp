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
		session.setAttribute("loginid", null); // 세션명을 null로 설정했으니까 set
		response.sendRedirect("main.jsp");
	%>

</body>
</html>
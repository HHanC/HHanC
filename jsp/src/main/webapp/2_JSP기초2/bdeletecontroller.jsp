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
		// 1. 전 페이지로 부터 게시물 번호 요청
		int bno = Integer.parseInt(request.getParameter("bno"));
		// 2. dao 게시물 삭제 메소드 호출
		Dao dao = new Dao();
		boolean result = dao.ddelete(bno);
		// 3. 삭제가 성공하면 main페이지로
		if(result){
			response.sendRedirect("main.jsp");
		}
	%>

</body>
</html>
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
		String bno = request.getParameter("bno");
		session.setAttribute("bno", bno);
	%>

	<form action="bupdatecontroller.jsp" method="get">
		<input type="text" name="title">
		<textarea rows="5" cols="10" name="content"></textarea>
		<input type="submit" value="쓰기">
	</form>

</body>
</html>
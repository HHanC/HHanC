<%@page import="Dto.VoteDto"%>
<%@page import="Dao.Dao"%>
<%@page import="Dto.MemberDto"%>
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
		String v_JUMIN = request.getParameter("jomin");
		String v_NAME = request.getParameter("name");
		String m_NO = request.getParameter("no");
		String v_TIME = request.getParameter("time");
		String v_AREA = request.getParameter("plice");
		String v_CONFIRM = request.getParameter("o");
		
		Dao dao = new Dao();
		
		VoteDto voteDto = new VoteDto(v_JUMIN ,v_NAME, m_NO, v_TIME, v_AREA, v_CONFIRM);
		
		boolean result = dao.저장(voteDto);
		response.sendRedirect("list.jsp");
		
	%>

</body>
</html>
<%@page import="dto.Board"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
		request.setCharacterEncoding("UTF-8");
		String bcontent = request.getParameter("content");
		String btitle = request.getParameter("title");
		int bno = Integer.parseInt((String)session.getAttribute("bno"));
		
		Dao dao = new Dao();
		
		boolean result = dao.update(bcontent,btitle,bno);
		if(result){
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("main.jsp");
		}
	%>
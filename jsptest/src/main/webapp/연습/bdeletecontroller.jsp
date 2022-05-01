<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%
		int bno = Integer.parseInt((String)session.getAttribute("bno"));
		BoardDao boardDao = new BoardDao();
		boolean result = boardDao.bdelete(bno);
		if(result){
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("main.jsp");
		}
	%>
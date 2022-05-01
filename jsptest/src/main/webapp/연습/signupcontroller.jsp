<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		Member member = new Member(0, id, password, name);
		
		MemberDao memberDao = new MemberDao();
		
		boolean result = memberDao.signup(member);
		
		if(result){
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("main.jsp");
		}
		
	%>
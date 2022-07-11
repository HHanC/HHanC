<%@page import="dao.Dao"%>
<%@page import="dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	int custno = Integer.parseInt( request.getParameter("custno") );
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	MemberDto dto = new MemberDto( custno , custname , phone , address , joindate , grade , city );
	
	Dao dao = new Dao();
	boolean result =  dao.수정(dto);
	response.sendRedirect("update.jsp?custno="+custno);

%>
<%@page import="Dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "header.jsp" %>
	
	<%
		Dao dao = new Dao();
		ArrayList<MemberDto> list = dao.후보자등수();
	%>
	
	<table>
		<tr>
			<th>후보번호</th> <th>성명</th> <th>총투표건수</th>
		</tr>
		<%
			for(MemberDto memberDto : list){
		%>
		<tr>
			<td><%=memberDto.getM_NO()%></td> <td><%=memberDto.getM_NAME() %></td> <td><%=memberDto.getV_CONFIRM() %></td>
		</tr>
		<%} %>
	</table>

</body>
</html>
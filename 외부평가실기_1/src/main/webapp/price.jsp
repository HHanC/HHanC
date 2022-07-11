<%@page import="java.util.ArrayList"%>
<%@page import="dto.MemberDto"%>
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

<%@include file="header.jsp" %>

	<%
		Dao dao = new Dao();
		ArrayList<MemberDto> list = dao.매출조회();
	%>
	
	<table>
		<tr>
			<th>회원번호</th><th>회원성명</th><th>고객등급</th><th>매출</th>
		</tr>
		<%
			for( MemberDto dto : list ){
				String 등급 = null;
				if( dto.getGrade().equals("A") ){
					등급 ="VIP";
				}else if( dto.getGrade().equals("B") ) {
					등급 = "일반";
				}else{
					등급 = "직원";
				}
		%>
			<tr>
				<td><%=dto.getCustno() %> </td>
				<td><%=dto.getCustname() %> </td>
				<td><%=등급 %> </td>
				<td><%=dto.getSumprice() %> </td>
			</tr>
		<% 	
			}
		%>
	</table>

</body>
</html>










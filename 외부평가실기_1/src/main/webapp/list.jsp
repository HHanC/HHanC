<%@page import="dao.Dao"%>
<%@page import="dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mysql.cj.x.protobuf.MysqlxDatatypes.Array"%>
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
		Dao dao= new Dao();
		ArrayList<MemberDto> list = dao.모든호출();
	%>
	<table>
	
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
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
				<td>
					<a href="update.jsp?custno=<%=dto.getCustno()%>">
						<%=dto.getCustno() %>
					</a>
				</td>
				<td><%=dto.getCustname() %></td>
				<td><%=dto.getPhone() %></td>
				<td><%=dto.getAddress() %></td>
				<td><%=dto.getJoindate() %></td>
				<td><%=등급 %></td>
				<td><%=dto.getCity() %></td>
			</tr>
		<% 		
			}
		%>
	
	</table>

</body>
</html>



























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
		int custno = Integer.parseInt( request.getParameter("custno") );
		Dao dao = new Dao();
		MemberDto dto = dao.개별호출( custno  );
	%>
	<form name="update" action="updatecontroller.jsp" method="post">
	<table>
		<tr><td> 회원번호 </td>
			<td> <input type="text" name="custno" id="custno" value="<%=dto.getCustno()%>">
		</tr>
		<tr><td> 회원성명 </td>
			<td> <input type="text" name="custname" id="custname" value="<%=dto.getCustname()%>">
		</tr>
		<tr><td> 회원전화 </td>
			<td> <input type="text" name="phone" id="phone" value="<%=dto.getPhone()%>"> 
		</tr>
		<tr><td> 회원주소 </td>
			<td> <input type="text" name="address" id="address" value="<%=dto.getAddress()%>">
		</tr>
		<tr><td> 가입일자 </td>
			<td> <input type="text" name="joindate" id="joindate" value="<%=dto.getJoindate()%>">
		</tr>
		<tr><td> 고객등급[A:VIP,B:일반,C:직원] </td>
			<td> <input type="text" name="grade" id="grade" value="<%=dto.getGrade()%>">
		</tr>
		<tr><td> 도시코드 </td>
			<td> <input type="text" name="city" id="city" value="<%=dto.getCity()%>">
		</tr>
		<tr>
			<td> 
				<button type="button" onclick="updatechk()">수정</button> 
				<button type="button" onclick="location.href='list.jsp'">조회</button> 
			</td>
		</tr>
	</table>
	</form>
	<script type="text/javascript" src="write.js"></script>

</body>
</html>
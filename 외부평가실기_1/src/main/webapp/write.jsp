<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="javax.swing.text.DateFormatter"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.time.LocalDate"%>
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
		Dao dao= new Dao();
		int maxcustno = dao.get마지막번호()+1;
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyyMMdd");
		String nowdate = formatter.format( date );
	%>
	<form name="join" action="joincontroller.jsp" method="post" >
	<table>
		<tr><td> 회원번호 </td>
			<td> <input type="text" name="custno" id="custno" value="<%=maxcustno%>">
		</tr>
		<tr><td> 회원성명 </td>
			<td> <input type="text" name="custname" id="custname">
		</tr>
		<tr><td> 회원전화 </td>
			<td> <input type="text" name="phone" id="phone"> 
		</tr>
		<tr><td> 회원주소 </td>
			<td> <input type="text" name="address" id="address">
		</tr>
		<tr><td> 가입일자 </td>
			<td> <input type="text" name="joindate" id="joindate" value="<%=nowdate%>">
		</tr>
		<tr><td> 고객등급[A:VIP,B:일반,C:직원] </td>
			<td> <input type="text" name="grade" id="grade" >
		</tr>
		<tr><td> 도시코드 </td>
			<td> <input type="text" name="city" id="city" >
		</tr>
		<tr>
			<td> 
				<button type="button" onclick="joinchk()">등록</button> 
				<button type="button" onclick="location.href='list.jsp';">조회</button> 
			</td>
		</tr>
	</table>
	</form>
	<script type="text/javascript" src="write.js"></script>

</body>
</html>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="javax.swing.text.DateFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="Dto.VoteDto"%>
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
		ArrayList<VoteDto> list = dao.모든검수조회();
		
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY"+"년"+"MM"+"월"+"DD"+"일생");
		String nowdate = dateTimeFormatter.format(localDate);
	%>

	<table>
		<tr>
			<th>성명</th>
			<th>생년월일</th>
			<th>나이</th>
			<th>성별</th>
			<th>후보번호</th>
			<th>투표시간</th>
			<th>유권자확인</th>
		</tr>
		<%
			for(VoteDto voteDto : list){
				String 유권자 = null;
				if(voteDto.getV_CONFIRM().equals("Y")){
					유권자 = "확인";
				}else{
					유권자 = "미확인";
				}
			
		%>
		<tr>
			<td><%=voteDto.getV_NAME() %></td>
			<td><%=nowdate%></td>
			<td><%=voteDto.getV_NAME() %></td>
			<td><%=voteDto.getV_NAME() %></td>
			<td><%=voteDto.getM_NO() %></td>
			<td><%=voteDto.getV_TIME() %></td>
			<td><%=유권자 %></td>
		</tr>
		<%} %>
	</table>

</body>
</html>
<%@page import="Dto.PartyDto"%>
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
			ArrayList<MemberDto> list = dao.모든회원조회();
			PartyDto partyDto = dao.대표전화();
	%>

	<table>
		<tr>
			<th>후보번호</th> <th>성명</th> <th>소속정당</th> <th>학력</th> <th>주민번호</th> <th>지역구</th> <th>대표전화</th>
		</tr>
		<%
			for(MemberDto memberDto : list){
				String 학력 = null;
				if(memberDto.getP_SCHOOL().equals("1")){
					학력 = "고졸";
				}else if(memberDto.getP_SCHOOL().equals("2")){
					학력 = "학사";
				}else if(memberDto.getP_SCHOOL().equals("3")){
					학력 = "석사";
				}else{
					학력 = "박사";
				}
		%>
		<tr>
			<td><%=memberDto.getM_NO()%></td>
			<td><%=memberDto.getM_NAME()%></td> 
			<td><%=memberDto.getP_CODE()%></td> 
			<td><%=학력%></td> 
			<td><%=memberDto.getM_JOMIN()%></td> 
			<td><%=memberDto.getM_CITY()%></td> 
			<td><%=partyDto.getP_TEL1()+'-'+partyDto.getP_TEL2()+'-'+partyDto.getP_TEL3()%></td>
		</tr>
		<%} %>
	</table>

</body>
</html>
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
	
	<form action="writecontroller.jsp" method="post" name="write">
		<table>
			<tr>
				<td>주민번호</td>
				<td> <input type="text" name="jomin" id="jomin">
			</tr>
			<tr>
				<td>성명</td>
				<td> <input type="text" name="name" id="name">
			</tr>
			<tr>
				<td>투표번호</td>
				<td> <input type="text" name="no" id="no"> <input type="checkbox">
			</tr>
			<tr>
				<td>투표시간</td>
				<td> <input type="text" name="time" id="time">
			</tr>
			<tr>
				<td>투표장소</td>
				<td> <input type="text" name="place" id="place">
			</tr>
			<tr>
				<td>유권자 확인</td>
				<td> <input type="radio" name="o" id="o"> 확인 <input type="radio" name="x" id="x"> 미확인
			</tr>
			<tr>
				<td>
					<button type="button" onclick="write2()">투표하기</button>
					<button type="button" onclick="write3()">다시하기</button>
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript" src="write.js"></script>

</body>
</html>
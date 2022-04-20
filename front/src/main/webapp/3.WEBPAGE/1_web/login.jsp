<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<style type="text/css">
	
		#contents{
			width: 1150px; margin: 0 auto;
		}
		h3{text-align: center;}
 		#join{
 			margin: 0 auto;
 		}
 		#d{
 			width: 70px; height: 50px;
 		}
	
	</style>

</head>
<body>

	<!-- 헤더 -->
	<%@include file="header.jsp"%> 
	
	<%@include file="mainimage.jsp"%> 
	<!-- 헤더 이미지 -->
	<!-- 본문 -->
	<div id="contents">
		<h3>로그인</h3>
	<table id="join">
		<tr>
			<td>아이디</td> <td><input type="text"> </td> 
			<td rowspan="2"> <input type="button" value="로그인" id="d"> </td>
		</tr>
		<tr>
			<th>비밀번호</th> <th> <input type="password"> </th>
		</tr>
	</table>
	</div>
	<!-- 푸터 -->
	<%@include file="footer.jsp" %>

</body>
</html>
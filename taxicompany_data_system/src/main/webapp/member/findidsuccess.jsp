<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%String mid=request.getParameter("mid"); %>
	<%@include file="../header.jsp" %>
	
	<div class="container">
		<div class="col-md-12">
			
			<%if(mid != null){
			%>	
				회원님의 아이디는 <%=mid%> 입니다.
			<%
			}
			%>
			
			
		</div>
	</div>
</body>
</html>
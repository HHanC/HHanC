<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file="../header.jsp" %>
<% String loginSignup = (String)session.getAttribute("login");%>

<div class="container">
	<div class="text-center">
		<div class="text-center">
			welcome!! TaxiCompany Data System 
		</div>
		<div class="col-md-12">
			<div class="offset-3 col-md-6">
				<div class="text-center py-5">
					Hello!! <%=loginSignup%>
				</div>
				<a href="../main.jsp"><button class="form-control">홈으로</button></a>
			</div>
			
			
		</div>
		
		
	</div>
</div>

<%@include file="../footer.jsp" %>
</body>
</html>
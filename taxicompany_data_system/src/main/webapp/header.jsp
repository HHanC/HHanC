<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TaxiCompany Data System</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자정의 css -->
	<link href="/taxicompany_data_system/css/main.css" rel="stylesheet">
	
	
</head>
<body>
		<%String login=(String)session.getAttribute("login"); %>
		
		<div class="text-center py-3">
			<div class="col-md-12 row">
				
				<div class="col-md-3">
					
					<a href="/taxicompany_data_system/main.jsp">HOME |</a>
					<a href="#">회사소개 |</a>
					<a href="#">요구사항접수 |</a>
					<a href="#">상담요청</a>
					
				</div>
				
				
				<div class="offset-6 col-md-3">
					<%
					if(login==null){
					%>
						<a href="/taxicompany_data_system/member/login.jsp">Login |</a>
						<a href="/taxicompany_data_system/member/agreementpage.jsp">SignUp</a>
					<%
					}else{
					%>
						<span style="color: blue;">welcome  <%=login%> |</span> 
						<a href="/taxicompany_data_system/Logout">Logout |</a>
						<a href="/taxicompany_data_system/main_sale.jsp">Sales |</a>
						<a href="/taxicompany_data_system/main_info.jsp">Info </a>
						
					<%
					}
					%>
				</div>
				
			</div>
			
		</div>
		
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/taxicompany_data_system/js/main.js" type="text/javascript"></script>
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

</body>
</html>
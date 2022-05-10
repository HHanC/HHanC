<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	
</style>
</head>
<body>
	
	<%@include file = "../header.jsp" %>

	
	<div class="container" style="padding-top: 100px; margin-left: 340px;">
		
		<div class=" col-md-11 text-center py-2">
		<a href="../main.jsp"><h1>Taxi Company Data System</h1></a>
		</div>
			<div class="col-md-12 text-center">
				<form action="../Login" method="post">
					
					<div class="offset-4 col-md-3 py-2 ">
						<input class="form-control" type="text" id="id" name="id"  placeholder="아이디">
					</div>
					
					<div class="offset-4 col-md-3 py-2">
						<input class="form-control" type="password" id="pwd" name="pwd"  placeholder="비밀번호">
					</div>
					<% 
					String result =request.getParameter("result");
					if(result != null && result.equals("2")){
					%>
					<div class="offset-4 col-md-3">
					<span class="check">동일한 회원정보가 없습니다.</span>
					</div>
					<%
					} 
					%>
					<div class="offset-4 col-md-3 py-2">
						<input class="form-control" type="submit" value="로그인">
					</div>
				</form>
				
				<div class="offset-4 col-md-3 py-2">
					<a href="agreementpage.jsp"><button class="form-control">회원가입</button></a>
				</div>
				
				<div class="offset-4 col-md-3 py-2">
					<a href="findid.jsp"><button class="form-control">아이디찾기</button></a>
				</div>
				
				<div class="offset-4 col-md-3 py-2">
					<a href="findpassword.jsp"><button class="form-control">비밀번호 찾기</button></a>
				</div>
			</div>
		
	</div>
	
		
</body>
</html>
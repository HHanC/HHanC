<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	
</style>
</head>
<body>

	

	<%@include file = "../header.jsp" %>
	
		<div class="container py-5">
			<div class="col-md-12">
				<div class="offset-4 col-md-4 py-5 text-center ">
					<a href="../main.jsp"><h2>Taxi Company Data System</h2></a>
				</div>
				
				<div class="offset-4 col-md-4 py-3">
					<form action="../FindId" method="get">
						<div class="py-5">
							<div class="text-left">이름</div>
							<div>
								<input type="text" name="mname" class="form-control" placeholder="가입하신 이름을 입력하여주세요.">
							</div>
						
							<div class="text-left">이메일</div>
							<div>
								<input type="text" name="memail" class="form-control" placeholder="가입하신 이메일을 입력하여주세요.">
								<span id="check" class="check">아이디찾기 라벨</span>
							</div>
						</div>
						<div>
							<input class="form-control" type="submit" value="아이디 찾기">
						</div>
						
					</form>
					<div class="py-3">
						<a href="login.jsp"><button type="button" class="form-control">뒤로가기</button></a>	
					</div>
					
				</div>
					
			</div>
			
		</div>
	
</body>
</html>
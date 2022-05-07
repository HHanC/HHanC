<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%@include file = "../header.jsp" %>
	<br><br><br><br><br>
	<form action="../login" method="post">
		<div class="col-md-10 offset-2">
			<div class="row">
				<div class="col-md-3 offset-4">
					<div class="row">
						<div class="col-md-8">
							<div class="row">
								<input class="form-control" style="height: 40px;" type="text" name="mid" placeholder="아이디"> <br>
							</div>
							<div class="row">
								<input class="form-control" style="height: 40px;" type="password" name="mpassword" placeholder="비밀번호"> <br>
							</div>
							
							<!-- 로그인 실패시 -->
							<%
								String result = request.getParameter("result");
								if(result != null && result.equals("2")){
							%>
								<span>동일한 회원정보가 없습니다.</span>
							<%		
								}
							%>
						
						</div>
						<div class="col-md-4">
							<input class="form-control" style="height: 80px; width: 80px" type="submit" value="로그인">
						</div>
							
					</div>
				</div>
			</div>
		</div>
	</form>
	<br><br><br><br><br>
	<%@include file = "../footer.jsp" %>

	

</body>
</html>
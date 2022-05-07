<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "../header.jsp" %>
		<br><br><br>
		<%
			String mid = (String)session.getAttribute("login");
		%>
		
		<div class="container"> 
			<div class="row">
				<div class="col-md-3"> <!-- 사이드바 -->
					<%@include file = "infosidebar.jsp" %>
				</div>
				<div class="col-md-9"> <!-- 본문 -->
					<h3>회원탈퇴 화면</h3>
					<div class="form-group row">
						<input class="form-control" style="height: 40px; width: 175px;" type="password" id="mpassword">
						<button class="form-control" style="height: 40px; width: 175px; margin: 0 0 0 5px;" id="btncofirm" onclick="passwordcheck('<%=mid%>')">확인</button>
						<span id="checkmsg"></span>
						<button class="form-control" id="btndelete" style="display: none; height: 40px; width: 175px;" onclick="mdelete('<%=mid%>')">탈퇴승인</button>
					</div>
				</div>
			</div>
		</div>
		<!-- 사용자 정의 js 파일 포함 -->
		<script src="../js/info.js" type="text/javascript"></script>
	
	<%@include file = "../footer.jsp" %>

</body>
</html>
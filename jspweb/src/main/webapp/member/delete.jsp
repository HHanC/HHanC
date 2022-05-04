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
					<input type="password" id="mpassword">
					<button id="btncofirm" onclick="passwordcheck('<%=mid%>')">확인</button>
					<span id="checkmsg"></span>
					<button id="btndelete" style="display: none;" onclick="mdelete('<%=mid%>')">탈퇴승인</button>
				</div>
			</div>
		</div>
		<!-- 사용자 정의 js 파일 포함 -->
		<script src="../js/info.js" type="text/javascript"></script>
	
	<%@include file = "../footer.jsp" %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/jspweb/css/chatting.css" rel="stylesheet">
</head>
<body>

	<%@include file = "../header.jsp" %>
	
	<div class="container my-5"> <!-- 박스권 -->
		<div class="col-sm-6 offset-3 chattingbox"> <!-- 채팅 관련 구역 -->
			<div class="row ">
				<div class="col-sm-3 p-2"> <!-- 접속자 목록 표시 구역 = js -->
					<h5 class="enter_title">접속자 목록</h5>
					
					<div id="enterlist"> <!-- 접속된 정보 표시 -->
					
					</div>
					
				</div>
				<div class="col-sm-8"> <!-- 채팅창 구역 -->
					<div id="contentbox" class="contentbox"> 
						<!-- 메시지 표시 구역 -->
					</div>
					<%
						String mid = (String)session.getAttribute("login");
					%>
					<input type="hidden" value="<%=mid%>" id="mid">
					<div class="row g-0"> <!--입력 상자 혹은 전송 버튼 -->
						<div class="col-sm-10">
							<textarea id="incontent" rows="3" cols="" class="form-control" onkeyup="enterkey('<%=mid%>')"></textarea>
						</div>
						<div class="col-sm-2">
							<button class="sendbtn" onclick="sendbtn('<%=mid%>')"> 전송 </button>
						</div>
					</div>
					
					<div class="btnbox">
						<span>첨부파일</span>
						<span>이모티콘</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="/jspweb/js/chatting.js"></script>
	<%@include file = "../footer.jsp" %>

</body>
</html>















<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="/instagram/css/dm.css" rel="stylesheet">

</head>
<body>
	
	<%@include file = "../header.jsp"  %>
	
	<%
		String mid = (String)session.getAttribute("login");
		String mname = (String)MemberDao.getMemberDao().getmname2(mid);
	%>
	
	<div class="container my-5"> <!-- 박스권 -->
	
		<div class="col-sm-6 offset-3 chattingbox"> <!-- 채팅 관련 구역  -->
		
			<div class="row"> <!-- 하위 태그 가로배치 -->
				<div class="col-sm-4">		<!-- 접속자 목록 표시 구역  -->
					
					<h5 class="enter_title"> <%=mname%> </h5>
					<hr>
					<div id="enterlist">  
						<!-- 접속된 정보 표시 -->
					</div>
					
				</div>
				
				<div class="col-sm-8">		<!-- 채팅창 구역  -->
					<div id="contentbox" class="contentbox" >	
						<!-- 메시지 표시 구역 -->	
					</div>
					<input type="hidden" value="<%=mname%>" id="mname">
					
					<div class="row g-0"> <!--  입력 상자 혹은 전송 버튼 -->
						<div class="col-sm-9"> <!--  입력창 -->
							<textarea id="incontent" rows="2" cols="" class="form-control" onkeyup="enterkey('<%=mname%>')"></textarea>
						</div>
						<div class="col-sm-3"> <!--  전송 버튼 -->
							<button class="form-control sendbtn" onclick="sendbtn('<%=mname%>')">보내기</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="/instagram/js/dm.js"></script>
	<%@include file = "../footer.jsp" %>

</body>
</html>







<%@page import="dao.Image2Dao"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자가 정의한 css 호출 -->
	<link href="/instagram/css/main.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css">

</head>
<body>

	<%
		String memail = (String)session.getAttribute("login");
		int mno = MemberDao.getMemberDao().getmno(memail);
		String ifile2 = Image2Dao.getImage2Dao().getmyprofileimg(mno);	//현재로그인되어있는 회원프로필사진가져오기
		
	%>

	<div class="header"> <!--  구역 나누기  -->
		<div class="container"> <!--  헤더 내용 구역  --> 
			<div class="row py-3"> <!--  row : 하위 태그를 가로로 배치  -->
				<div class="col-md-4">
					<a href="/instagram/main.jsp"><img alt="" src="/instagram/img/mainlogow.png" width="40%"></a>
				</div>
				<div class="col-md-4"> 
					<input class="header_input" type="text"  placeholder="Search">
				</div>	
				<div class="col-md-4"> 			
					<a  class="p-3" style="color: black; " href="/instagram/main.jsp" ><i class="fa-solid fa-house fa-2x "></i></a>			
					<a class="p-3" style="color: black;" href="/instagram/dm/dm.jsp"><i class="fa-solid fa-paper-plane fa-2x"></i></a>	
					<a class="p-3" style="color: black;" href="#"><i data-bs-toggle="modal" data-bs-target="#writemodal" class="fa-solid fa-square-plus fa-2x"></i></a>
					<a class="p-3" style="color: black;" href="#"> <i class="fa-brands fa-safari fa-2x"></i></a>
						<div class="flex-shrink-0 dropdown" style="display: inline-block;">
				        <a href="#" class="link-dark text-decoration-none dropdown-toggle" id="dropdownUser2" data-bs-toggle="dropdown" aria-expanded="false">
							<img style="margin: 0 0 15px 0;" src="/instagram/member/profileimg/<%=ifile2%>" alt="mdo" width="35" height="35" class="rounded-circle">
						</a>	
				          <ul class="dropdown-menu text-small shadow" aria-labelledby="dropdownUser2">
				            <li><a class="dropdown-item" href="/instagram/member/mprofile.jsp">프로필</a></li>
				            <li><hr class="dropdown-divider"></li>
				            <li><a class="dropdown-item" href="/instagram/member/login.jsp">로그아웃</a></li>
				            <li><a class="dropdown-item" href="/instagram/member/mdelete.jsp">회원탈퇴</a></li>
				          </ul>
				        </div>
				</div>	
			</div>	
		</div>
	</div>
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/instagram/js/main.js" type="text/javascript"></script>
</body>
</html>
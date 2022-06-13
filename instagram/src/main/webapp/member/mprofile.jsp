<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@page import="dao.Image2Dao"%>
<%@page import="dao.FollowDao"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
.btn {
  
  text-transform: uppercase;
  transition: 0.5s;
  background-size: 200% auto;
  color: white;
 /* text-shadow: 0px 0px 10px rgba(0,0,0,0.2);*/
  box-shadow: 0 0 20px #eee;
  border-radius: 10px;
 }
.btn:hover {
  background-position: right center; /* change the direction of the change here */
}
.btn-4 {
  background-image: linear-gradient(to right, #a1c4fd 0%, #c2e9fb 51%, #a1c4fd 100%);
}
.content1{
    outline: 2px dashed #92b0b3 ;
    outline-offset:-10px;  
    text-align: center;
    transition: all .15s ease-in-out;
    width: 300px;
    height: 300px;
    background-color: gray;
}
.content1 img, .content1 video{
    width:100%;
    height:100%;
    display:none;
}
</style>
</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<%
		
		if(memail != null){
			
		int followcount = FollowDao.getFollowDao().followcount(mno);//팔로우회원수
		int followercount = FollowDao.getFollowDao().followercount(mno);//팔로워회원수
	
		//String ifile2 = Image2Dao.getImage2Dao().getmyprofileimg(mno);	//현재로그인되어있는 회원프로필사진가져오기
		String id = MemberDao.getMemberDao().getmname2(mno);	//현재로그인되어있는 아이디 가져오기
		int myboardcount = BoardDao.getBoardDao().myboardcount(mno);
	
	%>
	
	<div class="container" style="margin-top:10px;">
		<div class="row">
			<div class="col-md-4">
				<img class="rounded-circle" width="70%" src="/instagram/member/profileimg/<%=ifile2%>">
			</div>
			<div class="col-md-8" style="margin-top:30px;">
				<div><span style="margin:20px; font-size: 23px;"><%=id%></span><button data-bs-toggle="modal" data-bs-target="#profileupdate" class="btn btn-4" style="margin:20px; color:white; ">프로필편집</button><span style="margin:20px"> <i class="fa fa-gear" style="font-size:24px"></i></span></div>
				<div class="container" style="display:inline;">
					<div style="display:inline; font-weight: bold;">게시물<%=myboardcount %></div>
					<div data-bs-toggle="modal" data-bs-target="#followerlist" style="margin:20px; display:inline;"><a href="#" onclick="follower(<%=mno%>);" style="text-decoration-line: none; color:black; font-weight: bold;">팔로워
						<span><%=followercount %></span><!-- 팔로워수 -->
					</a></div>
					<div data-bs-toggle="modal" data-bs-target="#followlist" style="margin:20px; display:inline;"><a href="#" onclick="follow(<%=mno%>);" style="text-decoration-line: none; color:black; font-weight: bold;">팔로우
						<span><%=followcount %></span><!-- 팔로우수 -->
					</a></div>
				</div>
				
			</div>
		</div>
		<hr>
		
	</div>
	
	<!-- //////////////// 팔로우모달구역 ////////////// -->
	<div  class="modal h-100" tabindex="-1" id="followlist" data-bs-keyboard="false" data-bs-backdrop="static" tabindex="-1">
	  <div class="modal-dialog">
	    <div class="modal-content" style="border-radius: 20px;">
	      <div class="modal-header">
	      	<div class="container">  
	      	<div class="row" id="titlebox" >
	      		<div class="col-sm-4 ">
	      			<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      		</div>
	      		<div class="col-sm-4 d-flex justify-content-center">
	      			 <span style="font-size: 20px;"> 팔로잉 </span>
	      		</div>
	      	 </div>
	        </div>
	      </div>
	      <div class="modal-body"><!-- 모달내용 -->
				<div id="followlist2"><!-- 모달타겟이름이랑 모달바디 이름다르게해야됨  -->
              		
                </div>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- //////////////// 팔로우모달구역 end ////////////// -->
	
	<!-- //////////////// 팔로워모달구역 ////////////// -->
	<div  class="modal h-100" tabindex="-1" id="followerlist" data-bs-keyboard="false" data-bs-backdrop="static" tabindex="-1">
	  <div class="modal-dialog">
	    <div class="modal-content" style="border-radius: 20px;">
	      <div class="modal-header">
	      	<div class="container">  
	      	<div class="row" id="titlebox" >
	      		<div class="col-sm-4 ">
	      			<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      		</div>
	      		<div class="col-sm-4 d-flex justify-content-center">
	      			 <span style="font-size: 20px;"> 팔로워 </span>
	      		</div>
	      	 </div>
	        </div>
	      </div>
	      <div class="modal-body"><!-- 모달내용 -->
				<div id="followerlist2">
              		
                </div>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- //////////////// 팔로워모달구역 end ////////////// -->
	
	<!-- //////////////// 모달구역 ////////////// -->
	<div  class="modal h-100" tabindex="-1" id="profileupdate" data-bs-keyboard="false" data-bs-backdrop="static" tabindex="-1">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content" style="border-radius: 20px;">
	      <div class="modal-header">  <!-- 모달 제목 -->
	      	<div class="container">  
	      	<div class="row" id="titlebox" >
	      	
	      		<div class="col-md-4 ">
	      			<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      		</div>
	      		
	      		<div class="col-md-4 d-flex justify-content-center">
	      			 <span style="font-size: 20px;"> 프로필사진 </span>
	      		</div>
	      		<div class="col-md-4 d-flex justify-content-end">
	      			<button class="form-control" type="button" onclick="profilesave()">사진변경하기</button>
	      	</div>
	      	 </div>
	        </div>
	      </div>
	      <div class="modal-body">  <!-- 모달 내용  -->
	      <br />	
			<div class="col-md-4">
				<h5> 미리보기 </h5>
				<img id="preview" width="100%">
			</div>
			<form name="uploadprofile" id="uploadprofile" >
				<div>
                <label>첨부파일</label>
               		<input class="form-control"  type="file" id="profileimg" name="profileimg">
                	<input class="form-control" type="reset" value="초기화">
                </div>
			</form>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- //////////////// 모달구역 end ////////////// -->
	
	
	<!-- ///////////////프로필 나의게시물 캐러셀///////////// -->
		
		<!-- ///////////////프로필 나의게시물 캐러셀end///////////// -->
		<%
		ArrayList<Board> bnolist = BoardDao.getBoardDao().myboardbno(mno);
		//for( Board board : bnolist ){ 
		%>
		<div class="container">
			<!-- <div id="carouselExampleIndicators3" class="carousel slide" data-bs-ride="carousel">
			<div class="carousel-inner"> -->
				<div id="myboard"></div>
			<!-- </div>
				<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators3" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators3" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				 <span class="visually-hidden">Next</span>
				 </button>
			</div>	 -->
			
		</div>
		
		<%//}%>
		
	<%}else{ %>
		<a href="/instagram/member/login.jsp">로그인해라</a>
	<%}%>
	

	
	
	<!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/mprofile.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>
</body>
</html>
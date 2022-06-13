<%@page import="dao.MemberDao"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<%
		if(memail != null){
	%>
		<div id="orderbox"></div>
		<input hidden="" id="mno" value="<%=mno%>">
	<%}else{ %>
		<a href="/instagram/member/login.jsp">로그인해라</a>
	<%}%>
	<!-- //////////////// 모달구역 ////////////// -->
	<div  class="modal bg-dark h-100" tabindex="-1" id="writemodal" data-bs-keyboard="false" data-bs-backdrop="static" tabindex="-1">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content" style="border-radius: 20px;">
	      <div class="modal-header">  <!-- 모달 제목 -->
	      	<div class="container">  
	      	<div class="row" id="titlebox" >
	      	
	      		<div class="col-md-4 ">
	      			<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      		</div>
	      		
	      		<div class="col-md-4 d-flex justify-content-center">
	      			 <span style="font-size: 20px;"> 새 게시물 </span>
	      		</div>
	      		
	      		<div class="col-md-4 d-flex justify-content-end">
	      			<button  type="button" class="btn btn-secondary" onclick="newcontentnext()"> 다음 </button>
	      		</div>
	      		
	      	 </div>
	        </div>
	      </div>
	      <div class="modal-body">  <!-- 모달 내용  -->
			<form name="uploadForm" id="uploadForm" >
				<div class="row">
					<!-- 1단계 -->
					<div>
						 
		                <div>
		                	<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
							  <div class="carousel-inner" id="캐러셀">
							  </div>
							  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
							    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
							    <span class="visually-hidden">Previous</span>
							  </button>
							  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
							    <span class="carousel-control-next-icon" aria-hidden="true"></span>
							    <span class="visually-hidden">Next</span>
							  </button>
							</div>
		                 </div>
		                 <div>
		               		<div id="fileDrop" class="filebox">
		               			<div class="d-flex align-items-center"> 사진과 동영상을 여기에 끌어다 놓으세요 </div>
		               		</div>
		                </div>   
	                 </div>          
					<!--2단계 -->
					<div id="contentZone" style="width: 100%; height: 100%; display: none;">
						<textarea rows="10" class="form-control" name="content" id="content"></textarea>
					</div> 
				</div>
			</form>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- //////////////// 모달구역 end ////////////// -->
	
	
	
	<!-- 모달 구역  -->
	
	<!-- Button trigger modal -->
		<!-- Modal -->
		<div class="modal fade" id="boardview" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
		  <div class="modal-dialog modal-xl">
		    <div class="modal-content">
		   	 	<div class="modal-header">
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      	</div>
		      <div class="modal-body">
		        <div class="row">
		        	<div class="col-sm-8">
		                	<div id="carouselExampleControls2" class="carousel slide" data-bs-ride="carousel">
							  <div class="carousel-inner" id="캐러셀2">
							  </div>
							  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls2" data-bs-slide="prev">
							    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
							    <span class="visually-hidden">Previous</span>
							  </button>
							  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls2" data-bs-slide="next">
							    <span class="carousel-control-next-icon" aria-hidden="true"></span>
							    <span class="visually-hidden">Next</span>
							  </button>
							</div>
		        	</div>
		        	
		        	<div class="col-sm-4">
		        		<div id="replylist" style="height: 500px; overflow:scroll;"></div>
		        							<!--  세로크기 고정 !!1 내용물이 많을경우 세로 스크롤 생성  -->
		        		<div id="replylist2">
		        		
		        		</div>
		  
		        	</div>
		        </div>
		      </div>
		    </div>
		  </div>
		</div>
	<!-- 모달 end -->
	
	<%@include file = "footer.jsp" %>
</body>
</html>
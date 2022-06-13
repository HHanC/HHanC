<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!-- 부트스트랩 css cdn -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
   <style type="text/css">
      /*div{
         border: 1px solid;
      }*/
   </style>
</head>
<body style="background-color:#fafafa">
<div class="container" style="background-color: #fafafa; margin-top: 100px;" >
   <br><br>
   <div class="container row">
   
      <div class="col-md-4 offset-2">
         <!-- 캐러셀 -->
         <div id="cs" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-interval="3000">   
                                             <!-- data-bs-interval : 밀리초(1/1000)초 (10000:10초)(1000:1초)-->
                                                                  
            <div class="carousel-inner">   
               <div class="carousel-item active">   <!-- carousel-item:캐러셀 내용 -->
                  <img alt="" class="d-block w-100" src="../img/로그인캐러샐사진1.png">
               </div>
               
               <div class="carousel-item">   <!-- 캐러셀 내용 -->
                  <img alt="" class="d-block w-100" src="../img/로그인캐러샐사진2.png">
               </div>
               
               <div class="carousel-item">   <!-- 캐러셀 내용 -->
                  <img alt="" class="d-block w-100" src="../img/로그인캐러샐사진3.png">
               </div>
               
               <div class="carousel-item">   <!-- 캐러셀 내용 -->
                  <img alt="" class="d-block w-100" src="../img/로그인캐러샐사진4.png">
               </div>
            </div>
         </div><!-- 캐러셀 끝 -->
      </div>
      <div class="col-md-4" >
         
            <div style="background-color: white; border: 1px solid #dbdcdd; padding: 20px 50px 130px 50px; margin-top: 15px;">
               <form id="loginform" action="../Login" method="post">
                  <img class="rounded mx-auto d-block my-2" alt="" src="/instagram/img/photogram.png"><br>
                  
                  <input class="form-control my-2 box" type="text" id="memail" name="memail" placeholder="이메일 주소">
                  <input class="form-control my-2 box" type="password" id="mpassword" name="mpassword" placeholder="비밀번호"> <br>
                  
                  <%
                     String result = request.getParameter("result");
                     if(result != null && result.equals("2")){
                  %>
                     <span>동일한 회원 정보가 없습니다.</span>
                  <%      
                     }
                  %>
                  <input type="submit" value="로그인" class="form-control my-2" style="background-color: #0d6efd; color: white;">
                  <br>
                  <a href="findpw.jsp" style="text-decoration-line:none;"> <h6 class="text-center text-secondary my-3">비밀번호를 잊으셨나요?</h6></a>
                  
               </form>
            </div>
         
         
         <div class=" py-3 my-2" style="background-color: white; border: 1px solid #dbdcdd; ">
            <div class="col-md-10 offset-1">
               <h6 class="text-center text-secondary my-3">계정이 없으신가요?<a href="signup.jsp" style="text-decoration-line:none; font-weight:bold;">가입하기</a></h6>
            </div>
         </div>
      </div>
      
   </div>   
</div>
   
   <!-- 부트스트랩 js cdn -->
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
   <!-- jquery 최신 cdn --> <!-- 제이쿼리란? 자바스크립트 라이브러리 -->
   <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
   <!-- jquery 연결 -->
   <script src="../js/signup.js" type="text/javascript"></script>
   <%@include file = "../footer.jsp" %>
</body>
</html>
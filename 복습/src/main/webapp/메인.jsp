<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="UTF-8">
<title>Insert title here</title>
<!--  부트스트랩 : 미리 만들어진 CSS  스타일 설치  -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- 사용자가 정의한 css 호출 -->
<link href="main.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />


</head>
<body>

		<div class="header"> <!--  구역 나누기  -->
		
			<div class="container"> <!--  헤더 내용 구역  --> 
			
				<div class="row py-3"> <!--  row : 하위 태그를 가로로 배치  -->
	
					<div class="col-sm-4"> 
						<img alt="" src="mainlogow.png" width="40%">
						
					</div>
					
					<div class="col-sm-4"> 
					
						<input class="header_input" type="text"  placeholder="Search">
						
					</div>	
					
					<div class="col-sm-4"> 			
					
						<i class="fa-solid fa-house fa-2x"></i>			
							
						<i class="fa-solid fa-paper-plane fa-2x"></i>	
									
						<i class="fa-solid fa-square-plus fa-2x"></i>
								
						<i class="fa-brands fa-safari fa-2x"></i>		
							
					</div>	
					
				</div>	
				
			</div>

		</div>
		
		<div class="col-sm-4 my-5 offset-4 contentbox"> <!-- 메인 구역 -->
			 <div> <!-- 프로필 , 이름 구역  -->
			 	<div class="row p-3 d-flex align-items-center">
			 	
			 		
			 		<div class="col-sm-2 profile"> <!--  프로필 사진 -->
			 			
			 			<img class="rounded-circle" alt="" src="0321.jpg"  width="100%">
			 			
			 			</div>
			 			
			 			
			 		<div class="col-sm-8">	  <!--  이름 -->
			 			<span>김재우</span>
			 			</div>	
			 			
			 		
			 		<div class="col-sm-2">	 <!-- 옵션 버튼  -->
			 			<button class="optionbtn"> · · · </button>
			 			
			 			</div>
			 	</div>
			 
			 </div>
			 
			 <div> <!-- 게시물 이미지   -->
			 	<img alt=" " src="qwe.jpg"  width="100%">
			 
			 </div>
			 
			 <div> <!-- 하단 내용   -->
			 
	 
				 </div>
			</div>
		
		
		<!--  부트스트랩 : 미리 만들어진 js스크립트 설치 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
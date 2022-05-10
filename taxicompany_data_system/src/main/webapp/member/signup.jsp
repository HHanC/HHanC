<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
span{color: blue;}

</style>

</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<div class="container">
		<div class="col-md-12 text-left row">
			
			
			<div id="signup" class="offset-3 col-md-7 py-4"> <!--sign up 사이트 -->
				
				
					<div class="offset-2 col-md-7"> <!-- 틀 -->
						
						<form action="../Signup" method="post" id="signupform">
						<!-- 회사인증번호 입력 란 -->
						<!-- 구상 필요  -->
						<!-- 회사번호 입력 란 -->
						<div class="py-2">
							<div class="col-md-4 text-left"> 고유번호 <strong class="must_do">*</strong> </div>
							<input class="form-control" type="text" id="unique" name="unique" placeholder="고유번호를 입력해 주세요.">
							<div class="py-1"> </div>
							<span id="uniquecheck"></span>
						</div>
						<!-- 구상 필요  -->
							
							<!--  아이디 입력 란 -->
							<div class="py-2"> 
								 <div class="col-md-4 text-left">아이디<Strong class="must_do">*</Strong></div>
								<input class="form-control" type="text" id="mid" name="mid" placeholder="아이디를 입력해 주세요.(4~15자리 까지 가능합니다.)">
								<div class="py-1">
								<span id="idcheck"></span>
								<span class="check" id="idcheck2"></span>
								</div>
							</div>
							<!--  패스워드 입력 란 -->
							<div class="py-2"> 
								<div class="col-md-4">비밀번호<Strong class="must_do">*</Strong></div>
								<input class="form-control" type="password" id="mpwd" name="mpwd" placeholder="비밀번호를 입력해 주세요.(5~20자리까지 가능합니다.)">
								<div class="py-1">
								<span id="pwdcheck"></span>
								<span class="check" id="pwdcheck2"></span>
								</div>
							</div>
							<!--  패스워드 재 입력 란 -->
							<div class="py-2">
								<div class="col-md-4">비밀번호 재확인<Strong class="must_do">*</Strong></div>
								<input class="form-control" type="password" id="mpwdcheck" name="mpwdcheck" placeholder="비밀번호를 재 입력해주세요.">
								<div class="py-1">
								<span id="pwdcheck3"></span>
								<span class="check" id="pwdcheck4"></span>
								</div>
							</div>
							<!--  이름 입력 란 -->
							<div class="py-2">
								<div class="col-md-4 my-left">이름<Strong class="must_do">*</Strong></div>
									<input class="form-control" type="text" id="mname" name="mname" placeholder="이름을 입력해주세요.">
									<div class="py-1">
									<span id="namecheck"></span>
									<span class="check" id="namecheck2"></span>
									</div>
							</div>
							<!--  핸드폰번호 입력 란 -->
							<div class="py-2">
								<div class="col-md-4">전화 번호<Strong class="must_do">*</Strong></div>
									<input class="form-control" type="text" id="mphone" name="mphone" placeholder="전화번호를 입력해주세요. ( ' _ ' 제외 ) ">
									<div class="py-1">
									<span id="phonecheck"></span>
									<span class="check" id="phonecheck2"></span>
									</div>
							</div>
							<!--  이메일 입력 란 -->
							<div class="py-2">
								<div class="col-md-4">이메일 주소<Strong class="must_do">*</Strong></div>
									<div class="row">
										<!-- 이메일 아이디 입력 란 -->
										<div class="col-md-7 ">
											<input class="form-control"  type="text" id="memail" name="memail" placeholder="이메일을 입력해주세요.">	
										</div>
										<div class="col-md-1 text-bottom"><h5>@</h5></div>
										<div class="col-md-4">
											<input class="form-control" type="text" id="memailaddress" name="memailaddress" readonly="readonly">
										</div>
										<!-- 이메일 주소 -->
									
										<div class="col-md-12 py-2">
												<div class="col-md-4">이메일 선택</div>
											<select class="form-select" id="selectemail" >
												<option id="first">
													원하시는 이메일을 선택해 주세요.
												</option>
												<option value="직접입력">
													직접 입력
												</option>
												<option value="naver.com">
													naver.com
												</option>
												<option value="daum.net">
													daum.net
												</option>
												<option value="gmail.com">
													gmail.com
												</option>
												<option value="kakao.com">
													kakao.com
												</option>
												<option value="nate.com">
													nate.com
												</option>
												<option value="hanmail.com">
													hamail.com
												</option>
											</select>
											<div class="py-1">
											<span id="emailcheck"></span>
											<span  class="check" id="emailcheck2"></span>
											</div>
										</div>
									</div>
								</div>
							<button  class="form-control py-3" onclick="signup()" type="button">가입하기</button>
						</form>
						<!-- 취소하기 버튼 -->
						<div class="py-2"> 
						<a href="../main.jsp"><button  class="form-control py-3" type="button">취소</button></a>
						</div>
						
					</div>	
				
				
			</div>
		
		</div>
	</div>
	
	
	<script src="../js/signup.js" type="text/javascript"></script>

</body>
</html>
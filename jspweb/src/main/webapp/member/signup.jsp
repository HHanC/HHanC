<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%@include file = "../header.jsp"%>
	<br><br><br><br><br>
	<div class="contaicer text-center">
		<h3>회원가입 페이지</h3>
	</div>
	<div class="col-md-12">
		<div class="col-md-8 offset-4">
			<div class="col-md-10">
				<form class="" id="signupform" action="../signup" method="post">
					<input class="form-control" style="height: 40px; width: 350px;" type="text" id="mid" name="mid" placeholder="user id">
					<span id="idcheck"></span> <br>
					<input class="form-control" style="height: 40px; width: 350px;" type="password" id="mpassword" name="mpassword" placeholder="user password"> <br>
					<input class="form-control" style="height: 40px; width: 350px;" type="password" id="mpasswordcheck" name="mpassword" placeholder="user password chack">
					<span id="passwordcheck"></span> <br>
					<input class="form-control" style="height: 40px; width: 350px;" type="text" id="mname" name="mname" placeholder="user name">
					<span id="namecheck"></span>
					<br>
					<input class="form-control" style="height: 40px; width: 350px;" type="text" id="mphone" name="mphone" placeholder="user phone">
					<span id="phonecheck"></span>
					<br>
					<div class="form-group row" style="margin: 0 0 0 1px;">
						<input class="form-control" style="height: 40px; width: 175px;" type="text" id="memail" name="memail" placeholder="user email">
						@
						<input class="form-control" style="height: 40px; width: 175px;" type="text" id="memailaddres" name="memailaddres">
						<select style="height: 40px; width: 130px; margin: 0 0 0 5px;" id="emailselect"> 
							<option value="">직접입력</option>
							<option value="naver.com">naver.com</option>
							<option value="nate.com">nate.com</option>
							<option value="daum.com">daum.com</option>
						</select>
					</div>
					<br>
					<span id="emailcheck"></span>
						<input class="form-control" style="height: 40px; width: 350px;" type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기">
						<input class="form-control" style="height: 40px; width: 350px;" type="text" id="address1" name="address1" placeholder="우편번호">
						<input class="form-control" style="height: 40px; width: 350px;" type="text" id="address2" name="address2" placeholder="도로명주소">
						<input class="form-control" style="height: 40px; width: 350px;" type="text" id="address3" name="address3" placeholder="지번주소">
						<span id="guide" style="color:#999;display:none"></span>
						<input class="form-control" style="height: 40px; width: 350px;" type="text" id="address4" name="address4" placeholder="상세주소">
					<br>
					<span id="addresscheck"></span>
					<button class="form-control" style="height: 40px; width: 350px;" onclick="signup()" type="button">회원가입</button>
				</form>	
			</div>
		</div>
	</div>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../js/signup.js" type="text/javascript"></script>
	<br><br><br><br><br>
	<%@include file = "../footer.jsp" %>

</body>
</html>
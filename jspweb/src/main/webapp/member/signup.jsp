<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%@include file = "../header.jsp"%>
	<div class="contaicer">
		<h3>회원 페이지</h3>
		<form id="signupform" action="../signup" method="post">
			아이디 : <input type="text" id="mid" name="mid" placeholder="user id">
			<span id="idcheck"></span> <br>
			비밀번호 : <input type="password" id="mpassword" name="mpassword" placeholder="user password">
			비밀번호 확인 : <input type="password" id="mpasswordcheck" name="mpassword" placeholder="user password chack">
			<span id="passwordcheck"></span> <br>
			이름 : <input type="text" id="mname" name="mname" placeholder="user name">
			<span id="namecheck"></span>
			<br>
			전화번호 : <input type="text" id="mphone" name="mphone" placeholder="user phone">
			<span id="phonecheck"></span>
			<br>
			이메일 : <input type="text" id="memail" name="memail" placeholder="user email">
			@
			<input type="text" id="memailaddress" name="memailaddress">
			<select id="emailselect" >
				<option value="">직접입력</option>
				<option value="naver.com">naver.com</option>
				<option value="nate.com">nate.com</option>
				<option value="daum.com">daum.com</option>
			</select>
			<span id="emailcheck"></span>
			<br>
				<input type="text" id="adress1" name="adress1" placeholder="우편번호">
				<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
				<input type="text" id="adress2" name="adress2" placeholder="도로명주소">
				<input type="text" id="adress3" name="adress3" placeholder="지번주소">
				<span id="guide" style="color:#999;display:none"></span>
				<input type="text" id="adress4" name="adress4" placeholder="상세주소">
			<br>
			<span id="adresscheck"></span>
			<button onclick="signup()" type="button">회원가입</button>
		</form>
	</div>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../js/signup.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>

</body>
</html>
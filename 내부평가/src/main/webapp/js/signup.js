

let pass = [false,false,false,false]


$(function(){
	// 이메일 체크
	$("#mep").keyup(function(){
	let mep = $("#mep").val();
	let mepj = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
		if(mepj.test(mep)){
			$("#mepcheck").html("v"); pass[0] = true;
		}else{
			$("#mepcheck").html("x"); pass[0] = false;
		}
		
	});
	
	// 이름 체크
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val();
		let mnamej = /^[가-힣]{2,10}$/;
		if(mnamej.test(mname)){
			$("#namecheck").html("v");  pass[1] = true;
		}else{
			$("#namecheck").html("x");  pass[1] = true;
		}
		
			
	});
	
	// 사용자 이름 체크
	$("#mname2").keyup(function(){
		
		let mname2 = $("#mname2").val();
		let namecheck2j = /^[a-zA-Z0-9_/.][a-zA-Z0-9_/. ]*$/;
		
		if(namecheck2j.test(mname2)){
			$("#namecheck2").html("v"); pass[2] = true;
		}else{
			$("#namecheck2").html("x"); pass[2] = false;
		}
		
	});
	
	// 사용자 비밀번호 체크
	$("#mpassword").keyup(function(){
		let mpassword = $("#mpassword").val();
		let pwcheckj = /^[a-zA-Z0-9!._@#$%^&*]{4,20}$/;
		
		if(pwcheckj.test(mpassword)){
			$("#pwcheck").html("v");  pass[3] = true;
		}else{
			$("#pwcheck").html("x");  pass[3] = true;
		}
	});
});

function signup(){
	let check = true;
	for(let i=0; i<pass.length; i++){
		if(pass[i] == false){
			check = false;
		}
	}
	if(check){
		alert("회원가입 성공");
		document.getElementById("signupform").submit();
	}else{
		alert("회원가입 실패");
	}
	
}
	
	
	
	

	
	
	
	
	
	
	


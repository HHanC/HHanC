
let pass = [false,false]

$(function(){

// 사용자 이름 체크
	$("#mname2").keyup(function(){
		let mname2 = $("#mname2").val();
		let namecheck2j = /^[a-zA-Z0-9_/.][a-zA-Z0-9_/. ]*$/;
		
		if(namecheck2j.test(mname2)){
			$("#namecheck2").html("v"); pass[0] = true;
		}else{
			$("#namecheck2").html("x"); pass[0] = false;
		}
		
	});
	
	// 사용자 비밀번호 체크
	$("#mpassword").keyup(function(){
		let mpassword = $("#mpassword").val();
		let pwcheckj = /^[a-zA-Z0-9!._@#$%^&*]{4,20}$/;
		
		if(pwcheckj.test(mpassword)){
			$("#pwcheck").html("v");  pass[1] = true;
		}else{
			$("#pwcheck").html("x");  pass[1] = false;
		}
	});
});

function login(){
	let check = true;
	for(let i=0; i<pass.length; i++){
		if(pass[i] == false){
			check = false;
		}
	}
	if(check){
		alert("로그인 성공");
		document.getElementById("loginform").submit();
	}else{
		alert("로그인 실패");
	}
	
}
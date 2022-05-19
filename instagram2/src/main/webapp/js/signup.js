let pass = [false,false,false,false]


$(function(){
	// 전화번호 체크 및 이메일 체크
	$("#mep").keyup(function(){
	let mep = $("#mep").val();
	let mepj = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
	let phonej = /^\d{3}\d{3,4}\d{4}$/;
		if(mepj.test(mep)){
			$.ajax({
				url : "../Mepcheck",
				data : {"mep" : mep},
				success : function(result){
					if(result == 1){
						$("#mepcheck").html("빨간색x"); pass[0] = false;
					}else{
						$("#mepcheck").html("초록색v"); pass[0] = true;
					}
				}
			});
		}else if(phonej.test(mep)){
			$("#mepcheck").html("초록색v"); pass[0] = true;
		}else{
			$("#mepcheck").html("빨간색x"); pass[0] = false;
		}
	});
	
	// 이름 체크
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val();
		let mnamej = /^[가-힣]{2,10}$/;
		if(mnamej.test(mname)){
			$("#namecheck").html("초록색v");  pass[1] = true;
		}else{
			$("#namecheck").html("빨간색x");  pass[1] = false;
		}
		
			
	});
	
	// 사용자 이름 체크
	$("#mname2").keyup(function(){
		
		let mname2 = $("#mname2").val();
		let namecheck2j = /^[a-zA-Z0-9_/.][a-zA-Z0-9_/. ]*$/;
		
		if(namecheck2j.test(mname2)){
			$.ajax({
				url : "../Namecheck2",
				data : {"mname2" : mname2},
				success : function(result){
					if(result == 1){
						$("#namecheck2").html("빨간색x"); pass[2] = false;
					}else{
						$("#namecheck2").html("초록색v"); pass[2] = true;
					}
				}
			});
		}else{
			$("#namecheck2").html("빨간색x"); pass[2] = false;
		}
		
	});
	
	// 사용자 비밀번호 체크
	$("#mpassword").keyup(function(){
		let mpassword = $("#mpassword").val();
		let pwcheckj = /^[a-zA-Z0-9!._@#$%^&*]{4,20}$/;
		
		if(pwcheckj.test(mpassword)){
			$("#pwcheck").html("초록색v");  pass[3] = true;
		}else{
			$("#pwcheck").html("빨간색x");  pass[3] = false;
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
		document.getElementById("signupform").submit();
	}else{
		alert("필수 입력 사항이 입력되지 않았습니다.");
	}
	
}
	
	
	

	
	
	
	
	
	
	
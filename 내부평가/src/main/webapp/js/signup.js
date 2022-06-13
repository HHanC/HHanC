let pass = [false,false,false,false]


$(function(){
	// 이메일 체크
	$("#memail").keyup(function(){
	let memail = $("#memail").val();
	let memailj = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
		if(memailj.test(memail)){
			$.ajax({
				url : "../Memailcheck",
				data : {"memail" : memail},
				success : function(result){
					if(result == 1){
						$("#memailcheck").html("X"); pass[0] = false;
					}else{
						$("#memailcheck").html("V"); pass[0] = true;
					}
				}
			});
		}
	});
	
	// 이름 체크
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val();
		let mnamej = /^[가-힣]{2,10}$/;
		if(mnamej.test(mname)){
			$("#namecheck").html("V");  pass[1] = true;
		}else{
			$("#namecheck").html("X");  pass[1] = false;
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
						$("#namecheck2").html("X"); pass[2] = false;
					}else{
						$("#namecheck2").html("V"); pass[2] = true;
					}
				}
			});
		}else{
			$("#namecheck2").html("X"); pass[2] = false;
		}
		
	});
	
	// 사용자 비밀번호 체크
	$("#mpassword").keyup(function(){
		let mpassword = $("#mpassword").val();
		let pwcheckj = /^[a-zA-Z0-9!._@#$%^&*]{4,20}$/;
		
		if(pwcheckj.test(mpassword)){
			$("#pwcheck").html("V");  pass[3] = true;
		}else{
			$("#pwcheck").html("X");  pass[3] = false;
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
	

	
	
	
	
	
	
	
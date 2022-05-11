$(function(){
	// 전화번호 체크 및 이메일 체크
	$("#mep").keyup(function(){
		
		let mep = $("#mep").val();
		
		if(mep == ""){
			$("#mepcheck").html("빨간색x"); pass[0] = false;
		}else{
			
			let mepj = /^([0-1]{3})([0-9]{8})$/;
			
			let mepj2 = /^([a-zA-Z0-9]{3,20})@([a-z]{3,10}).([a-z]{1,3})$/;
			let mepj3 = /^([a-zA-Z0-9]{3,20})@([a-z]{3,10}).([a-z]{2}).([a-z]{2})$/;*/
			if(mepj.test(mep)){
				
				$.ajax({
					url : "../Mepcheck",
					data : {"mep" : mep},
					success : function(result){
						if(result == 1){
							$("#mepcheck").html("초록색v"); pass[0] = true;
						}else{
							$("#mepcheck").html("빨간색x"); pass[0] = false;
						}
					}
				});
			}else{
				$("#mepcheck").html("빨간색x") ;pass[0] = false;
			}
		}
	});
	
	// 이름 체크
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val();
		
		if(mname == ""){
			$("#namecheck").html("빨간색x"); pass[1] = false;
		}else{
			
			let mnamej = /^[가-힣]{2,10}$/;
			
			if(mnamej.test(mname)){
				
				$.ajax({
					url : "../Namecheck",
					data : {"mname" : mname},
					success : function(result){
						if(result == 1){
							$("#namecheck").html("초록색v"); pass[1] = true;
						}else{
							$("#namecheck").html("빨간색x"); pass[1] = false;
						}
					}
				});
			}else{
				$("#namecheck").html("빨간색x"); pass[1] = false;
			}
		}
	});
	
	// 사용자 이름 체크
	$("#mname2").keyup(function(){
		
		let mname2 = $("#mname2").val();
		if(mname2 = ""){
			
			$("#namecheck2").html("빨간색x"); pass[2] = false;
		}else{
			
			let namecheck2j = /^[a-zA-Z0-9_.]{2,10}$/;
			
			if(namecheck2j.test(mname2)){
				$.ajax({
					url : "../Namecheck2",
					data : {"mname2" : mname2},
					success : function(result){
						
						if(result == 1){
							alert("123");
							$("#namecheck2").html("초록색v"); pass[2] = true;
						}else{
							$("#namecheck2").html("빨간색x"); pass[2] = false;
						}
					}
				});
			}else{
				$("#namecheck2").html("빨간색x"); pass[2] = false;
			}
		}
	});
	
	// 사용자 비밀번호 체크
	$("#mpassword").keyup(function(){
		let mpassword = $("#mpassword").val();
		
		if(mpassword == ""){
			$("#pwcheck").html("빨간색x"); pass[3] = false;
		}else{
			let pwcheckj = /^[a-zA-Z0-9!._@#$%^&*]{4,20}$/;
			
			if(pwcheckj.test(mpassword)){
				$.ajax({
					url : "../Passwordcheck",
					data : {"mpassword" : mpassword},
					success : function(result){
						if(result){
							$("#pwcheck").html("초록색v"); pass[3] = true;
						}else{
							$("#pwcheck").html("빨간색x"); pass[3] = false;
						}
					}
				});
			}else{
				$("#pwcheck").html("빨간색x"); pass[3] = false;
			}
			
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
		alert("필수 입력 사항이 입력되지 않았습니다.")
	}
	
};
	
	
	
	
	
	
	
	
	
	
	
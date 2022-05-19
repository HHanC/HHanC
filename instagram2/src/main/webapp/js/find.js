let pass = [false,false]

$(function(){

	// 전화번호 체크 및 이메일 체크
	$("#fep").keyup(function(){
	let fep = $("#fep").val();
	let fepj = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
	let phonej = /^\d{3}\d{3,4}\d{4}$/;
		if(fepj.test(fep)){
			$.ajax({
				url : "../Fepcheck",
				data : {"fep" : fep},
				success : function(result){
					if(result == 1){
						$("#fepcheck").html("초록색v"); pass[0] = true;
					}else{
						$("#fepcheck").html("빨간색x"); pass[0] = false;
					}
				}
			});
		}else if(phonej.test(fep)){
			$("#fepcheck").html("초록색v"); pass[0] = true;
		}else{
			$("#fepcheck").html("빨간색x"); pass[0] = false;
		}
	});
	

	// 이름 체크
	$("#fname").keyup(function(){
		
		let fname = $("#fname").val();
		let fnamej = /^[가-힣]{2,10}$/;
		if(fnamej.test(fname)){
			$("#fnamecheck").html("초록색v");  pass[1] = true;
		}else{
			$("#fnamecheck").html("빨간색x");  pass[1] = false;
		}
	});
});

function findname2(){
	let check = true;
	for(let i=0; i<pass.length; i++){
		if(pass[i] == false){
			check = false;
		}
	}
	if(check){
		document.getElementById("findname2form").submit();
	}else{
		alert("필수 입력 사항이 입력되지 않았습니다.");
	}
}


$(function(){

	// 전화번호 체크 및 이메일 체크
	$("#fep").keyup(function(){
	let fep = $("#fep").val();
	let fepj = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
	let phonej = /^\d{3}\d{3,4}\d{4}$/;
		if(fepj.test(fep)){
			$.ajax({
				url : "../Fepcheck",
				data : {"fep" : fep},
				success : function(result){
					if(result == 1){
						$("#fepcheck").html("초록색v"); pass[0] = true;
					}else{
						$("#fepcheck").html("빨간색x"); pass[0] = false;
					}
				}
			});
		}else if(phonej.test(fep)){
			$("#fepcheck").html("초록색v"); pass[0] = true;
		}else{
			$("#fepcheck").html("빨간색x"); pass[0] = false;
		}
	});
	

	// 이름 체크
	$("#fname").keyup(function(){
		
		let fname = $("#fname").val();
		let fnamej = /^[가-힣]{2,10}$/;
		if(fnamej.test(fname)){
			$("#fnamecheck").html("초록색v");  pass[1] = true;
		}else{
			$("#fnamecheck").html("빨간색x");  pass[1] = false;
		}
	});
	
	// 사용자 이름 체크
	$("#fname2").keyup(function(){
		
		let fname2 = $("#fname2").val();
		let namecheck2j = /^[a-zA-Z0-9_/.][a-zA-Z0-9_/. ]*$/;
		
		if(namecheck2j.test(fname2)){
			$.ajax({
				url : "../Fpasswordcheck",
				data : {"fname2" : fname2},
				success : function(result){
					if(result == 1){
						$("#fname2check").html("초록색v"); pass[2] = true;
					}else{
						$("#fname2check").html("빨간색x"); pass[2] = false;
					}
				}
			});
		}else{
			$("#namecheck2").html("빨간색x"); pass[2] = false;
		}
		
	});
	
});

function findpw(){
	
	let check = true;
	for(let i=0; i<pass.length; i++){
		if(pass[i] == false){
			check = false;
		}
	}
	if(check){
		document.getElementById("fpwform").submit();
	}else{
		alert("필수 입력 사항이 입력되지 않았습니다.");
	}
	
}
















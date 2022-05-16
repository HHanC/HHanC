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
	alert("!23");
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






















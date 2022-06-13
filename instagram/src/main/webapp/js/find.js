let pass = [false]


$(function(){

	// 이메일 체크
	$("#femail").keyup(function(){
	let femail = $("#femail").val();
	let femailj = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
		if(femailj.test(femail)){
			$.ajax({
				url : "../Femailcheck",
				data : {"femail" : femail},
				success : function(result){
					if(result == 1){
						pass[0] = true;
					}else{
						pass[0] = false;
					}
				}
			});
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
















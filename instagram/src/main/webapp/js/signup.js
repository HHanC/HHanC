
$(function(){
	// 전화번호 체크 및 이메일 체크
	$("#mep").keyup(function(){
		let mep = $("#mep").val();
		let mepj = /^([0-1]{3})([0-9]{8})$/;
		let mepj2 = /^([a-zA-Z0-9]{3,20})@([a-z]{3,10}).([a-z]{1,3})$/;
		let mepj3 = /^([a-zA-Z0-9]{3,20})@([a-z]{3,10}).([a-z]{2}).([a-z]{2})$/;
		
		$.ajax({
			
			url : "../Mepcheck",
			data : {"mep" : mep},
			success : function(result){
			
				if(mepj.test(mep)){
					$("#mepcheck").html("초록색v");
				}else if(mepj2.test(mep)){
					$("#mepcheck").html("초록색v")
				}else if(mepj3.test(mep)){
					$("#mepcheck").html("초록색v")
				}else{
					$("#mepcheck").html("빨간색x")
				}
			}
		});
			
	});
	
	
	// 이름 체크
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val();
		let mnamej = /^[가-힣]{2,10}$/;
		if(mnamej.test(mname)){
			$("#namecheck").html("초록색v");
		}else{
			$("#namecheck").html("빨간색x");
		}
		
	});
	// 사용자 이름 체크
	$("#mname2").keyup(function(){
		
		let mname2 = $("#mneme2").val();
		let namecheck2j = /^[a-zA-Z0-9_.]{2,10}$/;
		
		if(namecheck2j.test(mname2)){
			
			$.ajax({
				url : "../Namecheck2",
				data : {"mname2" : mname2},
				success : function(result){
					alert("123");
					if(result == 1){
						$("#namecheck2").html("사용 가능한 이름 입니다.");
					}else{
						$("#namecheck2").html("사용 불가능한 이름입니다.")
					}
				}
			});
		}
	});
});
	
	
	
	
	
	
	
	
	
	
	


	//이메일 체크
	$("#memail").keyup(function(){
		let memail = $("#memail").val();
		let memailaddress = $("#memailaddress").val();
		if(memailaddress == "" ){
			$("#emailcheck").html("이메일 주소를 입력해주세요!");
		}else{
			let emailj = /^[a-zA-Z0-9]{5,20}$/;
			if(emailj.test(memail)){
				//이메일 중복체크
				let email = memail+"@"+memailaddress;
				$.ajax({
					url : "../emailcheck",
					data : {"email" : email},
					success : function(result){
						if(result == 1){
							$("#emailcheck").html("사용중인 이메일 입니다.");
						}else{
							$("#emailcheck").html("사용 가능한 이메일 입니다.");
						}
					}
				});
			}else{
				$("#emailcheck").html("특수문자를 제외한 대소문자와 숫자를 사용하여 5~20글자 이내로 입력해 주세요.")
			}
		}
	});
	
	$("#emailselect").change(function(){
		let emailselect = $("#emailselect").val();
		if(emailselect == ""){
			$("#memailaddress").val("");
			$("#memailaddress").attr("readonly", false); // 읽기모드 취소
		}else{
			$("#memailaddress").val(emailselect);
			$("#memailaddress").attr("readonly", true); // 읽기모드
		}
	});
	
	// 이름 체크
	$("#mname").keyup(function(){
		let mname = $("#mname").val();
		let namej = /^[가-힣]{2,10}$/;
		if(namej.test(mname)){
			$("#namecheck").html("사용 가능한 이름입니다.");
		}else{
			$("#namecheck").html("한글 2~10 사이만 가능합니다.");
		}
		
	});
	
	// 아이디 중복체크
	$("#mid").keyup(function(){
		let mid = $("#mid").val();
		let idcheck = $("#idcheck").val();
		let idj = /^[a-zA-Z0-9]{5,15}$/;
		if(idj.test(mid)){
			$.ajax({
				url : "../idcheck",
				data : {"mid" : mid},
				success : function(result){
					if(result == 1){
						$("#idcheck").html("사용중인 아이디 입니다.");
					}else{
						$("#idcheck").html("사용가능한 아이디 입니다.");
					}
				}
			});
		}else{
			idcheck.inner = "영문, 숫자 포함 5~15길이로 입력해 주세요."
		}
		
	});
	
	// 비밀번호 체크
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
function passwordcheck(memail){
	let mpassword = $("#mpassword").val();
	$.ajax({
		
		url : "../Passwordcheck" ,
		data : {"memail":memail , "mpassword":mpassword} ,
		type : "post" , 
		success : function(result){
			
			if(result == 1){
				$("#checkmsg").html("정말 탈퇴 하시겠습니까?");
				$("#mpassword").css("display" , "none");
				$("#btndelete").css("display" , "block");
				$("#btncoform").css("display" , "none");
			}else{
				$("#checkmsg").html("동일한 패스워드가 아닙니다.");
				$("#mpassword").val("");
			}
		}
	});
}

function mdelete(memail){
	$.ajax({
		url : "../Delete" ,
		data : {"memail" : memail} ,
		success : function(result){
			if(result == 1){
				alert("회원탈퇴 성공");
				location.href="/instagram/Logout";
			}else{
				location.href="/instagram/error.jsp"
			}
		}
	});
}
























function passwordcheck(mid){
	
	// 제이쿼리식 = 아작트 쓰려고
	let mpassword = $("#mpassword").val();
	// 자바스크립트식
	// let document.getElementById("mpassword").value;
	
	// 비동기 통신 = 제이쿼리 제공해주는 통신(js(view)) --> java(conterller)
	// $.ajax({속성명 = 속성값, 속성명2 = 속성값2});
	$.ajax({
		url : "../passwordcheck",// 어디로
		data : {"mid" : mid, "mpassword": mpassword},// 보낼 데이터
		type : "POST", // http요청 방식 정의 [get= 기본값, post]
		success : function(result){ // 받을 데이터
			if(result == 1){ 
				$("#checkmsg").html("정말 탈퇴 하시겠습니까?");
				$("#mpassword").css("display", "none"); // 제이쿼리 css 적용 [.css("속성명", "속성값")]
				$("#btndelete").css("display", "block"); 
				$("#btncofirm").css("display", "none"); 
			}else{
				$("#checkmsg").html("동일한 패스워드가 아닙니다.");
				$("#mpassword").val("");
			}
		}
	});
	
}

function mdelete(mid){
	
	$.ajax({
		url : "../delete" ,
		data : {"mid" : mid},
		success : function(result){
			if(result = 1){
				alert("회원탈퇴 완료 되었습니다.")
				// js에서 하이퍼링크[페이지연결]
				// <a href = "경로">
				// location.href="경로"
				location.href="/jspweb/logout"; // 서블릿
			}else{
				location.href="/jspweb/error.jsp"; // 페이지
			}
		}
	});
}



























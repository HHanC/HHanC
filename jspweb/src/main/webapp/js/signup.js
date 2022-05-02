



function signup(){
	
	// 1. html 태그내 값 가져오기
	let mid = document.getElementById("mid").value;
	alert("입력하신 아이디 : " + mid);
	// 2. html 태그내 데이터 넣기
	document.getElementById("idcheck")
				.innerHTML = "사용 가능한 아이디 입니다.";
	
}
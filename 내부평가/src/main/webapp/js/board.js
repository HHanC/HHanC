
 // 문서 열렸을때 실행 함수 무조건 실행
 $(document).ready( function(){
	 $('#summernote').summernote({
    	placeholder: '내용 입력',
    	tabsize: 2,
   	 	minHeight : 250 , // 최소 높이
   	 	maxHeight : null , // 최대 높이 
   	 	lang : 'ko-KR'	// 메뉴 한글 버전 
	  });
});

// 전화번호 체크 
	$("#password").keyup( function(){ 
		let password = $("#password").val();
		let passwordj = /^[a-zA-Z0-9]{5,15}$/; // 정규표현식
		if( passwordj.test(password) ){
			$("#passwordcheck").html( "v" );
		}else{
			$("#passwordcheck").html( "5글자 이상 특수문자 제외" ); 
		}
	}); // keyup end 
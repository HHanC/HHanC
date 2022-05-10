 // 문서 열렸을때 실행 함수 무조건 실행
 $(document).ready( function(){
	 $('#summernote').summernote({
    	placeholder: '내용 입력',
    	tabsize: 2,
   	 	minheight : 250, // 최소 높이
   	 	maxheight : null, // 최대 높이
   	 	lang : 'ko-KR' // 메뉴 한글 버전
	  });
});

function filedelete(bno){
	
	// HTML에서 JS로 변수 이동
		// 1. 메소드 인수로 이동
		// 2. 태그의 value 혹은 html 이동
	
	// 비동기 통신 = 페이지 전환이 없는 상태 DB통신
	// jquery라이브러리의 ajax 사용
	$.ajax({
		
		url : "/filedelete", /*서블릿 통신*/
		data : {"bno" : bno}, /*통신 데이터 : {변수명 : 값, 변수명2 : 값}*/
		success : function(result){
			if(result == "1"){
				alert("첨부파일 삭제 성공");
				location.reload(); // 현재 페이지 새로고침
			}else{
				alert("첨부파일 삭제 실패[관리자에게 문의하셈!!!!!!!!!!!!!!]")
			}
		}
		
	});
	
}

function replywrite(bno){
	let rcontent = $("#rcontent").val();
	$.ajax({
		url : "replywrite",
		data : {"bno" : bno , "rcontent" : rcontent} ,
		success : function(result){
			if(result == 1){
				alert("댓글 작성 완료되었다!!"); // 성공 메시지 알림
				$("#rcontent").val(); // 작성 input 공백으로 초기화
				$("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
				/*해당 replytable 의 불러오기 = replytable*/
			}else{
				alert("댓글 작성 실패야!!!!!!!!!!!!!");
			}
		}
		
	});
	
}

function rereplyview(rno, bno, mid){ // 대댓글 입력창 표시
	
		// '' or "" // '문자열' + 변수 + '문자열'
		if(mid == null){
			alert("로그인 후 작성이 가능합니다."); return;
			
		};
		// JS 작성 공간에서는 THML 작성 불가능 --> HTML문자처리
	$("#"+rno).html(
		'<div class="row">'+
			'<div class="col-md-10">'+
				'<textarea id="rrcontent" class="form-control" rows="3"></textarea>'+
			'</div>'+
			'<div class="col-md-2">	<!-- p : padding	/	m :  -->'+
				'<button class="form-control py-4  my-1" onclick="rereplywrite('+rno+','+bno+')">등록</button>'+
			'</div>'+
		'</div>'
		
	);
}
function rereplywrite(rno, bno){ // 대댓글 쓰기 메소드
	let rrcontent = $("#rrcontent").val();
	$.ajax({
		url : "rereplywrite",
		data : {"rno" : rno, "bno" : bno, "rrcontent" : rrcontent},
		success : function(result){
			if(result == 1){
				alert("대댓글 작성 완료되었다!!"); // 성공 메시지 알림
				$("#rcontent").val(); // 작성 input 공백으로 초기화
				$("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침(load를 통해)
				/*해당 replytable 의 불러오기 = replytable*/
			}else{
				alert("대댓글 작성 실패야!!!!!!!!!!!!!");
			}
		}
		
	});
}

function replydelete(rno){
	$.ajax({
		url : "replydelete",
		data : {"rno" : rno},
		success : function(result){
			if(result == 1){
				alert("삭제 성공!!");
				$("#replytable").load(location.href+" #replytable")
			}else{
				alert("삭제 실패!!");
			}
		}
	});
}





















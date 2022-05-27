
$("#incontent").focus(); // 스크립트가 실행될때 입력창에 커서 두기
let websocket = null; // js 웹 소켓 변수

start();

/*1. 엔터 입력했을때 이벤트 */
function enterkey(mid){ 
	
	if(window.event.keyCode == 13){
		if(mid == 'null'){
			alert("로그인 후 채팅입력이 가능합니다."); return;
		}
		send(mid); // 메시지 전송
	}
}

// 2. 버튼 눌렀을때 이벤트
function sendbtn(mid){
	if(mid == 'null'){
			alert("로그인 후 채팅입력이 가능합니다."); return;
		}
		send(mid); // 메시지 전송
}
	
/*3. 채팅 소켓 실행 */
function start(){
	// js 에서 사용되는 웹 소켓 클래스(ws : // ip번호/port번호/프로젝트명/서버소켓이름)
	let mid = $("#mid").val();
	websocket = new WebSocket("ws://192.168.17.54:8080/jspweb/chatting/" + mid);
	websocket.onopen = function(e){onOpen(e)}
	websocket.onmessage = function(e){onmessage(e)}
	websocket.onclose = function(e){onclose(e)}
	websocket.onerror = function(e){onerror(e)}
}
function onclose(e){alert("채팅방을 나갑니다.");}

function onerror(e){ 
	console.log(e);
	}

function onOpen(e){
	console.log(e);
}
function onmessage(e){
	// e : 메소드 이벤트 실행 정보가 담겨있는 객체
		// e.data : 메시지 내용이 담겨있는 필드
		
	let msg = JSON.parse(e.data); // 문자열 -> json으로
	
	if(msg["type"] != "1"){ // 메시지가 접속명단 타입이면
		let html = "";
		for(let i = 0; i<msg.length; i++){
	  html +=  // 기존 html 가져오기
	 			'<div class="row p-2"> '+
					'<div class="col-sm-4"> '+
						'<img alt="" src="../img/카톡프로필2.jpg" class="rounded-circle" width="100%" >'+
					'</div>'+
					'<div class="col-sm-8">'+
						'<div class="member_name"> '+msg[i]["mid"]+' </div>'+
						'<div class="btnbox">'+
							'<span > 귓말 </span>'+
							'<span > 친추 </span>'+
						'</div>'+
					'</div>'+
				'</div>';
	}
	$("#enterlist").html(html); 
/*	$("#contentbox").scrollTop($("#contentbox")[0].scrollHeight);
	// $("#contentbox").scrollTop : 현재 스크롤의 상단 위치
	// $("#contentbox")[0].scrollHeight) : 높이?*/
	}else{ // 메시지가 메시지 타입이면
		let from = msg["from"]; // json 키를 통한 value호출
		let content = msg["content"]; // json 키를 통한 value호출
		let img = msg["img"]; // json 키를 통한 value호출
		let date = msg["date"]; // json 키를 통한 value호출
		
		let html = $("#contentbox").html(); // 기존 html 가져오기
		if(from == $("#mid").val()) { // 현재 로그인 된 아이디와 보낸사람이 같으면
			// 내가 보냈을때
			html +=  
		'		<div class="secontentbox my-3"> <!-- 보낼때 메시지 구역 -->'+
		'			<span class="date">'+date+'</span>'+
		'			<span class="content">'+content+'</span>'+
		'		</div>';
		}else{
			// 다른 사람이 보냈을때
			html +=  
				'<div class="row"> <!-- 접속자 정보 표시구역 -->'+
'						<div class="col-sm-4"> <!-- 프로필 이미지 표시 구역 -->'+
'							<img alt="" src="../img/'+img+'" class="rounded-circle" width="100%">'+
'						</div>'+
'						'+
'						<div class="col-sm-8"> <!-- 접속자 이름, 기능 -->'+
'							<div class="member_name">'+from+''+
'								<span class="content">'+content+'</span>'+
'								<span class="date">'+date+'</span>'+
'							</div>'
'						</div>'+
'					</div>';
			}
			$("#contentbox").html(html); // 추가된 html 넣어주기
			// 스크롤 하단으로 내리기
			$("#contentbox").scrollTop($("#contentbox")[0].scrollHeight);
					// $("#contentbox").scrollTop : 현재 스크롤의 상단 위치 
					// $("#contentbox")[0].scrollHeight : 현재 스크롤의 전체 길이
		}
	}
	
	


function send(mid){
	
	let content = $("#incontent").val()
	
	// json 형식으로 통신
	let msg = { // js 객체화	// 객체명 = {속성명(key) : 값(value) , 속성명(key) : 값(value)}
		type : "1" , 						// 문자 전송 , 접속자 명단 구분
		from : mid , 						// 보내는 사람 명
		content : content, 						// 채팅내용
		img : "카톡프로필2.jpg" ,				// 프로필
		date : new Date().toLocaleTimeString()	// 채팅 보낸 시간
	}
	// json 통신할때 json모양의 문자열 변환
		// json -> 문자열 : JSON.stringify
		// 문자열 -> JSON : JSON.parse()
		
	websocket.send(JSON.stringify(msg)); // json모양 -> 문자열형식
	$("#incontent").val(""); // 전송 후 입력창 초기화
	$("#incontent").focus(); // 전송 후 포커스
}

























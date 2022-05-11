// jqeruy(제이쿼리) : js 프레임워크
	// $ : 제이쿼리 (라이브러리 설치 : header파일 body 태그에 cdn 추가)
// $(function() {실행문;}) : 문 서 실행시 무조건 실행되는함수
	// js식		: id불러오기 .getElementById(id)
	// jquery식	: $("#id")
		// .keyup () : 해당 id에 키보드가 눌렸을때 [입력 되었을때]
		
// 입력상자 유효성 확인 체크 배열
let pass = [false, false, false, false, false, false, false]

$(function() { // 문서 열리면 해당 코드가 실행

	// 배열 = [ ]

	// idcheck
	$("#mid").keyup(function(){ // mid가 입력될때마다 해당 함수가 실행
		// 1. html 태그내 값 가져오기
		let mid = document.getElementById("mid").value;
		// 2. html 태그내 데이터 넣기
		let idcheck = document.getElementById("idcheck");
		
		// 정규 표현식 : 특정한 규칙을 가지는 문자열의 집합 언어
		let idj = /^[a-zA-Z0-9]{5,15}$/; // 한글을 제외한 영문+숫자 5~15 사이 문자열 
			// /^ : 정규표현식 시작
			// $/ : 정규표현식 끝
			// [a-z] : 소문자 찾음
			// [A-Z] : 대문자 찾음
			// [0-9] : 숫자 찾음
			// {최소길이, 최대길이} : 문자 최소길이~최대길이 까지만 입력
				// 정규표현식.test(변수) : 해당 변수가 정규표현식에 동일하면 true 다르면 false;
		if(idj.test(mid)){ // 정규 표현식과 다르면
			
			// 아이디 중복체크
				// 비동기식 통신 [목적 : 페이지 전환 없이 (controller)java 통신]
			// $.ajax({속성 = 속성값, 속성 = 속성값}) // jquery 에서 제공해주는 메소드
			$.ajax({
            // 보내는 위치 [ 서블릿 경로 ]
            url : "../Idcheck" ,
            // 보내는 데이터  { "변수명" : 값 }
            data : { "mid" : mid } ,
            // 통신 성공 했을경우 (  result = 받은 값 변수 )
            success : function( result ){
              
               if( result == 1 ){ // 만약에 받은 데이터가 1이면
                  idcheck.innerHTML="사용중인 아이디 입니다."; 
                  pass[0] = false;
               }else{ // 만약에 받은 데이터가 1이 아니면
                  idcheck.innerHTML="사용가능한 아이디 입니다."; 
                  pass[0] = true;
               }
            }
         });
			
				
			
		}else{
			idcheck.innerHTML = "영문 , 숫자 포함 5~15길이로 입력해 주세요!!!!!!!!!!!!!";
			pass[0] = false;
		}
		
	}); // keyup end
	// 비밀번호 체크
	$("#mpassword").keyup(function(){ // 비밀번호 입력할 때마다
			// let mpassword = document.getElementById("mpassword").value; // js식
		let mpassword = $("#mpassword").val(); // jquery 식
		let mpasswordcheck = $("#mpasswordcheck").val();
		
		let passwordj = /^[a-zA-Z0-9]{5,15}$/;
		
		if(passwordj.test(mpassword)){ // 정규표현식 같으면
			if(mpassword != mpasswordcheck){ // 정규 표현식 
			// 비밀번호 와 비밀번호 체크 와 다르면
				// equals(x) // != ( o )
			$("#passwordcheck").html("패스워드가 서로 다릅니다."); pass[1] = false;
			}else{
				$("#passwordcheck").html("사용 가능한 비밀번호 입니다."); pass[1] = true; pass[2] = true;
			}
		}else{ // 정규표현식 다르면
			$("#passwordcheck").html("영소문자 5~15 사이로 입력해주세요!"); pass[1] = false;
		}
	}); // keyup end
	
		// 비밀번호 체크
	$("#mpasswordcheck").keyup(function(){ // 비밀번호 입력할 때마다
			// let mpassword = document.getElementById("mpassword").value; // js식
		let mpassword = $("#mpassword").val(); // jquery 식
		let mpasswordcheck = $("#mpasswordcheck").val();
		
		let passwordj = /^[a-zA-Z0-9]{5,15}$/;
		
		if(passwordj.test(mpasswordcheck)){ // 정규표현식 같으면
			if(mpassword != mpasswordcheck){ // 정규 표현식 
			// 비밀번호 와 비밀번호 체크 와 다르면
				// equals(x) // != ( o )
			$("#passwordcheck").html("패스워드가 서로 다릅니다."); pass[2] = false;
			}else{
				$("#passwordcheck").html("사용 가능한 비밀번호 입니다."); pass[2] = true; pass[1] = true;
			}
		}else{ // 정규표현식 다르면
			$("#passwordcheck").html("영소문자 5~15 사이로 입력해주세요!"); pass[2] = false;
		}
	}); // keyup end
	
	// 이름 체크
	
	$("#mname").keyup(function(){ 
		
		let mname = $("#mname").val(); // 해당 id의 데이터 가져오기
		let namej = /^[가-힣]{2,10}$/; // 한글만 2~10 정규표현식
		if(namej.test(mname)){
			$("#namecheck").html("사용 가능한 이름입니다."); pass[3] = true;
		}else{
			$("#namecheck").html("한글 2~10 사이만 가능합니다."); pass[3] = false;
		}
		
	 });
	
	// 전화번호 체크
	$("#mphone").keyup(function(){
		
		let mphone = $("#mphone").val();
		let phonej = /^010-([0-9]{4})-([0-9]{4})$/;
		if(phonej.test(mphone)){
			$("#phonecheck").html("사용 가능한 번호입니다."); pass[4] = true;
		}else{
			$("#phonecheck").html("010-0000-0000 형식으로 입력해주세요."); pass[4] = false;
		}
		
	});
	// 이메일 체크 
	$("#memail").keyup( function(){
		let memail = $("#memail").val();
		let memailaddress = $("#memailaddress").val();
		if( memailaddress == "" ){ 
			$("#emailcheck").html("이메일 주소 입력해주세요~");  pass[5] = false;
		}else{
			let emailj = /^[a-zA-Z0-9]{3,20}$/;
			if( emailj.test(memail) ){
				// 이메일 중복체크 
				let email = memail+"@"+memailaddress;
				$.ajax({
					url : "../emailcheck",
					data : { "email" : email } , 
					success : function( result ){
						if( result == 1 ){
							$("#emailcheck").html("사용중인 이메일 입니다."); pass[5] = false;
						}else{
							$("#emailcheck").html("사용가능한 이메일 입니다."); pass[5] = true;
						}
					}
				}); // ajax end 
				
			}else{
				$("#emailcheck").html("이메일 형식이 아닙니다.");  pass[5] = false;
			}
		}
	});
	
	// 이메일주소 목록상자 선택시 
	$("#emailselect").change( function(){ // 목록상자내 값이 변경 되었을때 이벤트
		
		let emailselect = $("#emailselect").val();
		if( emailselect == "" ){
			$("#memailaddress").val("");
			$("#memailaddress").attr("readonly" , false); // 읽기모드 취소
		}else{
			$("#memailaddress").val(emailselect);	// val() -> value 값
			$("#memailaddress").attr("readonly" , true); // attr -> attribute 속성
		}
		
	});
	
	
	// 주소 체크
	$("#address4").keyup(function(){
		
		let address1 = $("#address1").val();
		let address2 = $("#address2").val();
		let address3 = $("#address3").val();
		let address4 = $("#address4").val();
		
		if(address1 == "" || address2 == "" ||
		 		address3 == "" || address4 == ""){
			$("#addresscheck").html("모든 주소를 입력해 주세요."); pass[6] = false;
		}else{
			$("#addresscheck").html("사용 가능한 주소입니다."); pass[6] = true;
		}
		
	});
	
}); // 문서 열리면 해당 코드가 종료

// 폼 전송 메소드
function signup(){
	// pass 배열이 모두 true이면 폼 전송
	let check  = true;
	for(let i=0; i<pass.length; i++){
		if(pass[i] == false) check = false;
	}
	// js에서 전송하는 방식
	if(check) document.getElementById("signupform").submit();
	else{alert("필수 입력 사항이 입력되지 않습니다.")}
	
}

function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('address1').value = data.zonecode;
                document.getElementById("address2").value = roadAddr;
                document.getElementById("address3").value = data.jibunAddress;

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
    
function passwordchange(){
	
	$("#passwordbox").css("display", "block");
	
}

function send(){
	let nicname = $("#nicname").val();
	let content = $("#content").val();
	let ip = $("#ip").html();
	$.ajax({ 
		url : "send",
		data : { "nicname" : nicname , "content" : content , "ip" : ip  },
		success : function( result ){
			$("#nicname").val("");
			$("#content").val("");
		}
		
	});
	
}

$(function() {
	timer = setInterval( function () {
		alert();
	    $.ajax ({
	        url : "receive",
	        cache : false,
	        success : function ( result ) {
		        var co =  result.split(",");
		        var contents = "";
		        for( var i = 0 ; i<co.length-1 ; i++ ){
					
					let ip = $("#ip").html();
					
					if( co[i].split("_")[1] == ip ){
						contents += 
					 '<div class="box"  style="text-align: right;">'+
						'<div class="nicname">'+co[i].split("_")[2]+'</div>'+
						'<span class="date">'+co[i].split("_")[0].split(" ")[1]+'</span>'+
						'<span class="content">'+co[i].split("_")[3]+'</span>'+
						
					'</div>'
					}else{
						contents += 
					 '<div class="box">'+
						'<div class="nicname">'+co[i].split("_")[2]+'</div>'+
						'<span class="content">'+co[i].split("_")[3]+'</span>'+
						'<span class="date">'+co[i].split("_")[0].split(" ")[1]+'</span>'+
						
					'</div>'
					}
					
					 
				}
				$("#contentlist").html( contents );
				$('#contentlist').scrollTop($('#contentlist')[0].scrollHeight);
	        }
	    });
	    }, 500);
});

















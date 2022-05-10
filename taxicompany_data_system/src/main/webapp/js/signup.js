//회원가입 유효성 검사 조건: 모두 true 라면 가입 성공
let pass=[false,false,false,false,false];

$(function(){ //문서시작 시 함수시작
  
  	
  
    //아이디 중복체크
    $("#mid").keyup(function(){
        let mid= $("#mid").val();
        let idc=/^[a-zA-Z0-9]{4,15}$/;
	
        if(idc.test(mid)){
		
          $.ajax({
				url: "../Idcheck",
				data: {"mid":mid},
				success: function(result){
					if(result==1){
						$("#idcheck2").html("");
           				$("#idcheck").html("사용가능한 아이디 입니다.");  pass[0] = true;
					}else{
						$("#idcheck").html("");
           				$("#idcheck2").html("현재 사용중인 아이디가 존재합니다.");	pass[0] = false;
					}
				}
			}); 
        }else{
           $("#idcheck").html("");
           $("#idcheck2").html("영문,숫자 포함 4~15길이로 입력해주세요.");	pass[0] = false;
        }
        
    });

        //비밀번호 중복체크
        $("#mpwd").keyup(function(){
         
            let pwd=$("#mpwd").val();
            let pwdc=/^[a-zA-Z0-9]{5,15}$/;

            if(pwdc.test(pwd)){ //비밀번호 형식이 알맞을 경우
                    $("#pwdcheck2").html("");
                    $("#pwdcheck").html("사용할 수 있는 비밀번호입니다."); pass[1] = true;
            }else{ // 비밀번호 형식이 다를경우
                $("#pwdcheck").html("");
                $("#pwdcheck2").html("비밀번호 형식이 올바르지 않습니다."); pass[1] = false;
            }
        });

        
        //비밀번호 재확인 중복체크
        $("#mpwdcheck").keyup(function(){

            let pwd=$("#mpwd").val();
            let pwdcheck=$("#mpwdcheck").val();
            
            if(pwd==pwdcheck){
                $("#pwdcheck4").html("");
                $("#pwdcheck3").html("비밀번호가 일치합니다.");	pass[1] = true;
            }else{
                $("#pwdcheck3").html("");
                $("#pwdcheck4").html("비밀번호가 일치하지 않습니다."); pass[1] = false;
            }
            
        });
   		//이름 체크
        $("#mname").keyup(function(){

            let name=$("#mname").val();

            let namec=/^[가-힣]{2,5}$/;
            
            
            if(namec.test(name)){
                $("#namecheck2").html("");
                $("#namecheck").html("환영합니다. "+name+"*　님");	pass[2] = true;
            }else{
                $("#namecheck").html("");
                $("#namecheck2").html("사용할 수 없는 이름입니다.");	pass[2] =false;
            }
        });

        //전화번호 중복 체크
         $("#mphone").keyup(function(){
            
            let phone=$("#mphone").val();
            
            let phonec=/^([010]{3,3})([0-9]{8,8})$/;
            
            if(phonec.test(phone)){
                $("#phonecheck2").html("");
                $("#phonecheck").html("사용가능한 전화번호입니다.");	pass[3] = true;
            }else{
                $("#phonecheck").html("");
                $("#phonecheck2").html("사용할 수 없는 전화번호 이거나 올바르지 않은 형식입니다.");  pass[3] = false;     	     
            }
         });
        
         //이메일 체크
         $("#memail").keyup(function(){
	
            let email=$("#memail").val();
            let emailaddress= $("#memailaddress").val();
            
           	if(emailaddress==""){
				$("#emailcheck2").html("사용 할 수 없는 이메일 주소입니다.");	pass[4] = false;
			}else{
				let emailc=/^[a-zA-Z0-9]{3,20}$/;
				
				 if(emailc.test(email)){
               	 	
               	 	let emailfinal= email+"@"+emailaddress;
               	 	
               	 	$.ajax({
						url:"../EmailCheck",
						data:{"emailfinal":emailfinal},
						success: function(result){
							if(result==1){
								$("#emailcheck2").html("");
                				$("#emailcheck").html("사용가능한 이메일주소입니다.");	 pass[4] = true;
							}else{
								$("#emailcheck").html("");
                				$("#emailcheck2").html("동일한 이메일주소가 존재합니다.");	pass[4] = false;
							}
						}
	
					});
               	 
          		 }else{
                	$("#emailcheck").html("");
                	$("#emailcheck2").html("올바른 이메일 기입방식으로 입력하여주세요.");pass[4] = false;
           		 }
			}
        });
    
        //이메일 선택상자 체크
        $("#selectemail").change(function(){
			
			let email=$("#memail").val();
            let selectemail = $("#selectemail").val();
		
			
			
			   if(selectemail=="직접입력"){ //만약 "직접입력" 을 선택했다면
				$("#first").attr('disabled',true);
				$("#emailcheck").html("");
                $("#emailcheck2").html("이메일을 입력해 주세요.");	pass[4] = false;
                $("#memailaddress").val("");
                $("#memailaddress").attr("readonly" ,false);
                
                
                $("#memailaddress").keyup(function(){
                
                    let  memail= $("#memailaddress").val();
    			
                    let emailc = /^([a-z0-9]{4,10}).([a-z]{3,3})$/;
                    let emailc2 = /^([a-z0-9]{4,10}).([a-z]{2,2}).([a-z]{2,2})$/;
                    
                    if(emailc.test(memail) || emailc2.test(memail)){
                      console.log(2);
                        $("#emailcheck2").html("");
                        $("#emailcheck").html("사용가능한 이메일주소입니다."); pass[4] = true;
                    }else{ 
                        console.log(3);
                        $("#emailcheck").html("");
                        $("#emailcheck2").html("사용할 수 없는 이메일 주소입니다.");	pass[4] = false;
                    }
                    
                });
            
            }else{ //"직접입력" 을 선택 안했다면
                $("#first").attr('disabled',true);
                $("#memailaddress").attr("readonly" ,true);
			    $("#memailaddress").val(selectemail);
            	$("#emailcheck2").html("");
                $("#emailcheck").html("사용가능한 이메일주소입니다.");	pass[4] = true;
            } 

			if(email==""){	//만약 이메일 공백이라면 
			
			$("#emailcheck").html("");
            $("#emailcheck2").html("이메일을 입력해 주세요.");	pass[4] = false;
		
			}

        });

}); //문서종료 시 함수종료

function signup(){
	let check = true;
	
	for(let i = 0; i<pass.length; i++){
		
		if(pass[i] == false){
			check =false;
		}
	}
	if(check){
		document.getElementById("signupform").submit();
	}else{
		alert("필수 입력 사항이 모두 입력되지 않았습니다.")
	}
}



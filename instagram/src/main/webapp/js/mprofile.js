let mboardlist = []; // 초기값으로 공백 넣자 ~~

$(function(){
	getmyorder();
});


function getmyorder(){
	$.ajax({
		url : "../board/myboard",
		success : function(re){
			mboardlist = re;
			console.log(mboardlist);
			board();
		}
	});
}

let mboardcount = 2;

$(window).scroll(function(){
	
	if($(window).scrollTop() >= $(document).height() - $(window).height()){
		mboardcount+=2;
		board();
	}
});

function board(){
	let html = "";
	html += '<div class="row">'
	for(let i = 0; i<mboardlist.length; i++){
		//if(i == mboardcount){break;}
		
	/*A*/	html +=  
			'<div id="carouselExampleIndicators3'+mboardlist[i]["bno"]+'" class="my-2 col-md-4 carousel slide" data-bs-ride="carousel">'+
			'  <div class="carousel-inner">';
		
		for(  let z = 0 ; z< mboardlist[i]["myifilelist"].length ; z++ ){
			if( z == 0 ){
		/*B*/		html +=
				     '<div class="carousel-item active" data-bs-interval="2000" style="width:100%">';
			}else{
		/*C*/		html +=
				     '<div class="carousel-item" data-bs-interval="2000" style="width:100%">';
			}
			console.log(mboardlist[i]["myifilelist"]);
		/*D*/		html +=
					'<img style="height:300px"  src="/instagram/board/upload/'+mboardlist[i]["myifilelist"][z]["ifile"]+'">'+
					'</div>';
		}
	/*E*/	html +=  
				'  </div>'+
				'  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators3'+mboardlist[i]["bno"]+'" data-bs-slide="prev">'+
				'    <span class="carousel-control-prev-icon" aria-hidden="true"></span>'+
				'    <span class="visually-hidden">Previous</span>'+
				'  </button>'+
				'  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators3'+mboardlist[i]["bno"]+'" data-bs-slide="next">'+
				'    <span class="carousel-control-next-icon" aria-hidden="true"></span>'+
				'    <span class="visually-hidden">Next</span>'+
				'  </button>'+
				'</div>';	
		if(i==mboardlist.length-1){
			html += '</div>';
		}
	
	}
	$("#myboard").html(html);
}



///////////////////////////////////////////팔로우관련//////////////////////////////

function follow(mno){
	//alert(mno);
	$.ajax({
		url : "../follow/followlist",
		data : {"mno" : mno},
		success : function(re){
			followlist=re;
			console.log(followlist);
			followlistview(followlist);
		}
		
	});
}

function followlistview(){
	//alert(followlist);
	let html = "";
	for(let i = 0 ; i<followlist.length; i++){
		
		let followermno = followlist[i]["followermno"];
		
			$.ajax({
				url : "/instagram/follow/followermnoinfo",//나의 팔로우목록에서 내가팔로우한회원들 사진 출력
				async: false,
				data : {"followermno" : followermno },
				success : function(re){
					followimg=re;
					console.log(followimg);
					
					$.ajax({
						url : "/instagram/follow/followermnoinfo2",//나의 팔로우목록에서 내가팔로우한회원들 아이디 출력
						async: false,
						data : {"followermno" : followermno },
						success : function(re){
							followid=re;
							console.log(followid);
					
			html +=
					'<table>'+
	'					<tr>'+
	'						<td width="10%"><img class="rounded-circle" width="50%" src="/instagram/member/profileimg/'+followimg[0]["ifile2"]+'"></td>'+
	'						<td width="20%">'+followid[0]["mname2"]+'</td>'+
	'						<a href="/instagram/member/mprofile.jsp"><td width="10%"><button onclick="followcancel('+followermno+')" type="button" style="background-color:#0095f6; color: white; border: none; border-radius: 8px;">'+"팔로잉"+'</button></td></a>'+
	'					</tr>'+
	'				</table>';
						}
					})
				}
			})
	}
		$("#followlist2").html(html);
		
}
		
///////////////////////////////////////////팔로워관련//////////////////////////////
function follower(mno){
	//alert(mno);
	$.ajax({
		url : "../follow/followerlist",
		data : {"mno" : mno},
		success : function(re){
			followerlist=re;
			console.log(followerlist);
			followerlistview(followerlist);
		}
		
	});
}

function followerlistview(){
	//alert(followerlist);
	let html = "";
	for(let i = 0 ; i<followerlist.length; i++){
		
		let followingmno = followerlist[i]["followingmno"];
		
			$.ajax({
				url : "/instagram/follow/followingmnoinfo",//나의 팔로우목록에서 내가팔로우한회원들 사진 출력
				async: false,
				data : {"followingmno" : followingmno },
				success : function(re){
					followerimg=re;
					console.log(followerimg);
					
					$.ajax({
						url : "/instagram/follow/followingmnoinfo2",//나의 팔로우목록에서 내가팔로우한회원들 아이디 출력
						async: false,
						data : {"followingmno" : followingmno },
						success : function(re){
							followerid=re;
							console.log(followerid);
		
		html +=
				'<table>'+
'					<tr>'+
'						<td width="10%"><img class="rounded-circle" width="50%" src="/instagram/member/profileimg/'+followerimg[0]["ifile2"]+'"></td>'+
'						<td width="20%">'+followerid[0]["mname2"]+'</td>'+
'						<td width="10%"><a href="#">팔로워</a></td>'+
'					</tr>'+
'				</table>';
					}
				})
			}
		})
	}
		$("#followerlist2").html(html);
}


//////////////////////////////드래그앤드롭+모달////////////

	//////////////////////////////드래그앤드롭 end//////////////////////
	
function profilesave(){/*--------------form 전송--------------*/
	var form = $("#uploadprofile")[0];
	var formData = new FormData( form );
	$.ajax({
		url : "../member/Profile",
		type : 'POST' ,
		data : formData ,
		contentType : false ,
		processData : false ,
		success : function( re ){
			if( re == 1){
				alert(" 프로필사진변경완료 "); 
				form.reset(); 	/* form안에 적혀있는 내용 지우기 */
			}else{
				alert(" 프로필사진변경실패 ");
			}
		}
	});
}

/********* 첨부파일이 변경되면 특정태그에 첨부파일 이미지 표시 *******/
$("#profileimg").change( function( e ) { 
	/* 클라이언트가 업로드시 업로드파일의 경로 알기 */
	let reader = new FileReader();	/* 파일 읽어오는 클래스 */
	reader.readAsDataURL( e.target.files[0] ); /* readAsDataURL( 파일 ); 해당 파일 경로 찾기 */
	reader.onload = function( e ){	/* 찾은 파일의 경로 실행 -> 데이터 읽어오기 */
		$("#preview").attr( "src" , e.target.result );
	}
});



let boardlist = [];
let commentcountlist = [] ;
let getglickcountlist = [];
let rreplylist = [];
let replylist = [];
let getsaveglikeboards = [];

$(function(){
	getorder();
	commentcount();
	saveglikeboard();
	likecount();
});

function commentcount(){
	$.ajax({
		url : "/instagram/board/getcommentcount",
		success : function(re){
			commentcountlist = re;
			board(); 
	}
		
	});
	
}
function getorder(){
	$.ajax({
		url : "/instagram/board/board",
		success : function(re){
			boardlist = re;
			
			board();
		}
	});
}

let boardcount = 2;

$(window).scroll(function(){
	
	if($(window).scrollTop() >= $(document).height() - $(window).height()){
		boardcount+=2;
		board();
	}
});


// 반환된 이미지 리스트


let bno = -1; // 초기값 
function viewbno( viewbno ){ // (순서도1) 모달 버튼를 눌렀을때 js에 게시물번호가 저장되는 메소드
	bno = viewbno; // (순서도2)
	replyorder( bno );
	
		// (순서도3) : 저장된 게시물번호를 비동기를 통해 jsonarray로 이미지들을 가져온다..
			// 1. 반환된 값을 저장할 jsonarray 객체 필요
			// 2. controller 작성 
	 // 처음에 초기화 해야 // 기존에 클릭했던 게시물의 이지미가 사라집니다. 
	$.ajax({
		
		url:"/instagram/board/boardno",
		data : {"bno" : bno},
		async: false,
		success : function(re){
			let bimglist = re; // [1]
			// 반환값를 객체에 저장!! 
			
			// 모달 안에 있는 이미지 캐러셀 
			           let html =""; 
			            for( let i=0; i<bimglist.length; i++){
			              
			                 if( html.indexOf("active") == -1 ){
								 html +=
			                 	 	'<div class="carousel-item active" style="height: 500px;">';
							}else{
								html +=
			                 	 '<div class="carousel-item" style="height: 500px;" >';
							}
			                 html +=
									'<img style="width:100%"  src="/instagram/board/upload/'+bimglist[i]["ifile"]+'">'+
								'</div>';
			            }
				    	$("#캐러셀2").html(html);
		}
	});	
}


function replyorder( bno ){
	$.ajax({
		url : "/instagram/board/replylist",
		async: false,
		data : {"bno" : bno } , 
		success : function(re){
			replylist = re;
			reply();
		}
	});
}


let replycount = 10;

$(window).scroll(function(){
	
	if($(window).scrollTop() >= $(document).height() - $(window).height()){
		replycount+=5;
		reply();
	}
	
});

// 대댓글 출력 메소드
function rereplylist(bno,rno){
	$.ajax({
		url : "/instagram/board/rreplylist",
		data : {"bno" : bno , "rno" : rno},
		success : function(re){
			rreplylist = re;
			console.log(rreplylist);
			reply();
		}
	});
}

function reply(){
	let html = "";
	for(let i=0; i<replylist.length; i++){
		if(i == replycount){break;}
		
		html +=
			   '<div>'+
'					<t style="font-size: 20px; ">'+replylist[i]["mname2"]+'</t>'+
'					<t>'+replylist[i]["rcontent"]+'</t><br>'+
'					<t style="font-size: 15px;" class="text-secondary";>'+replylist[i]["rdate"]+'</t><br>'+
					'<t id="replybtn" class="text-secondary" onclick="rereplylist('+bno+' , '+replylist[i]["rno"]+')"> 답글 모두보기 </t><br>';
					for(let j=0; j<rreplylist.length; j++){
						if( rreplylist[j]["rindex"] == replylist[i]["rno"] ) {
							html +=
							'<t>'+rreplylist[j]["rcontent"]+'</t><br>';
						}
					}
					html +=
					'<textarea id="rrcontent" class="form-control" rows=1 ></textarea>'+
'					<t><a style="color: black; text-decoration:none; font-size: 15px;" class="text-secondary"; " href="#" onclick="rereplywrite('+bno+' , '+replylist[i]["rno"]+')"> 답글달기  </a></t>'+
'				</div>';	
	}
	let html2 = "";
		html2 +=
				'<div>' +	
				 	'<input class="header_input " id="modalrcontent" type="text"  placeholder="댓글 달기...">' +
				 	'<button style="border:none; color:#0095f6; background-color: #fafafa;" class="fs-5" onclick="modalreplywrite('+bno+')"> 게시 </button>' +
				 '	</div> <!-- 댓글 달기/ 게시 -->';
	$("#replylist").html(html);
	$("#replylist2").html(html2);
}

function rereplywrite(bno ,rno){
	let rrcontent = $("#rrcontent").val();
	$.ajax({
		url : "/instagram/board/rereplywrite",
		data : {"rno" : rno , "bno" : bno , "rrcontent" : rrcontent} ,
		success : function(re){
			if(re == 1){
				alert("대댓글 작성 성공");
				$("#rrcontent").val("");
			
			}else{
				alert("대댓글 작성 실패")
			}
		}
	});
}

function modalreplywrite(bno){
	let rcontent = $("#modalrcontent").val();
	$.ajax({
		url : "/instagram/board/replywrite",
		data : {"bno" : bno , "rcontent" : rcontent} ,
		success : function(re){
			if(re == 1){
				$("#rcontent").val("");
				viewbno( bno );	
			}else{
				alert("댓글 작성 실패");
			}
		}
	});
}


// 하트를 클릭했을때 db에 저장됨
function saveglike(bno){
	let mno = $("#mno").val();
	$.ajax({
		url : "/instagram/board/saveglike",
		data : { 'mno' : mno , 'bno' : bno } , 
		success : function( re ){
			if( re == 1 ){}
			else if( re == 2 ){}
			else if( re == 3 ){}
			 $('#change').load(location.href + '#change');
		}
	});
}

function likecount(){

	$.ajax({
		url : "/instagram/board/getglikecount",
		success : function(re){
			getglickcountlist = re;
			getorder();
		}
	});
}
// 좋아요 한 모든 보드의 bno를 불러옴
function saveglikeboard(){
	let mno = $("#mno").val();
	$.ajax({
		url : "/instagram/board/getsaveglikeboard",
		data : {"mno" : mno} ,
		success : function(re){
			getsaveglikeboards = re;
			getorder();			
		}
	});
}


function board(){
	let html = ""; 
	for(let i = 0; i<boardlist.length; i++){
		if(i == boardcount){break;}
		
		let followermno = boardlist[i]["mno"];
			$.ajax({
				url : "/instagram/follow/followcheck" , 
				async: false,
				data : {"followermno" : followermno },
				success : function(re){
					if(re==1){
						followcheck = true;
					}else{
						followcheck = false;
					}
					$.ajax({
						url : "/instagram/follow/followerprofileimg",
						async: false,
						data : {"followermno" : followermno },//이름은followermno이지만 사실은 게시물의mno입니다.
						success : function(re){
							memberimg=re;
							console.log(memberimg);
	html +=  
'		<div class="col-md-4 my-5 offset-4 contentbox"> <!-- 메인 구역 -->'+
'			 <div> <!-- 프로필 , 이름 구역  -->'+
'			 	<div class="row p-3 d-flex align-items-center">'+
'			 		<div class="col-md-2 profile"> <!--  프로필 사진 -->'+
'			 			<img class="rounded-circle" alt="" src="/instagram/member/profileimg/'+memberimg[0]["ifile2"]+'"  width="100%">'+
'			 			</div>'+
'			 		<div class="col-md-8">	  <!--  이름 -->'+
'			 			<span>'+boardlist[i]["mname2"]+'</span>';
						if(followcheck){
								html +=	
'								<button onclick="followcancel('+boardlist[i]["mno"]+')" type="button" style="background-color:#0095f6; color: white; border: none; border-radius: 8px;">'+"팔로잉"+'</button>';
						}else{	
								html +=
'			 					<button onclick="follow('+boardlist[i]["mno"]+')" type="button" style="background-color:#0095f6; color: white; border: none; border-radius: 8px;">'+"팔로우"+'</button>';	
						}		
						html +=
'			 			</div>	'+
'			 		<div class="col-md-2">	 <!-- 옵션 버튼  -->'+
						'<a href="#" data-bs-toggle="dropdown">'+
				           '<button class="optionbtn"> · · · </button>'+ // check
				        '</a>'+
'						<ul class="dropdown-menu text-small shadow" aria-labelledby="dropdownUser2" >'+
'				            <li><a class="dropdown-item" href="/instagram/main.jsp">흐음...</a></li>'+
'				         </ul>'+			 			
'			 		</div>'+
'			 	</div>'+
'			 </div>';
			
			// 1. 
			html +=  
				'<div id="carouselExampleIndicators3'+boardlist[i]["bno"]+'" class="carousel slide" data-bs-ride="carousel">'+
				'  <div class="carousel-inner">';
				
				for(  let z = 0 ; z< boardlist[i]["iflelist"].length ; z++ ){
					 if( z == 0 ){
						html += 
										'    <div class="carousel-item active">';
					}else{
						html += 
										'    <div class="carousel-item">';
					}
					html +=	
					'      <img src="/instagram/board/upload/'+boardlist[i]["iflelist"][z]["ifle"]+'"stlye="object-fit: cover;" width="100%;" height="400px;"> '+
							'</div>';
				}
				
		html +=  
				'  </div>'+
				'  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators3'+boardlist[i]["bno"]+'" data-bs-slide="prev">'+
				'    <span class="carousel-control-prev-icon" aria-hidden="true"></span>'+
				'    <span class="visually-hidden">Previous</span>'+
				'  </button>'+
				'  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators3'+boardlist[i]["bno"]+'" data-bs-slide="next">'+
				'    <span class="carousel-control-next-icon" aria-hidden="true"></span>'+
				'    <span class="visually-hidden">Next</span>'+
				'  </button>'+
				'</div>';		


			html +=
'			 <div style="padding: 0 0 0 15px;"> <!-- 하단 내용   -->';
					let glikepass = false;
					for(let d=0; d<getsaveglikeboards.length; d++){
						if(boardlist[i]["bno"] == getsaveglikeboards[d]["bno"]){
							glikepass = true;		
						}
					}
					if(glikepass){
						html +='<img id="change" onclick="saveglike('+boardlist[i]["bno"]+')" src="/instagram/img/빨간하트.png" width="5%" >';
					}else{
						html += '<img id="change" onclick="saveglike('+boardlist[i]["bno"]+')" src="/instagram/img/하트.png" width="5%" >';
					}
				html+=		
'				<a onclick="viewbno('+boardlist[i]["bno"]+')" style="background-color:#fafafa; text-decoration:none;" class=" text-secondary"  data-bs-toggle="modal" data-bs-target="#boardview" href="#"> '+
'					<img src="/instagram/img/댓글.png" width="7%" >'+
'				</a>'+
'				<a  style="text-decoration: none;" href="/instagram/dm/dm.jsp"> '+
'					<img src="/instagram/img/쪽지.png" width="9%" >'+
'				</a> <br> ';
					for(let c=0; c<getglickcountlist.length; c++){
						if(boardlist[i]["bno"] == getglickcountlist[c]["bno"]){
							html += '<a href="#" style="text-decoration: none; color : black; font-size:20px;">'+
							'좋아요' + getglickcountlist[c]["gno"] + '개'+
							' </a><br>';
						}
					}
				html += 
'				<a  style=" font-size:20px; color: black; text-decoration:none;" href="/instagram/member/mprofile.jsp">'+boardlist[i]["mname2"]+'</a> '+
'				<i>'+boardlist[i]["bcontent"]+'</i><br> ';
					
					replyorder( boardlist[i]["bno"] );
				
					for(let f=0; f<replylist.length; f++){
						if(f < 3){
							html +=
							'<div>' +  
							replylist[f]["mname2"] + 
							replylist[f]["rcontent"] +
							'</div>';
						}else if(f == 3){
							for(let j=0; j<commentcountlist.length; j++){
								if(boardlist[i]["bno"] == commentcountlist[j]["bno"]){
									html += 
									'<a onclick="viewbno('+boardlist[i]["bno"]+')" style="background-color:#fafafa; text-decoration:none;" class=" text-secondary"  data-bs-toggle="modal" data-bs-target="#boardview">'+
										'댓글'+commentcountlist[j]["rno"] + '개 모두보기'+
									'</a> <br> ';
									break;
								}
								
							}
							
						}
					}
					
					
					html += 
'				<a style="color: black; text-decoration:none;" class="text-secondary"" href="/instagram/board/boardreply.jsp?bno='+boardlist[i]["bno"]+'"> '+
'					'+boardlist[i]["bdate"]+''+
'				</a> <br> '+
				'<div>' +	
				 	'<input class="header_input " id="rcontent'+boardlist[i]["bno"]+'" type="text"  placeholder="댓글 달기...">' +
				 	'<button style="border:none; color:#0095f6; background-color: #fafafa;" class="fs-5" onclick="replywrite('+boardlist[i]["bno"]+')"> 게시 </button>' +
				 '	</div> <!-- 댓글 달기/ 게시  -->' +
				' </div>' +
'			</div>'+
'		</div>';
					}	
				})
			}
		})
	}
	$("#orderbox").html(html);
}

function replywrite(bno){
	let rcontent = $("#rcontent"+bno).val();
	$.ajax({
		url : "/instagram/board/replywrite",
		data : {"bno" : bno , "rcontent" : rcontent} ,
		success : function(re){
			if(re == 1){
				$("#rcontent").val("");
				getorder();		
			}else{
				alert("댓글 작성 실패");
			}
		}
	});
}


	//////////////////////////////드래그앤드롭+모달////////////

	//드래그앤 드롭으로 자유게시판 글쓰기
var fileList = []; //파일 정보를 담아 둘 배열
var fileIndex = 0; //파일 번호
var 사진카운트 = 0;
let 파일들 = [ ];
 
$(document).ready(function(){
    //드래그앤드랍
    $("#fileDrop").on("dragenter", function(e){
        e.preventDefault();
        e.stopPropagation();
    }).on("dragover", function(e){
	
        e.preventDefault();
        e.stopPropagation();
        $(this).css({
            background: "rgba(255,206,147,1)",
            transition: "all 0.3s ease"
        });
    }).on("dragleave", function(e){
	
        e.preventDefault();
        e.stopPropagation();
        $(this).css("background-color", "#FFF");
    }).on("drop", function(e){
        e.preventDefault();
        var files = e.originalEvent.dataTransfer.files;
        if(files != null && files != undefined){
            var tag = "";
            let html =$("#캐러셀").html();
            for(i=0; i<files.length; i++){
                var f = files[i];
                fileList.push(f);
                var fileName = f.name;  파일들.push(  { "fname" :f.name } );
                var fileSize = f.size / 1024 / 1024;
                fileSize = fileSize < 1 ? fileSize.toFixed(3) : fileSize.toFixed(1);
                tag +=
                        "<div id='miniFileList"+fileIndex +"' class='fileList'>" +
                            "<span class='fileName'>"+fileName+"</span>" +
                            "<span class='fileSize'>"+fileSize+" MB</span>" +
                            "<span class='clear'><a href='#' onclick='deleteFile(" + fileIndex + ")'; return false; style='margin-left:5px;'>삭제</a></span>" +
                        "</div>";
                 fileIndex++;
                 if( html.indexOf("active") == -1 ){
					 html +=
                 	 	'<div class="carousel-item active">';
				}else{
					html +=
                 	 '<div class="carousel-item">';
				}
                 html +=
						'<img  class="d-block w-100" id="img'+사진카운트+'">'+
					'</div>';
					사진카운트++;
            }
            
    
	    	$("#캐러셀").html(html);
            $(this).append(tag);
        }
        
	   if(files != null && files != undefined){
		    for( let j=0; j<사진카운트; j++){         
		        /* 클라이언트가 업로드시 업로드파일의 경로 알기 */
				let reader = new FileReader();	/* 파일 읽어오는 클래스 */
				reader.readAsDataURL( fileList[j] ); /* readAsDataURL( 파일 ); 해당 파일 경로 찾기 */
				reader.onload = function( e ){	/* 찾은 파일의 경로 실행 -> 데이터 읽어오기 */
				
					let gg = "#img"+j;
					$(gg).attr( "src" , e.target.result );
					
				}
			  }
		  }
		  
        $(this).css("background-color", "#FFF");
        
    });


    //저장하기
    $(document).on("click", "#save", function(){
        var formData = new FormData($("#uploadForm")[0]);
        if(fileList.length > 0){
            fileList.forEach(function(f){
                formData.append("fileList", f);
               
            });
        }
        
        $.ajax({
            url : "/instagram/board/Uploadimage",
            data : formData,
            type:'POST',
            enctype:'multipart/form-data',
            processData:false,
            contentType:false,
            dataType:'json',
            cache:false,
            success:function(result){
				
				
            }
        });
        // DB처리 
        $.ajax({
            url : "/instagram/board/Uploadimage2",
            data : {"fileList" : JSON.stringify( 파일들 ) , "content" : $("#content").val() },
            success:function(result){
				
            }
        });
						
        
        
        
    });
});

//첨부파일 개별 삭제 클릭시
 function deleteFile(fIndex){
    // 파일 사이즈 배열 삭제
    delete fileList[fIndex];
    // 업로드 파일 테이블 목록에서 삭제
    $("#miniFileList" + fIndex).remove();
}


	//////////////////////////////드래그앤드롭 end//////////////////////
	
	function newcontentpre(){
		$("#dropZone").css("display" , "block");
		$("#contentZone").css("display" , "none");
		
		$("#titlebox").html( 
			'<div class="col-md-4"  >'+
      			'<button onClick="window.location.reload()" type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>'+
      		'</div>'+
      		
      		'<div class="col-md-4 d-flex justify-content-center">'+
      			 '<span style="font-size: 20px;"> 새 게시물 </span>'+
      		'</div>'+
      		
      		'<div class="col-md-4 d-flex justify-content-end">'+
      			'<button  type="button" class="btn btn-secondary" onclick="newcontentnext()"> 다음 </button>'+
	      	'</div>'
		);
		
	}
	function newcontentnext(){
		$("#dropZone").css("display" , "none");
		$("#contentZone").css("display" , "block");
		
		$("#titlebox").html( 
			'<div class="col-md-4 ">'+
	      			'<button type="button" onclick="newcontentpre()" >이전</button>'+
	      		'</div>'+
	      		'<div class="col-md-4 d-flex justify-content-center">'+
	      			 '<span style="font-size: 20px;"> 새 게시물 </span>'+
	      		'</div>'+
	      		'<div class="col-md-4 d-flex justify-content-end">'+
	      		'<a href="main.jsp"><input type="button" id="save"  class="btn bg_01" value="공유하기"></a>'+
	      	'</div>'
		);
	}

///////////////////////////follow/////////////////////////
function follow(mno){
	$.ajax({
		url : "/instagram/follow/followbtn" , 
		data : {"mno" : mno },
		success : function(re){
			if(re==1){
				board();
			}else{}
		}
	});
	
}

function followcancel(mno){
	$.ajax({
		url : "/instagram/follow/followcancel" , 
		data : {"mno" : mno },
		success : function(re){
			if(re==1){
				board();
			}else{}
		}
	});
}

	
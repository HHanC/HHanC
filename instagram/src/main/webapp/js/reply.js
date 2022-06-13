
let replylist = [];


$(function(){
	replyorder();
});

function replyorder(){
	$.ajax({
		url : "../board/replylist",
		success : function(re){
			replylist = re;
			console.log(replylist);
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



function reply(){
	let html = "";
	for(let i=0; i<replylist.length; i++){
		if(i == replycount){break;}
		html +=
			   '<table>'+
'					<tr>'+
'						<td>'+replylist[i]["mname2"]+'</td>'+
'						<td>'+replylist[i]["rcontent"]+'</td>'+
'						<td>'+replylist[i]["rdate"]+'</td>'+
'						<td><a href="#"> 답글달기  </a></td>'+
'					</tr>'+
'				</table>';
	}
	$("#replylist").html(html);
}


function replywrite(bno){
	let rcontent = $("#rcontent").val();
	$.ajax({
		url : "../board/replywrite",
		data : {"bno" : bno , "rcontent" : rcontent} ,
		success : function(re){
			if(re == 1){
				$("#rcontent").val("");
				reply();
				location.reload();
			}else{
				alert("댓글 작성 실패");
			}
		}
	});
}
















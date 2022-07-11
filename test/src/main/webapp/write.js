
function write2(){
	
	if(document.write.jomin.value == ""){
		alert("주민번호가 입력되지 않았습니다!");
		document.write.jomin.focus();
		return false;
	}
	if(document.write.name.value == ""){
		alert("성명이 입력되지 않았습니다!");
		document.write.name.focus();
		return false;
	}
	if(document.write.no.value == ""){
		alert("후보번호가 입력되지 않았습니다!");
		document.write.no.focus();
		return false;
	}
	if(document.write.time.value == ""){
		alert("투표시간이 입력되지 않았습니다!");
		document.write.time.focus();
		return false;
	}
	if(document.write.place.value == ""){
		alert("투표장소가 입력되지 않았습니다!");
		document.write.place.focus();
		return false;
	}
	if(document.write.o.value == "" || document.write.x.value == ""){
		alert("유권자 확인이 입력되지 않았습니다!");
		document.write.o.focus();
		return false;
	}
	alert("정상적으로 등록 되었습니다!");
	document.write.submit();
}

function write3(){
	alert("정보를 지우고 처음부터 다시 입력합니다!");
	location.href="write.jsp";
}




















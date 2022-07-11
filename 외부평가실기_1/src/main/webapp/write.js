
function joinchk(){
	if( document.join.custname.value == ""){
		alert("회원성명를 입력해주세요");
		document.join.custname.focus();
		return false;
	}
	if( document.join.phone.value == ""){
		alert("회원전화를 입력해주세요");
		document.join.phone.focus();
		return false;
	}
	if( document.join.address.value == ""){
		alert("회원주소를 입력해주세요");
		document.join.address.focus();
		return false;
	}
	if( document.join.grade.value == ""){
		alert("회원등급를 입력해주세요");
		document.join.grade.focus();
		return false;
	}
	if( document.join.city.value == ""){
		alert("도시코드를 입력해주세요");
		document.join.city.focus();
		return false;
	}
	alert("회원등록이 완료되었습니다.");
	document.join.submit();
}
function updatechk(){
	if( document.update.custname.value == ""){
		alert("회원성명를 입력해주세요");
		document.update.custname.focus();
		return false;
	}
	if( document.update.phone.value == ""){
		alert("회원전화를 입력해주세요");
		document.update.phone.focus();
		return false;
	}
	if( document.update.address.value == ""){
		alert("회원주소를 입력해주세요");
		document.update.address.focus();
		return false;
	}
	if( document.update.grade.value == ""){
		alert("회원등급를 입력해주세요");
		document.update.grade.focus();
		return false;
	}
	if( document.update.city.value == ""){
		alert("도시코드를 입력해주세요");
		document.update.city.focus();
		return false;
	}
	alert("회원수정이 완료되었습니다.");
	document.update.submit();
}
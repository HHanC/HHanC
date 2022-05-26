<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		
		<table class="table">
			<tr> 
				<td width="25%">번호  </td>
				<td width="25%">작성자  </td> 
				<td width="25%">작성일  </td>  
				<td width="25%">조회수  </td> 
			</tr>
			<tr> 
			</tr>
				<tr> <td colspan="4"> 첨부파일 :  - </td> </tr>
				<tr> <td colspan="4"> 첨부파일 :    </td> </tr>
		</table>	
		<div class="row">
			<div class="col-md-2">
				<button class="form-control">삭제</button>
			</div>	
			<div class="col-md-2">
				<button class="form-control">수정</button>
			</div>
			<div class="col-md-2">
				<a href="boardlist.jsp"> <button class="form-control">목록</button> </a> <!-- 무조건 보이는 버튼 -->
			</div>
		</div>		
		<h4>댓글</h4>	
			<div class="col-md-10">
				<textarea id="rcontent" class="form-control" rows=3></textarea>
			</div>
			<div class="col-md-2">
				<button onclick="replywrite()">등록</button>
			</div>
		</div>
		<h5 class="text-center"> *로그인후 댓글쓰기가 가능합니다. </h5>
		
	

</body>
</html>
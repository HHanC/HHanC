<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>회원제 게시판</h3>
	
	<%
		String loginid = (String)session.getAttribute("loginid"); // 로그인 아이디 변수에 담음
		
		if(loginid != null){ // 로그인 아이디가 null 이 아니라면, 즉 로그인에 성공하면
	%>
	
		<div><%=loginid %>님 안녕하세요!!</div>
		<a href="write.jsp"> <button>글쓰기</button>  </a>
		<a href="logout.jsp"> <button>로그아웃</button> </a>
		<a href="deletecontroller.jsp"> <button>회원탈퇴</button> </a>
	
	<%		
		}else{ // 세션이 없으면 로그인 실패
	%>
	
	<a href="signup.jsp" > <button>회원가입</button> </a> <!-- 회원가입 버튼 누르면 signup.jsp 페이지로 이동 -->
	<form action="logincontroller.jsp" method="post">
		<input type="text" name="id">
		<input type="password" name="password">
		<input type="submit" value="로그인">
	</form>
	<%
		}
	%>
	
	<table>
		<tr>
			<th>번호</th><th>작성일</th>
			<th>작성자</th><th>제목</th>
		</tr>
	
	<%
		BoardDao boardDao = new BoardDao();
		ArrayList<Board> boardlist = boardDao.list();
		for(Board temp : boardlist){
	%>
		<tr>
			<td><%=temp.getBno()%></td>
			<td><%=temp.getBdate()%></td>
			<td><%=temp.getBwriter()%></td>
			<td> <a href="view.jsp?bno=<%=temp.getBno()%>">
					<%=temp.getBtitle()%></a>
			</td>
			<!-- href="파일명?변수명=값" get방식 -->
		</tr>
	<%	
		}
	%>
	</table>
</body>
</html>


















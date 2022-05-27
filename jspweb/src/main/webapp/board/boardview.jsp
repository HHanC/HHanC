<%@page import="dto.Reply"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Board"%>
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

	<%@include file ="../header.jsp" %>
	<div class="container">
		<% 
			int bno = Integer.parseInt( request.getParameter("bno") );		// 게시물번호
			String mid = (String)session.getAttribute("login"); 			// 세션 = 로그인된 아이디 
			
			// 조회수 중복방지 세션이 존재하지 않으면 
			if( session.getAttribute( mid+bno ) == null  ){
				// 조회수 증가처리 
				BoardDao.getBoardDao().increview( bno );
				// 조회수 중복방지[ 세션 생성 ]
				session.setAttribute( mid+bno , true );// 세션명 : 아이디 + 게시물번호  // 세션의 값 : true
				session.setMaxInactiveInterval( 60*60*24 ); // 24시간
			}
			
			Board board =  BoardDao.getBoardDao().getboard(bno); 			// 게시물번호로 게시물 dto 가져오기 
		%>
	
	
		<h4 class="boardview_title"><%=board.getBtitle() %></h4>
		
		<table class="table"> <!-- table : 부스트랩 테이블 클래스 -->
			<tr> 
				<td width="25%">번호  <%=board.getBno() %></td> <!-- td 가로길이 : width속성 -->
				<td width="25%">작성자  <%=board.getMid() %></td> 
				<td width="25%">작성일  <%=board.getBdate() %></td>  
				<td width="25%">조회수  <%=board.getBview() %></td> 
			</tr>
			<tr> 
				<td colspan="4"> <!-- colspan : 열 병합 // rowspan : 행 병합  -->
					<div class="boardview_content">	
						<%=board.getBcontent() %>
					</div>
				</td> 
			</tr>
			
			<% if( board.getBfile() == null ){ // 첨부파일이 없을경우 %> 
				<tr> <td colspan="4"> 첨부파일 :  - </td> </tr> <!-- 첨부파일 다운로드 -->
			<%	}else{ // 첨부파일이 있을경우 %>
				<tr> <td colspan="4"> 첨부파일 : <a href="filedown?bfile=<%=board.getBfile()%>">
					<%=board.getBfile() %></a> </td> </tr> <!-- 첨부파일 다운로드 -->
			<% } %>
			
		</table>
 <!----------------------------------- 게시물 삭제/수정/목록 버튼 구역 ------------------------------------------------->		
		<div class="row">
		<%
			if( board.getMno() == MemberDao.getmemberDao().getmno(mid) ){ 	// 아이디로 회원번호 가져와서 비교 
		%>
			<div class="col-md-2">
				<a href="delete?bno=<%=board.getBno()%>"> <button class="form-control">삭제</button> </a> <!--작성자와 로그인된 id가 동일하면 보이는 버튼  -->
			</div>	
			<div class="col-md-2">
				<a href="update.jsp?bno=<%=board.getBno()%>"> <button class="form-control">수정</button> </a> <!--작성자와 로그인된 id가 동일하면 보이는 버튼  -->
			</div>
		<%} %>
			<div class="col-md-2">
				<a href="boardlist.jsp"> <button class="form-control">목록</button> </a> <!-- 무조건 보이는 버튼 -->
			</div>
		</div>
 
		
	</div>
	<script src="/jspweb/js/board.js" type="text/javascript"></script>
	
	<%@include file ="../footer.jsp" %>


</body>
</html>














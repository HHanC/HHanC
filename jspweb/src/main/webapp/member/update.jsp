<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "../header.jsp" %>
		<br><br><br><br><br>
		<%
			// 1. 세션에 저장된 회원id 호출
			String mid = (String)session.getAttribute("login");
			// 2. 회원 정보 가져오기
			Member member = MemberDao.getmemberDao().getmember(mid);
		%>
		
		<div class="container"> 
			<div class="row">
				<div class="col-md-3"> <!-- 사이드바 -->
					<%@include file = "infosidebar.jsp" %>
				</div>
				<div class="col-md-9"> <!-- 본문 -->
				
					<%
					if( request.getParameter("result") != null  && request.getParameter("result").equals("1") ){
				%>
					<div> 회원정보가 수정 되었습니다.!!! </div>
				<%
					}else if( request.getParameter("result") != null  && request.getParameter("result").equals("2")  ){
				%>	
					<div> 회원정보가 실패!! 관리자에게문의 </div>
				<% 	
					}else if( request.getParameter("result") != null  && request.getParameter("result").equals("3")  ){
				%>
					<div> 회원정보가 실패!! 기존 비밀번호가 다릅니다. </div>
				<%
					}
				%>
				
					<div class="col-md-12">
						<div class="col-md-8 offset-2">
							<div class="col-md-12">
								<h3>회원수정</h3>
								<form action="../update" method="post"> <!-- update 서블릿 파일로 post 전송 -->
									<div class="">
										<input type="hidden" name="mno" value="<%=member.getMno()%>"> <br> <!-- 수정할 대상[pk] -->
										<div class="form-group row">
											아이디 : <%=member.getMid() %>
										</div>
										<br>
										<div class="form-group row">
											비밀번호 : <button class="form-control" style="height: 40px; width: 350px;" type="button" onclick="passwordchange()"> 비밀번호 변경 </button> <br>
										</div>
											<div id="passwordbox" style="display: none;">
												<input type="password" name="oldpassword">
												<input type="password" name="newpassword">
											</div>
										<br>
										<div class="form-group row">
										이름 : <input class="form-control" style="height: 40px; width: 350px;" type="text" name="mname" value="<%=member.getMname()%>"> <br>
										</div>
										<br>
										<div class="form-group row">
										연락처 : <input class="form-control" style="height: 40px; width: 350px;" type="text" name="mphone" value="<%=member.getMphone()%>"> <br>
										</div>
										<br>
										<div class="form-group row">
										이메일 : <input class="form-control" style="height: 40px; width: 175px;" type="text" name="memail" value="<%=member.getMemail().split("@")[0]%>">@
												<input class="form-control" style="height: 40px; width: 175px;" type="text" name="memailaddress"  value="<%=member.getMemail().split("@")[1]%>">
												<select style="height: 40px; width: 130px; margin: 0 0 0 5px;" id="emailselect" name="memailaddress">
													<option value="">직접입력</option>
													<option value="naver.com">naver.com</option>
													<option value="nate.com">nate.com</option>
													<option value="daum.com">daum.com</option>
												</select>
										</div>
										<br>
										<div class="form-group row">
										배송주소 : 
										<input class="form-control" style="height: 40px; width: 350px;" type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기">
										<input class="form-control" style="height: 40px; width: 350px; margin: 0 0 0 60px;" type="text" name="address1" value="<%=member.getMaddress().split("_")[0]%>" id="address1" name="address1" placeholder="우편번호">
										<input class="form-control" style="height: 40px; width: 350px; margin: 0 0 0 60px;" type="text" name="address2" value="<%=member.getMaddress().split("_")[1]%>" id="address2" name="address2" placeholder="도로명주소">
										<input class="form-control" style="height: 40px; width: 350px; margin: 0 0 0 60px;" type="text" name="address3" value="<%=member.getMaddress().split("_")[2]%>" id="address3" name="address3" placeholder="지번주소">
										<span id="guide" style="color:#999;display:none"></span>
										<input class="form-control" style="height: 40px; width: 350px; margin: 0 0 0 60px;" type="text" name="address4" value="<%=member.getMaddress().split("_")[3]%>" id="address4" name="address4" placeholder="상세주소">
										</div>
										<br>
										<input class="form-control" style="height: 40px; width: 175px; margin: 0 0 0 50px;" type="submit" value="변경적용">
										<a href="/jspweb/member/update.jsp"> <button class="form-control" style="height: 40px; width: 175px; margin: 0 0 0 50px;" type="button"> 변경취소 </button> </a>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../js/signup.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>

</body>
</html>















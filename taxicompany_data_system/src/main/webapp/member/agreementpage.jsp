<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	div{border: solid 1px black};
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- 사용자정의 css -->
	<link href="/taxicompany_data_system/css/main.css" rel="stylesheet">
</style>
</head>
<body>
<div><!--로고 이미지 (클릭 시 메인화면-->
	<a href="../main.jsp"><img src="#"> </a>
</div> 

<div class="container">
	<div class="col-md-12 text-center">
		<div>
		 약관 란 
		</div>
		<div><!-- 약관 동의 및 취소 버튼-->
			<div class="row">
				<div> <!-- 동의 -->
					<a href="signup.jsp"><button>확인</button></a>
				</div>
				<div> <!-- 취소 -->
					<a href="../main.jsp"><button>취소</button></a>
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file ="../footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>	
</body>
</html>
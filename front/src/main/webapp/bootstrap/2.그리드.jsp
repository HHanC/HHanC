<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
	
		*{border: solid 1px red;}
		
	</style>

</head>
<body>

	<%@include file="1.설치.jsp" %>
	<!-- 박스권 : container -->
	<!-- 그리드 : 박스권내 열 12칸  -->
	<div class="container"> <!-- container : 박스권 형성 -->
		<div class="row"> <!-- row : 가로배치 -->
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
			<div class="col-md-1"> .col-md-1 </div>
		</div>
		
		<div class="row">
			<div class="col-md-8"> col-md-8 </div>
			<div class="col-md-4"> col-md-4 </div>
		</div>
			<div class="row">
				<div class="col-md-4">col-md-4</div>
				<div class="col-md-4">col-md-4</div>
				<div class="col-md-4">col-md-4</div>
			</div>
			<div class="row">
				<div class="col-md-6">col-md-6</div>
				<div class="col-md-6">col-md-6</div>
			</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-4">
						외부 8 그리드 내 4 그리드 사용
					</div>
					<div class="col-md-8">
						외부 8 그리드 내 8 그리드 사용
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="row">
					<div class="col-md-6">
						외부 4 그리드내 6 그리드 사용
					</div>
					<div class="col-md-6">
						외부 4 그리드내 6 그리드 사용
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-5"> col-md-5</div>
			<div class="col-md-5 offset-md-2"> col-md-5</div>
		</div>
		<div class="row">
			<div class="col-md-4"> col-md-4 </div>
			<div class="col-md-7 offser-md-1"> col-md-7 </div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-5"> col-md-5 </div> <!-- 5 -->
			<div class="col-md-8"> col-md-8 </div> <!-- 8 : 13 그리드 -->
		</div>
	</div>
	

</body>
</html>











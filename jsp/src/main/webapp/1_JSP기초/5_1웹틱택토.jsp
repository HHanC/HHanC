<%@page import="javax.swing.plaf.metal.MetalBorders.Flush3DBorder"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! // 선언부 (메소드 선언o 실행x)
		String[] str = {"[ ]", "[ ]", "[ ]",
						"[ ]", "[ ]", "[ ]",
						"[ ]", "[ ]", "[ ]"};
		Random random = new Random();
	%>
	
	<% // 스크립트문 (메소드 선언x 실행o)
		// 게임판 초기화
		if(request.getParameter("re") != null){ // re가 null이 아니면
			if(request.getParameter("re").equals("re")){ // re와 re가 같다면
				for(int i=0; i<str.length; i++){ //for문을 사용하여
					str[i] = "[ ]"; // 모두 깡통으로 만든다
				}
			}
		}
		
		if(request.getParameter("b") != null){ // b가 null이 아니면
			// 사용자 입력 받기
			String a = request.getParameter("b"); // b(버튼)를 a변수에 담는다
			if(str[Integer.parseInt(a)].equals("[ ]")){ // str을 integer.paseint를 통해서 a를 int로 변환하여 배열의 길이를 나타냄..? 그리고 0번째의 value값을 클릭했을때 1번이 나타나게함..?
				str[Integer.parseInt(a)] = "[o]"; // 해당 배열의 길이에 o을 표시
			}
			if(!str[Integer.parseInt(a)].equals("[ ]")){ // !를 붙힌 이유는 a번째 []가 []랑 같지 않을경우
				while(true){ // 반복문을 사용하여
					int 위치 = random.nextInt(9); // 9개의 난수를 위치라는 변수에 담아주고
					if(str[위치].equals("[ ]")){ // str의 위치에 난수로 지정해준다.
						str[위치] = "[x]"; // 난수 지정
						break; // break를 사용하여 반복문 종료
					}
				}
			}
		}
			String 승리알 = ""; // ""을 승리알 변수에 저장
			for(int i=0; i<6; i+=3){ // 6보다 작으면 반복문 종료
				if(str[i].equals(str[i+1]) && str[i+1].equals(i+2)){ // 가로 조건
					승리알 = str[i]; // 해당 인덱스 번호에 승리알 넣어줌
				}
			}
			for(int i=0; i<3; i++){ // 3보다 작으면 반복문 종료
				if(str[i].equals(str[i+3]) && str[i+3].equals(str[i+6])){ // 세로 조건
					승리알 = str[i]; // 해당 인덱스 번호에 승리알 넣어줌
				}
			}
			if(str[0].equals(str[4]) && str[4].equals(str[8])){ // 대각선 승리
				승리알 = str[0];
			}
			if(str[2].equals(str[4]) && str[4].equals(str[6])){ // 대각선 승리
				승리알 = str[2];
			}
			if(승리알.equals("[o]")){ // 승리알에 [o] 표시
			%>
				<h3>플레이어 승리</h3>
			<% 
				for(int i=0; i<str.length; i++){
					str[i] = "[ ]"; // 배열에 저장되어있는 값을 초기화
				}%>
			<%
			}else if(승리알.equals("[x]")){ // 승리알에 [x] 표시
			%>
				<h3>컴퓨터 승리</h3>
			<%
				for(int i=0; i<str.length; i++){
					str[i] = "[ ]"; // 배열에 저장되어있는 값을 초기화
				}
			}
			
	%>
	<%=request.getParameter("b") %> <!-- 표현식 : html로 출력 -->
	<form action="5_1웹틱택토.jsp" method="get"> <!-- action을 사용하여 5_웹틱택토 연결 -->
		<button type="submit" name="b" value="0"><%= str[0]%></button> <!-- type을 submit으로하고 name을 b로 설정 -->
		<button type="submit" name="b" value="1"><%= str[1]%></button>
		<button type="submit" name="b" value="2"><%= str[2]%></button>
		<br> <!-- 줄바꿈 처리 -->
		<button type="submit" name="b" value="3"><%= str[3]%></button>
		<button type="submit" name="b" value="4"><%= str[4]%></button>
		<button type="submit" name="b" value="5"><%= str[5]%></button>
		<br>
		<button type="submit" name="b" value="6"><%= str[6]%></button>
		<button type="submit" name="b" value="7"><%= str[7]%></button>
		<button type="submit" name="b" value="8"><%= str[8]%></button>
		<br>
		<button type="submit" name="re" value="re">리셋</button>
	</form>

</body>
</html>
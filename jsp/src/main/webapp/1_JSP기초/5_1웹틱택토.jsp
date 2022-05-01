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
	
	<%!
		String[] str = {"[ ]", "[ ]", "[ ]",
						"[ ]", "[ ]", "[ ]",
						"[ ]", "[ ]", "[ ]"};
		Random random = new Random();
	%>
	
	<%
		if(request.getParameter("re") != null){
			if(request.getParameter("re").equals("re")){
				for(int i=0; i<str.length; i++){
					str[i] = "[ ]";
				}
			}
		}
		if(request.getParameter("b") != null){
			// 사용자 입력받기
			String a = request.getParameter("b"); // b가 a변수에 담김 // b는 문자여서  String자료형에 담음
			if(str[Integer.parseInt(a)].equals("[ ]")){ // 배열을 integer로 형변환 이유는 클릭했을때 배열의 인덱스 번호의 위치를 알기 위해
				str[Integer.parseInt(a)] = "[o]"; // 클릭한 깡통과 배열에 있는 깡통이 같다면 [o]표시
			}
			// 컴퓨터
			if(!str[Integer.parseInt(a)].equals("[ ]")){ // !를 붙힌 이유는
				while(true){ // 반복문을 돌려서
					int 위치 = random.nextInt(9); // 9개의 난수를 위치변수에 저장
					if(str[위치].equals("[ ]")){ 
						str[위치] = "[x]";
						break;
					}
				}
			}
		}
		// 승리 조건
		String 승리알 = ""; // 승리알에 공백
		for(int i=0; i<6; i+=3){
			if(str[i].equals(str[i+1]) && str[i+1].equals(str[i+2])){
				승리알 = str[i];
			}
		}
		for(int i = 0; i < 3; i++) {
			if(str[i].equals(str[i+3]) && str[i + 3].equals(str[i + 6])) {
				승리알 = str[i];
			}
		}
		if(str[0].equals(str[4]) && str[4].equals(str[8])) {
			승리알 = str[0];
		}
		if(str[2].equals(str[4]) && str[4].equals(str[6])) {
			승리알 = str[2];
		}
		if(승리알.equals("[o]")){%>
			<h3>플레이어 승리</h3>
			<%
			for(int i=0; i<str.length; i++){
				str[i] = "[ ]";
			}%>
			
		<%}else if(승리알.equals("[x]")){%>
			<h3>컴퓨터 승리</h3>	
		<%for(int i=0; i<str.length; i++){
			str[i] = "[ ]";
			}
		}
	%>
	<%=request.getParameter("b") %>
	<form action="5_1웹틱택토.jsp" method="get">
		<button type="submit" name="b" value="0"><%=str[0]%></button>
		<button type="submit" name="b" value="1"><%=str[1]%></button>
		<button type="submit" name="b" value="2"><%=str[2]%></button>
		<br>
		<button type="submit" name="b" value="3"><%=str[3]%></button>
		<button type="submit" name="b" value="4"><%=str[4]%></button>
		<button type="submit" name="b" value="5"><%=str[5]%></button>
		<br>
		<button type="submit" name="b" value="6"><%=str[6]%></button>
		<button type="submit" name="b" value="7"><%=str[7]%></button>
		<button type="submit" name="b" value="8"><%=str[8]%></button>
		<br>
		<button type="submit" name="re" value="re">리셋</button>
	</form>
	

</body>
</html>
















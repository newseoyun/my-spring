<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board Page</title>
</head>
<body>
<jsp:include page="footer.jsp"/>
<h1>여기는 board.jsp 입니다.</h1>
<hr>
<br>
모델타입으로 파라미터 주고받기 테스트
<br><br>
이름: ${name }
<br>
내용: ${contents }
<br>
<br>
<br>
<a onClick="goBack()">뒤로가기</a>

</body>
</html>
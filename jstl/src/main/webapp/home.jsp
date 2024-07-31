<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${ sessionScope.user == null }">
		<a href="/signUp.do">회원가입</a>
		<a href="/signIn.do">로그인</a>
	</c:if>
	<c:if test="${ sessionScope.user != null }">
		${sessionScope.user } <a href="/logout.do">로그아웃</a>
	</c:if>
	
	<a href="/board.do">게시판</a>
	
</body>
</html>
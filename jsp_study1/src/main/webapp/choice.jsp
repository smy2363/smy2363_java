<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
	request.setCharacterEncoding("utf-8");
%>
    
<jsp:useBean id="lunch" class="test.Lunch"/>
<jsp:setProperty name="lunch" property="*"/>

<jsp:getProperty name="lunch" property="menu"/><br>  
<jsp:getProperty name="lunch" property="price"/><br>
<jsp:getProperty name="lunch" property="restaurant"/>   


    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
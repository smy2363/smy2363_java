<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%-- index.jsp --%>   


<%
	String part = request.getParameter("part");

	if(part == null) part="main";
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jqueryCDN -->

<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

<!-- 부트 스트랩CDN -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="stylesheet" href="default.css">


<link rel="stylesheet" href="<%=part %>.css">

</head>
<body>

	<div id="wrap">
		<jsp:include page="header.jsp" />
		
		<div id="main">
			<%String subPage = part+".jsp"; %>
			<jsp:include page="<%=subPage%>" />
		</div>
		
		<jsp:include page="footer.jsp" />
	</div>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/write.do">
	<input type="hidden" name="method" value="write">

	<div id="writeBox">
		<div class="writeInput">
			<label>����</label>
			<input type="text" name="title" id="title">
		</div>
		
		<div class="writeInput">
			<label>����</label>
			<textarea name="content" id="content"></textarea>
		</div>
		<button>�ۼ�</button>
	
	</div>
</form>

</body>
</html>
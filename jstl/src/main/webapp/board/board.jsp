<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div id="boardWrap">
	<h2>게시판</h2>
	<div id="boardBox">
		<div id="boardListBox">
			<table id="boardList">
				<tr>
					<th class="num">번호</th>
					<th class="title">제목</th>
					<th class="writer">작성자</th>
					<th class="hit">조회수</th>
				</tr>
				
				<tr>
					<td class="num"></td>
					<td class="title">
						<a href="?part=view&id=">  </a>
					</td>
					<td class="writer"></td>
					<td class="hit"></td>
				</tr>
			
				
			</table>
		</div>
		<div id="boardSearchBox">
			<form method="get" action="?part=board">
				<div class="boardSearch">
					<input type="search" name="word" id="word">
					<button>검색</button>
				</div>
			</form>
		</div>
		<div id="boardWriteBox">
			<a  id="wrBt">글작성</a>
		</div>
	</div>
</div>

<script>
	
	$("#wrBt").on("click",function(){ //글작성을 클릭하면
		if( '${ sessionScope.user }' != ''){  
			location.href="/write.do"; 
		}else{
			var isOk = confirm("글 작성 권한이 없습니다. 로그인 하시겠습니까?");
			if(isOk){ // 로그인 하겠다고 확인 버튼클릭 하였으니 로그인페이지이동
				location.href="/signIn.do";
			}
		}
	});
	
</script>




</body>
</html>
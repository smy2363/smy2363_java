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
	<h2>�Խ���</h2>
	<div id="boardBox">
		<div id="boardListBox">
			<table id="boardList">
				<tr>
					<th class="num">��ȣ</th>
					<th class="title">����</th>
					<th class="writer">�ۼ���</th>
					<th class="hit">��ȸ��</th>
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
					<button>�˻�</button>
				</div>
			</form>
		</div>
		<div id="boardWriteBox">
			<a  id="wrBt">���ۼ�</a>
		</div>
	</div>
</div>

<script>
	
	$("#wrBt").on("click",function(){ //���ۼ��� Ŭ���ϸ�
		if( '${ sessionScope.user }' != ''){  
			location.href="/write.do"; 
		}else{
			var isOk = confirm("�� �ۼ� ������ �����ϴ�. �α��� �Ͻðڽ��ϱ�?");
			if(isOk){ // �α��� �ϰڴٰ� Ȯ�� ��ưŬ�� �Ͽ����� �α����������̵�
				location.href="/signIn.do";
			}
		}
	});
	
</script>




</body>
</html>
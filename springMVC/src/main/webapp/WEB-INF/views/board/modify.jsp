<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 수정 화면!!</h2>
	<form action="update.do" method="post">
		<table border="1">
			<tbody>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" size="100"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="contents" ></textarea></td>
				</tr>
			</tbody>
		</table>
		<button>저장</button>	
	</form>

</body>
</html>
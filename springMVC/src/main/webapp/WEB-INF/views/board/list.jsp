<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시판 목록 화면!!</h2>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td><a href="view.do">제목입니다.</a></td> <!-- http://localhost:8080/controller/board/view.do -->
				<td>2022-03-31</td>
			</tr>
		</tbody>
	</table>
	
	<button onclick="location.href='insert.do'">등록</button>
</body>
</html>
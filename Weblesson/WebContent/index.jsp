<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Index</title>
</head>
<body>
	<p>英単語、日本語を入力してください。</p>
	<form action="input" method="post">
		<table>
		<tr><th>英単語</th><td><input type="text" name="english"></td></tr>
		<tr><th>日本語</th><td><input type="text" name="japanese"></td></tr>
		</table>
		<input type="submit" value="送信">
	</form>
</body>
</html>

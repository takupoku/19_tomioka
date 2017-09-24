<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String english = (String)session.getAttribute("english"); %>
<% String japanese = (String)session.getAttribute("japanese"); %>
<% int count = (int)request.getAttribute("count"); %>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<p><%=count %>件登録しました。<p>
	<p>英単語：<%=english %>を登録しました。</p>
	<p>日本語：<%=japanese %>を登録しました。</p>
	<p><a href="list">登録リスト</a></p>
</body>
</html>
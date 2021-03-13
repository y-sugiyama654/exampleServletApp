<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.TUser"%>
<%
	// セッションスコープからユーザー情報を取得
	TUser loginUser = (TUser) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
	<h1>どこつぶログイン</h1>
	<%
		if (loginUser != null) {
	%>
	<p>ログイン成功しました。</p>
	<p>
		ようこそ<%=loginUser.getName()%>さん
	</p>
	<a href="/example/Main">つぶやき投稿・閲覧へ</a>
	<%
		} else {
	%>
	<p>ログイン失敗しました。</p>
	<a href="/example/">TOPへ</a>
	<%
		}
	%>
</body>
</html>
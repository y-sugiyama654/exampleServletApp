<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.TUser,model.Mutter,java.util.List" %>

<%
// セッションスコープに保存されたユーザー情報を取得
TUser loginUser = (TUser) session.getAttribute("loginUser");
// アプリケーションスコープに保存されたつぶやきリストを取得
List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
// リクエストスコープに保存されたエラーメッセージを取得
String errorMsg = (String) request.getAttribute("errorMsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
	<h1>どこつぶメイン</h1>
	<p>
		<%= loginUser.getName() %>さん、ログイン中
		<a href="/example/Logout" >ログアウト</a>
	</p>
	<p>
		<a href="/example/Main">更新</a>
	</p>
 	<form action="/example/Main" method="post">
 		<input type="text" name="text" />
 		<input type="submit" value="つぶやく" />
	</form>
	<% if (errorMsg != null) { %>
		<P><%= errorMsg %></P>
	<% } %>
	<% for(Mutter mutter : mutterList) { %>
		<p><%= mutter.getUserName() %>:<%= mutter.getText() %></p>
	<% } %>
</body>
</html>
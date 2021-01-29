<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%
	String namaeStr=request.getParameter("namae");
	String gakunenStr=request.getParameter("gakunen");
	String gozenStr=request.getParameter("gozen");
	String gogoStr=request.getParameter("gogo");
	
	int gozen = Integer.parseInt(gozenStr);
	int gogo = Integer.parseInt(gogoStr);
	int goukei =gozen+gogo;
	String hantei;
	if(gozen>=65 && gogo>=65 && goukei>=140){	
				hantei = "判定結果は合格です";
			}else{
				hantei = "判定結果は不合格です";
			}
%>
<html>
<body>
param2.jsp
<center><h1>
	国家試験判定
	<br>
	<font color='deeppink'>
		<%= gakunenStr %>
	</font>
	の
	<font color='deeppink'>
		<%= namaeStr %>
	</font>
	さん
	<br>
	あなたの得点は
	<br>
	午前
	<font color='deeppink'>
		<%= gozenStr %>
	</font>
	点　午後
	<font color='deeppink'>
		<%= gogoStr %>
	</font>
	点　合計
	<%= goukei %>
	点
	<br>
	<%= hantei %>
	<hr>
	<a href = "./kokushi2.html">戻る</a>
</h1></center>
</body>
</html>

<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%
	String namaeStr=request.getParameter("namae");
	String seibetuStr=request.getParameter("seibetu");
	String toshiStr=request.getParameter("toshi");
	String adress1Str=request.getParameter("adress1");
	
	String sei;
	if(seibetuStr.equals("1")){
	sei="男性";
	}else{
	sei="女性";
	}
%>
<html>
	<head><title>param2.jsp</title>
	</head>
	<body>
	param2.jsp
	<center><h1>HTMLさんから届きました
	<br><br>
	あなたは
	<br><font color='deeppink'>
	<%= adress1Str %>
	</font>にお住まいの
	<font color='deeppink'>
	<%= namaeStr %>
	</font>さんですね<br>
	ほいでもって<br>
	<font color='deeppink'>
	<%= toshiStr %>
	</font>才の
	<font color='deeppink'>
	<%= sei %>
	</font>なんですね</h1></center>
	<hr>
	<a href = "/JV16/param2.html">戻る</a>
	Working with server: <%= application.getServerInfo() %><br>
Servlet Specification: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
JSP version: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %><br>
	</body>
</html>
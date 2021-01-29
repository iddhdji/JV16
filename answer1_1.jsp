<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%
	String namaeStr=request.getParameter("namae");
	String yuubinStr=request.getParameter("yuubin");
	String jyuusyoStr=request.getParameter("jyuusyo");
	String telStr=request.getParameter("tel");
	String seibetuStr=request.getParameter("seibetu");
	String nenStr=request.getParameter("nen");
	String tukiStr=request.getParameter("tuki");
	String hiStr=request.getParameter("hi");
	String b_year=nenStr+"年"+tukiStr+"月"+hiStr+"日";
	String sei;
	if(seibetuStr.equals("0")){
	sei="男";
	}else{
	sei="女";
	}
	
	int b_yy =Integer.parseInt(nenStr);
	int b_mm =Integer.parseInt(tukiStr);
	int b_dd =Integer.parseInt(hiStr);
	
	
	Date today = new Date();
		Calendar cal =Calendar.getInstance();
		cal.setTime(today);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		int wk = cal.get(Calendar.DAY_OF_WEEK);
				String week ="";
		switch(wk){
		case 1: week = "(日)";break;
		case 2: week = "(月)";break;
		case 3: week = "(火)";break;
		case 4: week = "(水)";break;
		case 5: week = "(木)";break;
		case 6: week = "(金)";break;
		case 7: week = "(土)";break;
		}
		int age =yy-b_yy;
		if(b_mm>mm){
			age = age-1;
		}else if(b_mm==mm){
				if(b_dd > dd){
					age = age-1;
			}
		}
		
%>
<html>
<head>
<title>JSPへデータ送信</title>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
</head>
<body>
<h1>入力確認画面</h1>
<form method="post" action="./question1.jsp">
<table border="1">
<tr>
<th>項目名</th><th>内容</th>
</tr>
<tr>
<td>お名前</td>
<td>
<%= namaeStr %>
</td>
</tr>
<tr>
<td>郵便番号</td>
<td>
<%= yuubinStr %>
</td>
</tr>
<tr>
<td>住所</td>
<td>
<%= jyuusyoStr %>
</td>
</tr>
<tr>
<td>電話番号</td>
<td>
<%= telStr %>
</td>
</tr>
<tr>
<td>性別</td>
<td>
<%= sei %>
</td>
</tr>
<tr>
<td>生年月日</td>
<td>
<%= b_year %><%= week %>
</td>
</tr>
<tr>
<td>年齢</td>
<td>
<%= age %>才
</td>
</tr>
<tr>
<td colspan="2" align="center">
<a href="./question1_1.jsp">戻る</a>
</td>
</tr>
</table>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.lang.Math" %>
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
		int age =yy-b_yy;
		if(b_mm>mm){
			age = age-1;
		}else if(b_mm==mm){
				if(b_dd > dd){
					age = age-1;
			}
		}
		//今日の運勢
		String kuji="吉";
		double ramdomDou =Math.floor(Math.random()*10);
		int ramdom = (int)ramdomDou;
		String listkuji[]={"大吉","中吉","小吉","吉","末吉","凶","大凶","吉","吉","吉"};
		for(int i =0; i<1; i++){
		kuji=listkuji[ramdom];
		}
	
		//パスワード生成
		String pass ="";
		String listpass[] ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		//一文字目
		for(int i =0; i<1; i++){
		double ramdom2Dou =Math.floor(Math.random()*100);
		int ramdom2 = (int)ramdom2Dou;		
	 if(ramdom2 < 52){
		pass = pass +listpass[ramdom2+10];
		}else{
	i--;
	}
	}
		//二文字目以降
		for(int i =0; i<5; i++){
		double ramdom2Dou =Math.floor(Math.random()*100);
		int ramdom2 = (int)ramdom2Dou;		
	 if(ramdom2 < 62){
		pass = pass +listpass[ramdom2];
		}else{
	i--;
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
<%= b_year %>
</td>
</tr>
<tr>
<td>年齢</td>
<td>
<%= age %>才
</td>
</tr>
<tr>
<td>今日の運勢</td>
<td>
<%= kuji %>
</td>
</tr>
<tr>
<td>パスワード</td>
<td>
<%= pass %>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<a href="./question2_1.jsp">戻る</a>
</td>
</tr>
</table>
</body>
</html>
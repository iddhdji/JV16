<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	String[] syouhin =new String[3];
	
	String[] syouhin_count =new String[3];
	
	String cart_crea = request.getParameter("crea");
	String cart_crea1 = request.getParameter("crea1");
	String cart_crea2 = request.getParameter("crea2");
	String cart_crea3 = request.getParameter("crea3");
	String cart_plus1 = request.getParameter("plus1");
	String cart_minus1 = request.getParameter("minus1");
	String cart_plus2 = request.getParameter("plus2");
	String cart_minus2 = request.getParameter("minus2");
	String cart_plus3 = request.getParameter("plus3");
	String cart_minus3 = request.getParameter("minus3");
	if(cart_crea != null){
		session.removeAttribute("syouhin1");
		session.removeAttribute("syouhin2");
		session.removeAttribute("syouhin3");
	}
	
	if(cart_crea1 != null){
		session.removeAttribute("syouhin1");
	}
	
		if(cart_crea2 != null){
		session.removeAttribute("syouhin2");
	}
	
		if(cart_crea3 != null){
		session.removeAttribute("syouhin3");
	}
	
	syouhin[0]=request.getParameter("syouhin1");
	syouhin[1]=request.getParameter("syouhin2");
	syouhin[2]=request.getParameter("syouhin3");
	
	if(cart_plus1 != null){
	syouhin[0]="1";
	}
	
	if(cart_minus1 != null){
	syouhin[0]="-1";
	}
	
		if(cart_plus2 != null){
	syouhin[1]="1";
	}
	
	if(cart_minus2 != null){
	syouhin[1]="-1";
	}
	
		if(cart_plus3 != null){
	syouhin[2]="1";
	}
	
	if(cart_minus3 != null){
	syouhin[2]="-1";
	}
	
	syouhin_count[0]=(String)session.getAttribute("syouhin1");
	syouhin_count[1]=(String)session.getAttribute("syouhin2");
	syouhin_count[2]=(String)session.getAttribute("syouhin3");
			
	int goukei =0;
	for(int i = 0; i < 3; i++){
		if(syouhin[i] != null){
			if(syouhin_count[i] != null){
			goukei = Integer.parseInt(syouhin_count[i]);
			}
			goukei=goukei + Integer.parseInt(syouhin[i]);
			}
			}
			
	if(syouhin[0] != null){
		session.setAttribute("syouhin1",new Integer(goukei).toString());
	}else if(syouhin[1] != null){
		session.setAttribute("syouhin2",new Integer(goukei).toString());
	}else if(syouhin[2] != null){
		session.setAttribute("syouhin3",new Integer(goukei).toString());
	}
			
	session.setMaxInactiveInterval(30);
 %>
 
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ショッピング　カート</title>
</head>
<body>

<h2>カートの中には以下の商品が入っています</h2>
 <!--
 int型で判定する
 -->
	<% 
	String count1 = (String)session.getAttribute("syouhin1");
	String count2 = (String)session.getAttribute("syouhin2");
	String count3 = (String)session.getAttribute("syouhin3");
	int count4 =0;
	int count5 =0;
	int count6 =0;
	 if(count1 != null ){
	count4 =  Integer.parseInt(count1);
	}
	 if(count2 != null ){
	count5 =  Integer.parseInt(count2);
	}
	 if(count3 != null ){
	count6 =  Integer.parseInt(count3);
	}
	 %>
	
	 <% 
	 if(count1 != null && count4 != 0){
	  %>
	<table border="1">
	<tr>
	<td rowspan="3">
	<img src="./image/bung1.png" height="64px" width="64px">
	</td>
	</tr>
	<tr>
	<td>
	商品No.
	</td>
	<td width="100">
	1
	</td>
	</tr>
	<tr>
	<td>
	商品名
	</td>
	<td width="100">
	はさみ
	</td>
	</tr>
	<tr>
			<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="plus1" value="plus1">
	<input type="submit" value="+">
	</form>
	</td>
			<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="minus1" value="minus1">
	<input type="submit" value="-">
	</form>
	</td>
	</tr>
	<tr>
	<td>
	数量
	</td>
	<td>
	<%= count1 %>
	</td>
	</tr>
	<tr>
	<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="crea1" value="crea1">
	<input type="submit" value="カートを空にする">
	</form>
	</td>
	</tr>
	</table>
	<% 
	}
	 %>
	
	<% 
	 if(count2 != null && count5 != 0){
	  %>
	<table border="1">
	<tr>
	<td rowspan="3">
	<img src="./image/bung2.png" height="64px" width="64px">
	</td>
	</tr>
	<tr>
	<td>
	商品No.
	</td>
	<td width="100">
	2
	</td>
	</tr>
	<tr>
	<td>
	商品名
	</td>
	<td width="100">
	えんぴつ
	</td>
	</tr>
		<tr>
			<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="plus2" value="plus2">
	<input type="submit" value="+">
	</form>
	</td>
			<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="minus2" value="minus2">
	<input type="submit" value="-">
	</form>
	</td>
	</tr>
	<tr>
	<td>
	数量
	</td>
	<td width="100">
	<%= count2 %>
	</td>
	</tr>
	<tr>
	<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="crea2" value="crea2">
	<input type="submit" value="カートを空にする">
	</form>
	</td>
	</tr>
	</table>
	
		<% 
	}
	 %>
	
		<% 
	 if(count3 != null && count6 != 0){
	  %>
	<table border="1">
	<tr>
	<td rowspan="3">
	<img src="./image/bung3.png" height="64px" width="64px">
	</td>
	</tr>
	<tr>
	<td>
	商品No.
	</td>
	<td width="100">
	3
	</td>
	</tr>
	<tr>
	<td>
	商品名
	</td>
	<td width="100">
	ノート
	</td>
	</tr>
		<tr>
			<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="plus3" value="plus3">
	<input type="submit" value="+">
	</form>
	</td>
			<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="minus3" value="minus3">
	<input type="submit" value="-">
	</form>
	</td>
	</tr>
	<tr>
	<td>
	数量
	</td>
	<td width="100">
	<%= count3 %>
	</td>
	</tr>
	<tr>
	<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="crea3" value="crea3">
	<input type="submit" value="カートを空にする">
	</form>
	</td>
	</tr>
	</table>
	
			<% 
	}
	 %>
	<%  
	if(count1 == null && count2 == null && count3 == null){
	%>
	カートの中はありません
	<%
	}
	%>
	
	<table border="0">
	<tr>
	<td>
	<form method="post" action="./cart_in2.jsp">
	<input type="submit" value="お買い物を続ける">
	</form>
	</td>
	<td>
	<form method="post" action="./cart_out2.jsp">
	<input type="hidden" name="crea" value="crea">
	<input type="submit" value="カートを空にする">
	</form>
	</td>
	</tr>
	</table>
  </body>
</html>
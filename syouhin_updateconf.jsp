<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

	String session_name =(String)session.getAttribute("login_name");
	
	if(session_name == null){
response.sendRedirect("syouhin_index.jsp");
}
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	String syou_noStr  = request.getParameter("syouhin_no");
	String syou_nameStr  = request.getParameter("syouhin_name");
	String syou_preStr = request.getParameter("syouhin_pre");
	String syou_msgStr = request.getParameter("syouhin_msg");
	String syou_iconStr = request.getParameter("syouhin_icon");
	
	String syou_noStrb  = request.getParameter("syouhin_nob");
	String syou_nameStrb  = request.getParameter("syouhin_nameb");
	String syou_preStrb = request.getParameter("syouhin_preb");
	String syou_msgStrb = request.getParameter("syouhin_msgb");
	String syou_iconStrb = request.getParameter("syouhin_iconb");
	
	//都道府県の設定
	int pre_no = Integer.parseInt(syou_preStr);
	int pre_nob = Integer.parseInt(syou_preStrb);
	String pre_name="";
	String pre_nameb="";
	switch (pre_no) {
		case 1:
			pre_name ="北海道";
			break;	
		case 2:
			pre_name ="青森県";
			break;			
		case 3:
			pre_name ="岩手県";
			break;
		case 4:
			pre_name ="宮城県";
			break;
		case 5:
			pre_name ="秋田県";
			break;
		case 6:
			pre_name ="山形県";
			break;
		case 7:
			pre_name ="福島県";
			break;
		case 8:
			pre_name ="茨城県";
			break;
		case 9:
			pre_name ="栃木県";
			break;
		case 10:
			pre_name ="群馬県";
			break;
		case 11:
			pre_name ="埼玉県";
			break;
		case 12:
			pre_name ="千葉県";
			break;
		case 13:
			pre_name ="東京都";
			break;
		case 14:
			pre_name ="神奈川県";
			break;
		case 15:
			pre_name ="新潟県";
			break;
		case 16:
			pre_name ="富山県";
			break;
		case 17:
			pre_name ="石川県";
			break;
		case 18:
			pre_name ="福井県";
			break;
		case 19:
			pre_name ="山梨県";
			break;
		case 20:
			pre_name ="長野県";
			break;
		case 21:
			pre_name ="岐阜県";
			break;
		case 22:
			pre_name ="岐阜県";
			break;
		case 23:
			pre_name ="愛知県";
			break;
		case 24:
			pre_name ="三重県";
			break;
		case 25:
			pre_name ="滋賀県";
			break;
		case 26:
			pre_name ="京都府";
			break;
		case 27:
			pre_name ="大阪府";
			break;
		case 28:
			pre_name ="兵庫県";
			break;
		case 29:
			pre_name ="奈良県";
			break;
		case 30:
			pre_name ="和歌山県";
			break;
		case 31:
			pre_name ="鳥取県";
			break;
		case 32:
			pre_name ="島根県";
			break;
		case 33:
			pre_name ="岡山県";
			break;
		case 34:
			pre_name ="広島県";
			break;
		case 35:
			pre_name ="山口県";
			break;
		case 36:
			pre_name ="徳島県";
			break;
		case 37:
			pre_name ="香川県";
			break;
		case 38:
			pre_name ="愛媛県";
			break;
		case 39:
			pre_name ="高知県";
			break;
		case 40:
			pre_name ="福岡県";
			break;
		case 41:
			pre_name ="佐賀県";
			break;
		case 42:
			pre_name ="長崎県";
			break;
		case 43:
			pre_name ="熊本県";
			break;
		case 44:
			pre_name ="大分県";
			break;
		case 45:
			pre_name ="宮崎県";
			break;
		case 46:
			pre_name ="鹿児島県";
			break;
		case 47:
			pre_name ="沖縄県";
			break;
		default :
		break;
			}
	switch (pre_nob) {
		case 1:
			pre_nameb ="北海道";
			break;	
		case 2:
			pre_nameb ="青森県";
			break;			
		case 3:
			pre_nameb ="岩手県";
			break;
		case 4:
			pre_nameb ="宮城県";
			break;
		case 5:
			pre_nameb ="秋田県";
			break;
		case 6:
			pre_nameb ="山形県";
			break;
		case 7:
			pre_nameb ="福島県";
			break;
		case 8:
			pre_nameb ="茨城県";
			break;
		case 9:
			pre_nameb ="栃木県";
			break;
		case 10:
			pre_nameb ="群馬県";
			break;
		case 11:
			pre_nameb ="埼玉県";
			break;
		case 12:
			pre_nameb ="千葉県";
			break;
		case 13:
			pre_nameb ="東京都";
			break;
		case 14:
			pre_nameb ="神奈川県";
			break;
		case 15:
			pre_nameb ="新潟県";
			break;
		case 16:
			pre_nameb ="富山県";
			break;
		case 17:
			pre_nameb ="石川県";
			break;
		case 18:
			pre_nameb ="福井県";
			break;
		case 19:
			pre_nameb ="山梨県";
			break;
		case 20:
			pre_nameb ="長野県";
			break;
		case 21:
			pre_nameb ="岐阜県";
			break;
		case 22:
			pre_nameb ="岐阜県";
			break;
		case 23:
			pre_nameb ="愛知県";
			break;
		case 24:
			pre_nameb ="三重県";
			break;
		case 25:
			pre_nameb ="滋賀県";
			break;
		case 26:
			pre_nameb ="京都府";
			break;
		case 27:
			pre_nameb ="大阪府";
			break;
		case 28:
			pre_nameb ="兵庫県";
			break;
		case 29:
			pre_nameb ="奈良県";
			break;
		case 30:
			pre_nameb ="和歌山県";
			break;
		case 31:
			pre_nameb ="鳥取県";
			break;
		case 32:
			pre_nameb ="島根県";
			break;
		case 33:
			pre_nameb ="岡山県";
			break;
		case 34:
			pre_nameb ="広島県";
			break;
		case 35:
			pre_nameb ="山口県";
			break;
		case 36:
			pre_nameb ="徳島県";
			break;
		case 37:
			pre_nameb ="香川県";
			break;
		case 38:
			pre_nameb ="愛媛県";
			break;
		case 39:
			pre_nameb ="高知県";
			break;
		case 40:
			pre_nameb ="福岡県";
			break;
		case 41:
			pre_nameb ="佐賀県";
			break;
		case 42:
			pre_nameb ="長崎県";
			break;
		case 43:
			pre_nameb ="熊本県";
			break;
		case 44:
			pre_nameb ="大分県";
			break;
		case 45:
			pre_nameb ="宮崎県";
			break;
		case 46:
			pre_nameb ="鹿児島県";
			break;
		case 47:
			pre_nameb ="沖縄県";
			break;
		default :
		break;
			}
%>
<HTML>
<HEAD>
<TITLE>変更確認</TITLE>
<META HTTP-EQUIV="content-type"  CONTENT="text/html;charset=UTF-8">
</HEAD>
<BODY BGCOLOR="#FFFFFF">
<h1>変更確認</h1>
<p>以下の内容を変更します</p>
<FORM name="frm"  METHOD="POST" ACTION="./syouhin_updateout.jsp">
	<table border="1">
	<tr>
		<th bgcolor="#99CC00">項目名</th><th bgcolor="#99CC00">変更前</th><th bgcolor="#99CC00">→</th><th bgcolor="#99CC00">変更後</th>
	</tr>
	<% if(!(syou_nameStrb.equals(syou_nameStr))){ %>
	<tr>
		<td bgcolor="#99CC00">商品名</td>
		<td>
			<%= syou_nameStrb %>
		</td>
		<td>
			→
		</td>
		<td>
			<%= syou_nameStr %>
		</td>
	</tr>
	<% } %>
	<% if(!(pre_nameb.equals(pre_name))){ %>
	<tr>
		<td bgcolor="#99CC00">生産地</td>
		<td>
			<%= pre_nameb %>
		</td>
		<td>
			→
		</td>
		<td>
			<%= pre_name %>
		</td>
	</tr>
	<% } %>
	<% if(!(syou_msgStrb.equals(syou_msgStr))){ %>
	<tr>
		<td bgcolor="#99CC00">コメント</td>
		<td>
			<%= syou_msgStrb %>
		</td>
		<td>
			→
		</td>
		<td>
			<%= syou_msgStr %>
		</td>
	</tr>
	<% } %>
		<% if(!(syou_iconStrb.equals(syou_iconStr))){ %>
	<tr>
		<td bgcolor="#99CC00">アイコン</td>
		<td>
			<img src="./image/<%= syou_iconStrb %>.png" height="70px" width="70px" />
		</td>
		<td>
			→
		</td>
		<td>
			<img src="./image/<%= syou_iconStr %>.png" height="70px" width="70px" />
		</td>
	</tr>
	<% } %>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="登録">
			
		</td>
	</tr>
	</table>
	<input type="hidden" name="syouhin_no" value="<%= syou_noStr %>">
	<input type="hidden" name="syouhin_name" value="<%= syou_nameStr %>">
	<input type="hidden" name="syouhin_pre" value="<%= syou_preStr %>">
	<input type="hidden" name="syouhin_msg" value="<%= syou_msgStr %>">
	<input type="hidden" name="syouhin_icon" value="<%= syou_iconStr %>">
	
</form>
			<FORM  METHOD="POST" ACTION="./syouhin_updatein.jsp">
				<input type="submit" value="入力に戻る">
			</FORM>
				<form method="post" action="./syouhin_index.jsp">
		<input type="hidden" name="logout" value="logout">
		<input type="submit" value="ログアウト">
	</form>
</body>
</html>
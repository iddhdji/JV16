<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%

	String session_name =(String)session.getAttribute("login_name");
	
	if(session_name == null){
response.sendRedirect("syouhin_index.jsp");
}

	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

//入力データ受信
	String syou_noStr  = request.getParameter("syouhin_no");
	String pre_noStr  = "";
	String syou_iconStr  = "";
	String syou_preStr  = "";

	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;

	//ローカルのMySQLに接続する設定
	///String USER ="root";
	//String PASSWORD = "";
	//String URL ="jdbc:mysql://localhost/nhs90534db";

	//サーバーのMySQLに接続する設定
String USER = "nhs90534";
	String PASSWORD = "b19970311";
  String URL ="jdbc:mysql://192.168.121.16/nhs90534db";

	String DRIVER = "com.mysql.jdbc.Driver";

	//確認メッセージ
	StringBuffer ERMSG = null;
	
	//HashMap（1件分のデータを格納する連想配列）
	HashMap<String,String> map = null;
	 
	//ArrayList（すべての件数を格納する配列）
	ArrayList<HashMap> list = null;
	list = new ArrayList<HashMap>();
	 
	try{	// ロードに失敗したときのための例外処理
		// JDBCドライバのロード
		Class.forName(DRIVER).newInstance();

		// Connectionオブジェクトの作成
		con = DriverManager.getConnection(URL,USER,PASSWORD);

		//Statementオブジェクトの作成
		stmt = con.createStatement();

		//SQLステートメントの作成（選択クエリ）
		SQL = new StringBuffer();

		//SQL文の発行（選択クエリ）
		SQL.append("select * from syou_tbl where syou_no = ");
		SQL.append(syou_noStr);
		//SQL文の発行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());

		//抽出したデータを繰り返し処理で表示する。
		while(rs.next()){
		    //DBのデータをHashMapへ格納する
			map = new HashMap<String,String>();
			map.put("syou_no",rs.getString("syou_no"));
			map.put("syou_name",rs.getString("syou_name"));
			map.put("syou_pre",rs.getString("syou_pre"));
			map.put("syou_msg",rs.getString("syou_msg"));
			map.put("syou_icon",rs.getString("syou_icon"));
			pre_noStr  = rs.getString("syou_pre");
			syou_iconStr  = rs.getString("syou_icon");
			syou_preStr  = rs.getString("syou_pre");
			
			//1件分のデータ(HashMap)をArrayListへ追加
			list.add(map);
		}
	}	//tryブロック終了
	catch(ClassNotFoundException e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	catch(SQLException e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	catch(Exception e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
	}

	finally{
		//各種オブジェクトクローズ
	    try{
	    	if(rs != null){
	    		rs.close();
	    	}
	    	if(stmt != null){
	    		stmt.close();
			}
	    	if(con != null){
	    		con.close();
			}
	    }
		catch(SQLException e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
		}
	}
			//都道府県の設定
	int pre_no = Integer.parseInt(syou_preStr);
	String pre_name="";
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
%>
<HTML>
<HEAD>
<TITLE>削除確認</TITLE>
<META HTTP-EQUIV="content-type"  CONTENT="text/html;charset=UTF-8">
</HEAD>
<BODY BGCOLOR="#FFFFFF">
<h1>削除確認</h1>
<p>以下の内容を削除します</p>
<FORM name="frm" METHOD="POST" ACTION="./syouhin_delete.jsp">
	<table border="1">
	<%
	//ArryListからデータを取りだす
	for(int i=0; i<list.size(); i++){
%>
	<tr>
		<th bgcolor="#99CC00">項目名</th><th bgcolor="#99CC00">内容</th>
		<input type="hidden" name="syouhin_no" value="<%= list.get(i).get("syou_no") %>">
	</tr>
	<tr>
		<td bgcolor="#99CC00">商品名</td>
		<td>
			<%= list.get(i).get("syou_name") %>
		</td>
	</tr>
	<tr>
		<td bgcolor="#99CC00">生産地</td>
		<td>
			<%= pre_name %>
		</td>
	</tr>
	<tr>
		<td bgcolor="#99CC00">コメント</td>
		<td>
			<%= list.get(i).get("syou_msg") %>
		</td>
	</tr>
	<tr>
		<td bgcolor="#99CC00">アイコン</td>
		<td>
		<img src="./image/<%= syou_iconStr %>.png" height="70px" width="70px" />
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="削除">	
		</td>
		
	</tr>
	</table>
	<%
	}
%>
<script language="Javascript">
document.frm.syouhin_pre.selectedIndex = <%= pre_noStr %>-1;
</script>
<script language="Javascript">
document.frm.syouhin_icon.selectedIndex = <%= syou_iconStr %>-1;
</script>
</form>
<FORM  METHOD="POST" ACTION="./syouhin_main.jsp">
	<input type="submit" value="商品一覧に戻る">
</FORM>
<form method="post" action="./syouhin_index.jsp">
		<input type="hidden" name="logout" value="logout">
		<input type="submit" value="ログアウト">
	</form>
<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% }else{ %>
※エラーは発生しませんでした<br/>
<% } %>
</body>
</html>
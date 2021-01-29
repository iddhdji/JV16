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
	String syou_nameStr  ="";
	String pre_noStr  = "";
	String syou_msgStr ="";
	String syou_iconStr  = "";
	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;

	//ローカルのMySQLに接続する設定
	//String USER ="root";
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
			syou_nameStr  =rs.getString("syou_name");
			pre_noStr  = rs.getString("syou_pre");
			syou_msgStr =rs.getString("syou_msg");
			syou_iconStr  = rs.getString("syou_icon");
			
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
%>
<HTML>
<HEAD>
<TITLE>顧客変更</TITLE>
<META HTTP-EQUIV="content-type"  CONTENT="text/html;charset=UTF-8">
</HEAD>
<BODY BGCOLOR="#FFFFFF">
<h1>顧客変更</h1>
<FORM name="frm" METHOD="POST" ACTION="./syouhin_updateconf.jsp">
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
			<input type="text" name="syouhin_name" size="53" maxlength="20" value="<%= list.get(i).get("syou_name") %>">
		</td>
	</tr>
	<tr>
		<td bgcolor="#99CC00">生産地	<%= pre_noStr %></td>
		<td>
			<select size=1 name="syouhin_pre">
        		<option value="1">北海道</option>
				<option value="2">青森県</option>
				<option value="3">岩手県</option>
				<option value="4">宮城県</option>
				<option value="5">秋田県</option>
				<option value="6">山形県</option>
				<option value="7">福島県</option>
				<option value="8">茨城県</option>
				<option value="9">栃木県</option>
				<option value="10">群馬県</option>
				<option value="11">埼玉県</option>
				<option value="12">千葉県</option>
				<option value="13">東京都</option>
				<option value="14">神奈川県</option>
				<option value="15">新潟県</option>
				<option value="16">富山県</option>
				<option value="17">石川県</option>
				<option value="18">福井県</option>
				<option value="19">山梨県</option>
				<option value="20">長野県</option>
				<option value="21">岐阜県</option>
				<option value="22">静岡県</option>
				<option value="23">愛知県</option>
				<option value="24">三重県</option>
				<option value="25">滋賀県</option>
				<option value="26">京都府</option>
				<option value="27">大阪府</option>
				<option value="28">兵庫県</option>
				<option value="29">奈良県</option>
				<option value="30">和歌山県</option>
				<option value="31">鳥取県</option>
				<option value="32">島根県</option>
				<option value="33">岡山県</option>
				<option value="34">広島県</option>
				<option value="35">山口県</option>
				<option value="36">徳島県</option>
				<option value="37">香川県</option>
				<option value="38">愛媛県</option>
				<option value="39">高知県</option>
				<option value="40">福岡県</option>
				<option value="41">佐賀県</option>
				<option value="42">長崎県</option>
				<option value="43">熊本県</option>
				<option value="44">大分県</option>
				<option value="45">宮崎県</option>
				<option value="46">鹿児島県</option>
				<option value="47">沖縄県</option>
      		</select>
		</td>
	</tr>
	<tr>
		<td bgcolor="#99CC00">コメント</td>
		<td>
			<textarea name="syouhin_msg" rows="3" cols="40"><%= list.get(i).get("syou_msg") %></textarea>
		</td>
	</tr>
	<tr>
		<td bgcolor="#99CC00">アイコン</td>
		<td>
			<select name="syouhin_icon">
				<option value="1">いちご</option>
				<option value="2">りんご</option>
				<option value="3">さくらんぼ</option>
				<option value="4">すいか</option>
				<option value="5">パイナップル</option>
				<option value="6">メロン</option>
				<option value="7">バナナ</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="商品変更">
			<input type="reset" value="入力クリア">	
		</td>
		
	</tr>
	</table>
	<input type="hidden" name="syouhin_nob" value="<%= syou_noStr %>">
	<input type="hidden" name="syouhin_nameb" value="<%= syou_nameStr %>">
	<input type="hidden" name="syouhin_preb" value="<%= pre_noStr %>">
	<input type="hidden" name="syouhin_msgb" value="<%= syou_msgStr %>">
	<input type="hidden" name="syouhin_iconb" value="<%= syou_iconStr %>">
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
<br />
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
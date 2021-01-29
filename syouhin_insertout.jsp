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

	String syou_nameStr  = request.getParameter("syouhin_name");
	String syou_preStr = request.getParameter("syouhin_pre");
	String syou_msgStr = request.getParameter("syouhin_msg");
	String syou_iconStr = request.getParameter("syouhin_icon");
	
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
	
	//ヒットフラグ
	int hit_flag = 0;
	
	int ins_count =0;
	
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

		//SQL文の構築（選択クエリ）
		SQL.append("select * from syou_tbl");
        System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());

	
		SQL = new StringBuffer();
		SQL.append("insert into syou_tbl(syou_name,syou_pre,syou_msg,syou_icon)");
		SQL.append("values('");
		SQL.append(syou_nameStr);
		SQL.append("','");
		SQL.append(syou_preStr);
		SQL.append("','");
		SQL.append(syou_msgStr);
		SQL.append("','");
		SQL.append(syou_iconStr);
		SQL.append("')");
      System.out.println(SQL.toString());
      
      ins_count = stmt.executeUpdate(SQL.toString());
	

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

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>『顧客テーブルにレコードを追加するプログラム』</title>
</head>
<body>
<%
	if(ins_count==0){  //認証NG
%>
	追加NG<br>
	  <%= "登録処理が失敗しました" %>
<%
	}else{  //認証NG
%>
	追加OK<br>
	<%= ins_count + "件　商品登録が完了しました。" %>
<%
	}
%>

<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% } %>
<FORM  METHOD="POST" ACTION="./syouhin_main.jsp">
	<input type="submit" value="商品一覧に戻る">
</FORM>

	<form method="post" action="./syouhin_index.jsp">
		<input type="hidden" name="logout" value="logout">
		<input type="submit" value="ログアウト">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% 
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

//入力データ受信
	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;

	//ローカルのMySQLに接続する設定
	String USER ="root";
	String PASSWORD = "";
	String URL ="jdbc:mysql://localhost/nhs90534db";
	
	//サーバーのMySQLに接続する設定
//String USER = "nhs90534";
	//String PASSWORD = "b19970311";
  //String URL ="jdbc:mysql://192.168.121.16/nhs90534db";

	String DRIVER = "com.mysql.jdbc.Driver";

	//確認メッセージ
	StringBuffer ERMSG = null;
	String COMPMSG = null;
	String COMPPRO = null;
	boolean flg = true;
	
	String cus_id  = request.getParameter("id");
	String cus_pas = request.getParameter("pas");
	
	if(cus_id != "" && cus_pas != ""){
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
		SQL.append("select cus_name from cus_tbl ");
		SQL.append("where cus_id='");
		SQL.append(cus_id);
		SQL.append("' and cus_pas = '");
		SQL.append(cus_pas);
		SQL.append("'");
		//SQL文の発行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());
		if(rs.next() ==true){
	
	session.setMaxInactiveInterval(30);
	
	session.setAttribute("login_name",rs.getString("cus_name"));
	
	response.sendRedirect("syouhin_main.jsp");
	
	}else{
	
	COMPMSG="該当レコードは存在しません";
	}
	}
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
	}else{
	COMPMSG="未入力項目があります";
	}

 %>
<!DOCTYPE html>

<html>

  <head>
    <meta charset="utf-8">
    <title>認証処理</title>
  </head>
  <body>
<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% }else{ %>
<%= COMPMSG %>
<% } %>
    <form action="syouhin_index.jsp" method="post">
	<input type="submit" value="戻る">
    </form>
    
  </body>
</html>
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class syouhin_005fupdatein_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


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

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>顧客変更</TITLE>\r\n");
      out.write("<META HTTP-EQUIV=\"content-type\"  CONTENT=\"text/html;charset=UTF-8\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FFFFFF\">\r\n");
      out.write("<h1>顧客変更</h1>\r\n");
      out.write("<FORM name=\"frm\" METHOD=\"POST\" ACTION=\"./syouhin_updateconf.jsp\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t");

	//ArryListからデータを取りだす
	for(int i=0; i<list.size(); i++){

      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th bgcolor=\"#99CC00\">項目名</th><th bgcolor=\"#99CC00\">内容</th>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"syouhin_no\" value=\"");
      out.print( list.get(i).get("syou_no") );
      out.write("\">\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">商品名</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"syouhin_name\" size=\"53\" maxlength=\"20\" value=\"");
      out.print( list.get(i).get("syou_name") );
      out.write("\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">生産地\t");
      out.print( pre_noStr );
      out.write("</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<select size=1 name=\"syouhin_pre\">\r\n");
      out.write("        \t\t<option value=\"1\">北海道</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">青森県</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">岩手県</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">宮城県</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">秋田県</option>\r\n");
      out.write("\t\t\t\t<option value=\"6\">山形県</option>\r\n");
      out.write("\t\t\t\t<option value=\"7\">福島県</option>\r\n");
      out.write("\t\t\t\t<option value=\"8\">茨城県</option>\r\n");
      out.write("\t\t\t\t<option value=\"9\">栃木県</option>\r\n");
      out.write("\t\t\t\t<option value=\"10\">群馬県</option>\r\n");
      out.write("\t\t\t\t<option value=\"11\">埼玉県</option>\r\n");
      out.write("\t\t\t\t<option value=\"12\">千葉県</option>\r\n");
      out.write("\t\t\t\t<option value=\"13\">東京都</option>\r\n");
      out.write("\t\t\t\t<option value=\"14\">神奈川県</option>\r\n");
      out.write("\t\t\t\t<option value=\"15\">新潟県</option>\r\n");
      out.write("\t\t\t\t<option value=\"16\">富山県</option>\r\n");
      out.write("\t\t\t\t<option value=\"17\">石川県</option>\r\n");
      out.write("\t\t\t\t<option value=\"18\">福井県</option>\r\n");
      out.write("\t\t\t\t<option value=\"19\">山梨県</option>\r\n");
      out.write("\t\t\t\t<option value=\"20\">長野県</option>\r\n");
      out.write("\t\t\t\t<option value=\"21\">岐阜県</option>\r\n");
      out.write("\t\t\t\t<option value=\"22\">静岡県</option>\r\n");
      out.write("\t\t\t\t<option value=\"23\">愛知県</option>\r\n");
      out.write("\t\t\t\t<option value=\"24\">三重県</option>\r\n");
      out.write("\t\t\t\t<option value=\"25\">滋賀県</option>\r\n");
      out.write("\t\t\t\t<option value=\"26\">京都府</option>\r\n");
      out.write("\t\t\t\t<option value=\"27\">大阪府</option>\r\n");
      out.write("\t\t\t\t<option value=\"28\">兵庫県</option>\r\n");
      out.write("\t\t\t\t<option value=\"29\">奈良県</option>\r\n");
      out.write("\t\t\t\t<option value=\"30\">和歌山県</option>\r\n");
      out.write("\t\t\t\t<option value=\"31\">鳥取県</option>\r\n");
      out.write("\t\t\t\t<option value=\"32\">島根県</option>\r\n");
      out.write("\t\t\t\t<option value=\"33\">岡山県</option>\r\n");
      out.write("\t\t\t\t<option value=\"34\">広島県</option>\r\n");
      out.write("\t\t\t\t<option value=\"35\">山口県</option>\r\n");
      out.write("\t\t\t\t<option value=\"36\">徳島県</option>\r\n");
      out.write("\t\t\t\t<option value=\"37\">香川県</option>\r\n");
      out.write("\t\t\t\t<option value=\"38\">愛媛県</option>\r\n");
      out.write("\t\t\t\t<option value=\"39\">高知県</option>\r\n");
      out.write("\t\t\t\t<option value=\"40\">福岡県</option>\r\n");
      out.write("\t\t\t\t<option value=\"41\">佐賀県</option>\r\n");
      out.write("\t\t\t\t<option value=\"42\">長崎県</option>\r\n");
      out.write("\t\t\t\t<option value=\"43\">熊本県</option>\r\n");
      out.write("\t\t\t\t<option value=\"44\">大分県</option>\r\n");
      out.write("\t\t\t\t<option value=\"45\">宮崎県</option>\r\n");
      out.write("\t\t\t\t<option value=\"46\">鹿児島県</option>\r\n");
      out.write("\t\t\t\t<option value=\"47\">沖縄県</option>\r\n");
      out.write("      \t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">コメント</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<textarea name=\"syouhin_msg\" rows=\"3\" cols=\"40\">");
      out.print( list.get(i).get("syou_msg") );
      out.write("</textarea>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">アイコン</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<select name=\"syouhin_icon\">\r\n");
      out.write("\t\t\t\t<option value=\"1\">いちご</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">りんご</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">さくらんぼ</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">すいか</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">パイナップル</option>\r\n");
      out.write("\t\t\t\t<option value=\"6\">メロン</option>\r\n");
      out.write("\t\t\t\t<option value=\"7\">バナナ</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"商品変更\">\r\n");
      out.write("\t\t\t<input type=\"reset\" value=\"入力クリア\">\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_nob\" value=\"");
      out.print( syou_noStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_nameb\" value=\"");
      out.print( syou_nameStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_preb\" value=\"");
      out.print( pre_noStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_msgb\" value=\"");
      out.print( syou_msgStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_iconb\" value=\"");
      out.print( syou_iconStr );
      out.write("\">\r\n");
      out.write("\t");

	}

      out.write("\r\n");
      out.write("<script language=\"Javascript\">\r\n");
      out.write("document.frm.syouhin_pre.selectedIndex = ");
      out.print( pre_noStr );
      out.write("-1;\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"Javascript\">\r\n");
      out.write("document.frm.syouhin_icon.selectedIndex = ");
      out.print( syou_iconStr );
      out.write("-1;\r\n");
      out.write("</script>\r\n");
      out.write("</form>\r\n");
      out.write("<br />\r\n");
      out.write("<FORM  METHOD=\"POST\" ACTION=\"./syouhin_main.jsp\">\r\n");
      out.write("\t<input type=\"submit\" value=\"商品一覧に戻る\">\r\n");
      out.write("</FORM>\r\n");
      out.write("\t<form method=\"post\" action=\"./syouhin_index.jsp\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"logout\" value=\"logout\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"ログアウト\">\r\n");
      out.write("\t</form>\r\n");
 if(ERMSG != null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが発生しました<br />\r\n");
      out.print( ERMSG );
      out.write('\r');
      out.write('\n');
 }else{ 
      out.write("\r\n");
      out.write("※エラーは発生しませんでした<br/>\r\n");
 } 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

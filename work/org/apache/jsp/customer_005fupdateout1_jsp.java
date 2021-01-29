package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class customer_005fupdateout1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	//入力データ受信
	String cus_noStr  = request.getParameter("cus_no");

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
//	String USER = "nhsxxxxx";
//	String PASSWORD = "byyyymmdd";
//  String URL ="jdbc:mysql://192.168.121.16/nhsxxxxxdb";

	String DRIVER = "com.mysql.jdbc.Driver";

	//確認メッセージ
	StringBuffer ERMSG = null;
	
	//ヒットフラグ
	int hit_flag = 0;
	
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
		SQL.append("select * from cus_tbl where cus_no = ");
		SQL.append(cus_noStr);
//      System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());

		//入力したデータがデータベースに存在するか調べる
		if(rs.next()){  //存在する
			//ヒットフラグON
			hit_flag = 1;
			
		    //検索データをHashMapへ格納する
		    map = new HashMap<String,String>();
			map.put("cus_no",rs.getString("cus_no"));
			map.put("cus_id",rs.getString("cus_id"));
			map.put("cus_pas",rs.getString("cus_pas"));
			map.put("cus_name",rs.getString("cus_name"));
			
			//1件分のデータ(HashMap)をArrayListへ追加
			list.add(map);
		}else{  //存在しない
			//ヒットフラグOFF
			hit_flag = 0;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>顧客変更</TITLE>\r\n");
      out.write("<META HTTP-EQUIV=\"content-type\"  CONTENT=\"text/html;charset=UTF-8\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FFFFFF\">\r\n");
      out.write("customer_insertin.jsp\r\n");
      out.write("<BR><BR>\r\n");
      out.write("顧客変更\r\n");
      out.write("<BR><BR>\r\n");
      out.write("<FORM  METHOD=\"POST\" ACTION=\"/JV16/customer_updateout2.jsp\">\r\n");
      out.write("<input type=\"hidden\" name=\"cus_no\" value=\"");
      out.print( list.get(0).get("cus_no") );
      out.write("\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<th>項目名</th><th>内容</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>顧客ID</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<input type=\"text\" name=\"cus_id\" size=\"40\" maxlength=\"20\"\r\n");
      out.write("\t\t  value=\"");
      out.print( list.get(0).get("cus_id") );
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>パスワード</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<input type=\"text\" name=\"cus_pas\" size=\"41\" maxlength=\"20\"\r\n");
      out.write("\t\t  value=\"");
      out.print( list.get(0).get("cus_pas") );
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>氏名</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<input type=\"text\" name=\"cus_name\" size=\"40\" maxlength=\"20\"\r\n");
      out.write("\t\t  value=\"");
      out.print( list.get(0).get("cus_name") );
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t<BR><BR><HR>\r\n");
      out.write("\t<INPUT TYPE=\"SUBMIT\" VALUE=\"変更\">\r\n");
      out.write("\t<INPUT TYPE=\"RESET\" VALUE=\"入力クリア\">\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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

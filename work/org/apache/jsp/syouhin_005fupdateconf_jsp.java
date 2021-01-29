package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class syouhin_005fupdateconf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

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

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>変更確認</TITLE>\r\n");
      out.write("<META HTTP-EQUIV=\"content-type\"  CONTENT=\"text/html;charset=UTF-8\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FFFFFF\">\r\n");
      out.write("<h1>変更確認</h1>\r\n");
      out.write("<p>以下の内容を変更します</p>\r\n");
      out.write("<FORM name=\"frm\"  METHOD=\"POST\" ACTION=\"/JV16/syouhin_updateout.jsp\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th bgcolor=\"#99CC00\">項目名</th><th bgcolor=\"#99CC00\">変更前</th><th bgcolor=\"#99CC00\">変更後</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 if(!(syou_nameStrb.equals(syou_nameStr))){ 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">商品名</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print( syou_nameStrb );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print( syou_nameStr );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(!(pre_nameb.equals(pre_name))){ 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">生産地</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print( pre_nameb );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print( pre_name );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(!(syou_msgStrb.equals(syou_msgStr))){ 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">コメント</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print( syou_msgStrb );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      out.print( syou_msgStr );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
 if(!(syou_iconStrb.equals(syou_iconStr))){ 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#99CC00\">アイコン</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<img src=\"./image/");
      out.print( syou_iconStrb );
      out.write(".png\" height=\"70px\" width=\"70px\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<img src=\"./image/");
      out.print( syou_iconStr );
      out.write(".png\" height=\"70px\" width=\"70px\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"登録\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_no\" value=\"");
      out.print( syou_noStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_name\" value=\"");
      out.print( syou_nameStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_pre\" value=\"");
      out.print( syou_preStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_msg\" value=\"");
      out.print( syou_msgStr );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"syouhin_icon\" value=\"");
      out.print( syou_iconStr );
      out.write("\">\r\n");
      out.write("\t\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t<FORM  METHOD=\"POST\" ACTION=\"/JV16/syouhin_updatein.jsp\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"入力に戻る\">\r\n");
      out.write("\t\t\t</FORM>\r\n");
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

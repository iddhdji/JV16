package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.Calendar;
import java.lang.Math;

public final class answer2_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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
		String kuji="吉";
		double ramdomDou =Math.floor(Math.random()*10);
		int ramdom = (int)ramdomDou;
		String listkuji[]={"大吉","中吉","小吉","吉","末吉","凶","大凶","吉","吉","吉"};
		for(int i =0; i<1; i++){
		kuji=listkuji[ramdom];
		}
	
		
		String pass ="";
		String listpass[] ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for(int i =0; i<1; i++){
		double ramdom2Dou =Math.floor(Math.random()*100);
		int ramdom2 = (int)ramdom2Dou;		
	 if(ramdom2 < 52){
		pass = pass +listpass[ramdom2+10];
		}else{
	i--;
	}
	}
		
		for(int i =0; i<5; i++){
		double ramdom2Dou =Math.floor(Math.random()*100);
		int ramdom2 = (int)ramdom2Dou;		
	 if(ramdom2 < 62){
		pass = pass +listpass[ramdom2];
		}else{
	i--;
	}
	}
	

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>JSPへデータ送信</title>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>入力確認画面</h1>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>項目名</th><th>内容</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>お名前</td>\r\n");
      out.write("<td>\r\n");
      out.print( namaeStr );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>郵便番号</td>\r\n");
      out.write("<td>\r\n");
      out.print( yuubinStr );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>住所</td>\r\n");
      out.write("<td>\r\n");
      out.print( jyuusyoStr );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>電話番号</td>\r\n");
      out.write("<td>\r\n");
      out.print( telStr );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>性別</td>\r\n");
      out.write("<td>\r\n");
      out.print( sei );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>生年月日</td>\r\n");
      out.write("<td>\r\n");
      out.print( b_year );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>年齢</td>\r\n");
      out.write("<td>\r\n");
      out.print( age );
      out.write("才\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>今日の運勢</td>\r\n");
      out.write("<td>\r\n");
      out.print( kuji );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>パスワード</td>\r\n");
      out.write("<td>\r\n");
      out.print( pass );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\">\r\n");
      out.write("<a href=\"./question2_1.jsp\">戻る</a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
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

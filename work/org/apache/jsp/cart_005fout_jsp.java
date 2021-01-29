package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_005fout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 
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
 
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>ショッピング　カート</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>カートの中には以下の商品が入っています</h2>\r\n");
      out.write("\t");
 
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
	 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t ");
 
	 if(count1 != null && count4 != 0){
	  
      out.write("\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td rowspan=\"3\">\r\n");
      out.write("\t<img src=\"./image/bung1.png\" height=\"64px\" width=\"64px\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t商品No.\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t1\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t商品名\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\tはさみ\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"plus1\" value=\"plus1\">\r\n");
      out.write("\t<input type=\"submit\" value=\"+\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"minus1\" value=\"minus1\">\r\n");
      out.write("\t<input type=\"submit\" value=\"-\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t数量\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t");
      out.print( count1 );
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"crea1\" value=\"crea1\">\r\n");
      out.write("\t<input type=\"submit\" value=\"カートを空にする\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t");
 
	}
	 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
 
	 if(count2 != null && count5 != 0){
	  
      out.write("\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td rowspan=\"3\">\r\n");
      out.write("\t<img src=\"./image/bung2.png\" height=\"64px\" width=\"64px\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t商品No.\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t2\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t商品名\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\tえんぴつ\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"plus2\" value=\"plus2\">\r\n");
      out.write("\t<input type=\"submit\" value=\"+\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"minus2\" value=\"minus2\">\r\n");
      out.write("\t<input type=\"submit\" value=\"-\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t数量\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t");
      out.print( count2 );
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"crea2\" value=\"crea2\">\r\n");
      out.write("\t<input type=\"submit\" value=\"カートを空にする\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
 
	}
	 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
 
	 if(count3 != null && count6 != 0){
	  
      out.write("\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td rowspan=\"3\">\r\n");
      out.write("\t<img src=\"./image/bung3.png\" height=\"64px\" width=\"64px\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t商品No.\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t3\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t商品名\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\tノート\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"plus3\" value=\"plus3\">\r\n");
      out.write("\t<input type=\"submit\" value=\"+\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"minus3\" value=\"minus3\">\r\n");
      out.write("\t<input type=\"submit\" value=\"-\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t数量\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t");
      out.print( count3 );
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"crea3\" value=\"crea3\">\r\n");
      out.write("\t<input type=\"submit\" value=\"カートを空にする\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t");
 
	}
	 
      out.write('\r');
      out.write('\n');
      out.write('	');
  
	if(count1 == null && count2 == null && count3 == null){
	
      out.write("\r\n");
      out.write("\tカートの中はありません\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_in.jsp\">\r\n");
      out.write("\t<input type=\"submit\" value=\"お買い物を続ける\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"crea\" value=\"crea\">\r\n");
      out.write("\t<input type=\"submit\" value=\"カートを空にする\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("  </body>\r\n");
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

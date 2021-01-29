package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>商品一覧</h1>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td rowspan=\"4\">\r\n");
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
      out.write("\t<td>\r\n");
      out.write("\t数量\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t<select size=\"1\" name=\"syouhin1\">\r\n");
      out.write("\t<option value=\"1\">1</option>\r\n");
      out.write("\t<option value=\"2\">2</option>\r\n");
      out.write("\t<option value=\"3\">3</option>\r\n");
      out.write("\t<option value=\"4\">4</option>\r\n");
      out.write("\t<option value=\"5\">5</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input type=\"submit\" value=\"カートに入れる\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td rowspan=\"4\">\r\n");
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
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t数量\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t<select size=\"1\" name=\"syouhin2\">\r\n");
      out.write("\t<option value=\"1\">1</option>\r\n");
      out.write("\t<option value=\"2\">2</option>\r\n");
      out.write("\t<option value=\"3\">3</option>\r\n");
      out.write("\t<option value=\"4\">4</option>\r\n");
      out.write("\t<option value=\"5\">5</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input type=\"submit\" value=\"カートに入れる\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td rowspan=\"4\">\r\n");
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
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t数量\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t<select size=\"1\" name=\"syouhin3\">\r\n");
      out.write("\t<option value=\"1\">1</option>\r\n");
      out.write("\t<option value=\"2\">2</option>\r\n");
      out.write("\t<option value=\"3\">3</option>\r\n");
      out.write("\t<option value=\"4\">4</option>\r\n");
      out.write("\t<option value=\"5\">5</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input type=\"submit\" value=\"カートに入れる\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<form method=\"post\" action=\"./cart_out.jsp\">\r\n");
      out.write("\t<input type=\"submit\" value=\"カートの中を見る\">\r\n");
      out.write("\t</form>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kokushi2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');

	String namaeStr=request.getParameter("namae");
	String gakunenStr=request.getParameter("gakunen");
	String gozenStr=request.getParameter("gozen");
	String gogoStr=request.getParameter("gogo");
	
	int gozen = Integer.parseInt(gozenStr);
	int gogo = Integer.parseInt(gogoStr);
	int goukei =gozen+gogo;
	String hantei;
	if(gozen>=65 && gogo>=65 && goukei>=140){	
				hantei = "判定結果は合格です";
			}else{
				hantei = "判定結果は不合格です";
			}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("param2.jsp\r\n");
      out.write("<center><h1>\r\n");
      out.write("\t国家試験判定\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t\t");
      out.print( gakunenStr );
      out.write("\r\n");
      out.write("\t</font>\r\n");
      out.write("\tの\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t\t");
      out.print( namaeStr );
      out.write("\r\n");
      out.write("\t</font>\r\n");
      out.write("\tさん\r\n");
      out.write("\t<br>\r\n");
      out.write("\tあなたの得点は\r\n");
      out.write("\t<br>\r\n");
      out.write("\t午前\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t\t");
      out.print( gozenStr );
      out.write("\r\n");
      out.write("\t</font>\r\n");
      out.write("\t点　午後\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t\t");
      out.print( gogoStr );
      out.write("\r\n");
      out.write("\t</font>\r\n");
      out.write("\t点　合計\r\n");
      out.write("\t");
      out.print( goukei );
      out.write("\r\n");
      out.write("\t点\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      out.print( hantei );
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<a href = \"./kokushi2.html\">戻る</a>\r\n");
      out.write("</h1></center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

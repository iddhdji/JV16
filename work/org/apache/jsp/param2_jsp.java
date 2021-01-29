package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class param2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String seibetuStr=request.getParameter("seibetu");
	String toshiStr=request.getParameter("toshi");
	String adress1Str=request.getParameter("adress1");
	
	String sei;
	if(seibetuStr.equals("1")){
	sei="男性";
	}else{
	sei="女性";
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head><title>param2.jsp</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\tparam2.jsp\r\n");
      out.write("\t<center><h1>HTMLさんから届きました\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\tあなたは\r\n");
      out.write("\t<br><font color='deeppink'>\r\n");
      out.write("\t");
      out.print( adress1Str );
      out.write("\r\n");
      out.write("\t</font>にお住まいの\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t");
      out.print( namaeStr );
      out.write("\r\n");
      out.write("\t</font>さんですね<br>\r\n");
      out.write("\tほいでもって<br>\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t");
      out.print( toshiStr );
      out.write("\r\n");
      out.write("\t</font>才の\r\n");
      out.write("\t<font color='deeppink'>\r\n");
      out.write("\t");
      out.print( sei );
      out.write("\r\n");
      out.write("\t</font>なんですね</h1></center>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<a href = \"/JV16/param2.html\">戻る</a>\r\n");
      out.write("\tWorking with server: ");
      out.print( application.getServerInfo() );
      out.write("<br>\r\n");
      out.write("Servlet Specification: ");
      out.print( application.getMajorVersion() );
      out.write('.');
      out.print( application.getMinorVersion() );
      out.write("<br>\r\n");
      out.write("JSP version: ");
      out.print( JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() );
      out.write("<br>\r\n");
      out.write("\t</body>\r\n");
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

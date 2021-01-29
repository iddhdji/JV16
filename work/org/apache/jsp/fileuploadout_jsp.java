package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.List;
import java.util.Iterator;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public final class fileuploadout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8");
// 	 private static final long serialVersionUID = 1L;
	 FileItem fItem = null;
	 FileItem fItem1 = null; 
	 String str_name = null;
	 String str_value = null;
	 
	 	//(1)アップロードファイルを格納するPATHを取得
	    String path = getServletContext().getRealPath("./image");

	    //(2)ServletFileUploadオブジェクトを生成
	    DiskFileItemFactory factory = new DiskFileItemFactory();
	    ServletFileUpload upload = new ServletFileUpload(factory);
	    
	    //(3)アップロードする際の基準値を設定
	    factory.setSizeThreshold(1024);  //byte
	    upload.setSizeMax(-1);	//-1はファイルサイズに制限なし

	    try {
	      //出力先ファイル名を取得
	      //(4)ファイルデータ(FileItemオブジェクト)を取得し、
	      //   Listオブジェクトとして返す
	      List list = upload.parseRequest(request);

	      //(5)ファイルデータ(FileItemオブジェクト)を順に処理
	      Iterator iterator = list.iterator();
	      while(iterator.hasNext()){
	        fItem = (FileItem)iterator.next();
	      
	        //(6)フォームデータの場合
	        if((fItem.isFormField())){
	        	 //フォーム項目についての処理 
	        	 str_name = fItem.getFieldName();	// フォームのnameパラメータを取得
	        	 str_value = fItem.getString(); 	// フォームのvalueパラメータを取得
	        	if (str_name.equals("out_name")) {
	        		//出力ファイル名を変更する場合
	        		fItem1.write(new File(path + "/" + str_value + ".jpg"));
	        	}
	        }else{
	        	//ファイルデータの場合
	        	 fItem1 = fItem; //ファイルデータを退避
	        }
	      }
	    }catch (FileUploadException e) {
	      e.printStackTrace();
	    }catch (Exception e) {
	      e.printStackTrace();
	    }
 
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <title>ファイルアップロード</title>\r\n");
      out.write("  </head>\r\n");
      out.write(" \r\n");
      out.write("<body>\r\n");
      out.write("  <h2>ファイルアップロード成功</h2>\r\n");
      out.write("  <img src=\"image/");
      out.print( str_value );
      out.write(".jpg\" width=\"200\" alt=\"サンプル画像\"/>\r\n");
      out.write("  ");
      out.print( fItem );
      out.write("\r\n");
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

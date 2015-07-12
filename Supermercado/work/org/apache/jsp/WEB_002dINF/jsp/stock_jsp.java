package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Inicio</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\" style=\"background-color:lavender\">\r\n");
      out.write("  <div class=\"jumbotron\" style=\"background-color:lavender\">\r\n");
      out.write("   <div class=\"col-md-1\"></div>\r\n");
      out.write("   <div class=\"col-md-10\">\r\n");
      out.write(" <nav class=\"navbar navbar-default navbar-static-top\"> \r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div>\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li><a href=\"irIndex\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Volver a inicio</a></li>\r\n");
      out.write("        <li><a href=\"altaProducto\"><span class=\"glyphicon glyphicon-edit\" aria-hidden=\"true\"></span> Dar de Alta un Producto</a></li>\r\n");
      out.write("        <li><a href=\"agregarStock\"><span class=\"glyphicon glyphicon-plus-sign\" aria-hidden=\"true\"></span> Agregar Stock</a> </li> \r\n");
      out.write("        <li><a href=\"eliminarStock\"><span class=\"glyphicon glyphicon-remove-sign\" aria-hidden=\"true\"></span> Eliminar Stock</a> </li> \r\n");
      out.write("        <li><a href=\"verCarrito\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Ver Carrito</a>  </li> \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>\r\n");
      out.write("   <div class=\"col-md-1\"></div>\r\n");
      out.write("\r\n");
      out.write("         <h1 style=\"text-align:center\"> <small>SUPERMERCADO</small></h1>   \r\n");
      out.write("         <h4 style=\"text-align:center\"> <small>Listado de Stock</small></h4> \r\n");
      out.write("         <h1 style=\"text-align:center\"> <small><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span></small></h1>   \r\n");
      out.write("  </div>\r\n");
      out.write(" <div class=\"col-md-12\" style=\"height:150px\">\r\n");
      out.write(" \r\n");
      out.write("\t<div class=\"table table-striped\"> \r\n");
      out.write("\t \t<table class=\"table\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t  <td align=center><strong> Nombre </strong></td>\r\n");
      out.write("\t\t\t  <td align=center><strong> Precio </strong></td>\r\n");
      out.write("\t\t\t  <td align=center><strong> Cantidad </strong></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write(" </div>\r\n");
      out.write(" <div class=\"col-md-12\" style=\"height:150px\">\r\n");
      out.write(" <div class=\"col-md-2\"></div>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"col-md-2\"></div>\r\n");
      out.write(" </div>\r\n");
      out.write(" <div class=\"col-md-12\" style=\"height:120px\"> \r\n");
      out.write("  <div class=\"text-info\" align=\"center\">Universidad Nacional de La Matanza</div> \r\n");
      out.write("  <div class=\"text-info\" align=\"center\">Tecnicatura en Desarrollo Web</div> \r\n");
      out.write("  <div class=\"text-info\" align=\"center\">Taller Web 1 - Trabajo Práctico Final</div>\r\n");
      out.write("  <div class=\"text-info\" align=\"center\">RABUÑAL, JULIANA LAURA - TULA ACOSTA, MARIA LAURA</div>\r\n");
      out.write(" </div>\r\n");
      out.write(" </div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/stock.jsp(50,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stock.jsp(50,3) '${stockSuper}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${stockSuper}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stock.jsp(50,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("stock");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td align=center> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stock.key.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t<td align=center> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stock.key.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t<td align=center> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stock.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarSubmit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<title>Actualizacion de Stock</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\" style=\"background-color: lavender\">\r\n");
      out.write("\t\t<div class=\"jumbotron\" style=\"background-color: lavender\">\r\n");
      out.write("\t\t\t<h1 style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t<small> Stock de Producto Actualizado</small>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<h1 style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t<small><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span></small>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-12\" style=\"height: 350px\">\r\n");
      out.write("\t\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"verStock\" class=\"btn btn-primary btn-lg btn-block\"> \r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-th-list\" aria-hidden=\"true\"></span> Ver Stock\r\n");
      out.write("\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"agregarStock\" class=\"btn btn-primary btn-lg btn-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-plus-sign\" aria-hidden=\"true\"></span> Agregar Stock\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"eliminarStock\" class=\"btn btn-primary btn-lg btn-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-remove-sign\" aria-hidden=\"true\"></span>Eliminar Stock\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"altaProducto\" class=\"btn btn-primary btn-lg btn-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-edit\" aria-hidden=\"true\"></span> Dar de Alta un Producto\r\n");
      out.write("\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"irIndex\" class=\"btn btn-primary btn-lg btn-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Volver a inicio</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"verCarrito\" class=\"btn btn-primary btn-lg btn-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Ver Carrito\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-12\" style=\"height: 150px\">\r\n");
      out.write("\t\t\t<div class=\"text-info\" align=\"center\">Universidad Nacional de La Matanza</div>\r\n");
      out.write("\t\t\t<div class=\"text-info\" align=\"center\">Tecnicatura en Desarrollo Web</div>\r\n");
      out.write("\t\t\t<div class=\"text-info\" align=\"center\">Taller Web I - Trabajo Práctico Final</div>\r\n");
      out.write("\t\t\t<div class=\"text-info\" align=\"center\">RABUÑAL, JULIANA LAURA - TULA ACOSTA, MARIA LAURA</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
}

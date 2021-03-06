package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.ArrayList;
import Modelo.Charla;
import Modelo.Charla;

public final class RegistrarCharlaFin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Inicio</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"CSS/freelancer.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"SweetAlert/dist/sweetalert.min.js\"></script> <link rel=\"stylesheet\" type=\"text/css\" href=\"SweetAlert/dist/sweetalert.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            form{\n");
      out.write("                width:30%;\n");
      out.write("                margin-top:30px;\n");
      out.write("                margin-left:35%;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                margin-left:40%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\" class=\"index\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header page-scroll\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#page-top\">Charlas UTN 2015</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"hidden\">\n");
      out.write("                            <a href=\"#page-top\"></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"page-scroll\">\n");
      out.write("                            <a href=\"index.jsp\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"page-scroll\">\n");
      out.write("                            <a href=\"AgendaServlet\">Agenda</a>\n");
      out.write("                        </li>                  \n");
      out.write("                        <li class=\"page-scroll\">\n");
      out.write("                            <a href=\"#\">Contacto</a>\n");
      out.write("                        </li>     \n");
      out.write("\n");
      out.write("                        ");
 if (session.getAttribute("Usuario") == null) {
      out.write("\n");
      out.write("                        <li class=\"page-scroll\">\n");
      out.write("                            <a href=\"LogIn.jsp\">Iniciar Sesion</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
} else { 
      out.write("\n");
      out.write("                        <li class=\"page-scroll\">\n");
      out.write("                            <a href=\"CharlasOradores\">Nueva Charla</a>\n");
      out.write("                        </li>    \n");
      out.write("                        <li class=\"page-scroll\">\n");
      out.write("                            <a href=\"LogOut\">Cerrar Sesion</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>                     \n");
      out.write("                </div>                        \n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section >    \n");
      out.write("            <h1>Charla Finalizada</h1>\n");
      out.write("            <form method=\"post\" action=\"LogInServlet\" onsubmit=\"return Validacion()\">\n");
      out.write("                ");
 ArrayList<Charla> listaCharla = (ArrayList<Charla>) session.getAttribute("Charlas");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Charlas : </label>\n");
      out.write("                    <select  name=\"orador\" id=\"orador\" class=\"form-control placeholder\">\n");
      out.write("                        ");
 for (Charla listaC : listaCharla) {
      out.write("        \n");
      out.write("                        ");
 if (listaC.isEstado()) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(listaC.getCodigo());
      out.write('"');
      out.write('>');
      out.print(listaC.getTitulo());
      out.write("</option>\n");
      out.write("                        ");
}
                            }
      out.write("\n");
      out.write("                    </select>  \n");
      out.write("                </div>            \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Hora de finalizacion :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"hFin\" id=\"hFin\" placeholder=\"Hora de finalizacion\">\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Cantidad de Asistentes :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"asistentes\" id=\"asistentes\" placeholder=\"Cantidad de personas que asistieron a la charla\">\n");
      out.write("                </div> \n");
      out.write("                <input style=\"margin-left: 40%;\" type=\"submit\" class=\"btn btn-default\" value=\"Aceptar\">\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"text-center\">\n");
      out.write("            <div class=\"footer-above\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"footer-col col-md-4\">\n");
      out.write("                            <h3>Ubicacion</h3>\n");
      out.write("                            <p>Maestro M. Lopez esq. Cruz Roja Argentina<br>Ciudad Universitaria - Córdoba Capital</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-col col-md-4\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-col col-md-4\">\n");
      out.write("                            <h3>Sobre los Creadores</h3>\n");
      out.write("                            <p>Esta pagina fue creada por <a >Cassettai, Chanquia y Miloro</a>.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-below\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            Copyright &copy;\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->\n");
      out.write("        <div class=\"scroll-top page-scroll visible-xs visible-sm\">\n");
      out.write("            <a class=\"btn btn-primary\" href=\"#page-top\">\n");
      out.write("                <i class=\"fa fa-chevron-up\"></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Portfolio Modals -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"JavaScript/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"JavaScript/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Plugin JavaScript -->\n");
      out.write("        <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("        <script src=\"JavaScript/classie.js\"></script>\n");
      out.write("        <script src=\"JavaScript/cbpAnimatedHeader.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Form JavaScript -->\n");
      out.write("        <script src=\"JavaScript/jqBootstrapValidation.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Custom Theme JavaScript -->\n");
      out.write("        <script src=\"JavaScript/freelancer.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                function Validacion() {\n");
      out.write("                    var asistentes = document.getElementById(\"asistentes\").value;\n");
      out.write("                    var horaF = document.getElementById(\"hFin\").value;\n");
      out.write("\n");
      out.write("\n");
      out.write("                    if (horaF === null || horaF.length === 0 || horaF === \" \") {\n");
      out.write("                        swal({title: \"Error faltan campos!\", text: \"Debe ingresar la hora de Fin de la charla\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (asistentes === null || asistentes.length === 0 || asistentes === \" \") {\n");
      out.write("                        swal({title: \"Error faltan campos!\", text: \"Debe ingresar la cantidad de asistentes de la charla\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if (!ValidacionHora(horaF))\n");
      out.write("                        return false;\n");
      out.write("\n");
      out.write("                    if (isNaN(asistentes)) {                        \n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (!(asistentes % 1 === 0)) {\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function ValidacionHora(h) {\n");
      out.write("                    hora = h;\n");
      out.write("\n");
      out.write("                    if (hora.length > 5) {\n");
      out.write("                        swal({title: \"Error en el campo hora!\", text: \"Introdujo una cadena mayor a 5 caracteres\\n Debe ingresar un formato HH:MM \\n Por ejemplo 20:30\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (hora.length !== 5) {\n");
      out.write("                        swal({title: \"Error en el campo hora!\", text: \"Introdujo un formato incorrecto\\n Debe ingresar un formato HH:MM \\n Por ejemplo 20:30\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        ;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    a = hora.charAt(0);\n");
      out.write("                    b = hora.charAt(1);\n");
      out.write("                    c = hora.charAt(2);\n");
      out.write("                    d = hora.charAt(3);\n");
      out.write("                    e = hora.charAt(4);\n");
      out.write("\n");
      out.write("                    if ((a === 2 && b > 3) || (a > 2)) {\n");
      out.write("                        swal({title: \"Error en el campo hora!\", text: \"El valor que introdujo en la Hora no corresponde, introduzca un digito entre 00 y 23\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (d > 5) {\n");
      out.write("                        swal({title: \"Error en el campo hora!\", text: \"El valor que introdujo en los minutos no corresponde, introduzca un digito entre 00 y 59\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (c !== ':') {\n");
      out.write("                        swal({title: \"Error en el campo hora!\", text: \"Introduzca el caracter '  :  ' para separar la hora y los minutos\\n Por ejemplo 20:30\", type: \"error\", confirmButtonText: \"Cool\"});\n");
      out.write("                        return false;\n");
      out.write("                    }               \n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

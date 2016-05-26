<%-- 
    Document   : Reportes.jsp
    Created on : 10-nov-2015, 10:52:20
    Author     : Home
--%>

<%@page import="Modelo.ReporteCuatro"%>
<%@page import="Modelo.ReporteDos"%>
<%@page import="Modelo.Charla"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <% try { %>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Agenda Charlas 2015</title>

        <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
        <link href="CSS/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="CSS/freelancer.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.JavaScript/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
            th,td{
                text-align: center;
            }
        </style>
    </head>

    <body id="page-top" class="index">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#page-top">Charlas UTN 2015</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <li class="page-scroll">
                            <a href="index.jsp">Inicio</a>
                        </li>
                        <li class="page-scroll">
                            <a href="AgendaServlet">Agenda</a>
                        </li>                  
                        <li class="page-scroll">
                            <a href="#">Contacto</a>
                        </li>     

                        <% if (session.getAttribute("Usuario") == null) {%>
                        <li class="page-scroll">
                            <a href="LogIn.jsp">Iniciar Sesion</a>
                        </li>
                        <%} else { %>
                        <li class="page-scroll">
                            <a href="MenuAdministrador.jsp">Opciones</a>
                        </li>    
                        <li class="page-scroll">
                            <a href="LogOut">Cerrar Sesion</a>
                        </li>
                        <%}%>                                      
                    </ul>                   	
                </div>                        
            </div>
            <!-- /.container-fluid -->
        </nav>

        <!--Reporte 1-->
        <section >
            <div class="container">
                <div class="row">
                    <div class="col-md-5"></div>                    
                    <div class="col-md-4"> <h1>Reporte 1</h1> </div>
                    <div class="col-md-3"></div>
                </div>
                <div class="row" >   
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <p> Listado completo de charlas. El mismo debe mostrar toda la informacion de todas las charlas.</p>
                        <br>
                    </div>
                    <div class="col-md-2"></div>
                </div>

                <div class="row">    

                    <div class="col-md-12">
                        <% ArrayList<Charla> listaReporte1 = (ArrayList<Charla>) session.getAttribute("reporte1");%>
                        <table class="table table-striped  table-hover">
                            <tr>
                                <th>Codigo</th>
                                <th>Titulo</th> 
                                <th>Tematica</th>
                                <th>Orador</th>
                                <th>Hora Inicio</th>
                                <th>Hora Fin Programado</th>
                                <th>Hora Fin Real</th>
                                <th>N° de Asistentes</th>
                                <th>Estado</th>


                            </tr>
                            <% for (Charla lista : listaReporte1) {%>                            
                            <tr>
                                <td>
                                    <%= lista.getCodigo()%>
                                </td>
                                <td>
                                    <%= lista.getTitulo()%>
                                </td>
                                <td>
                                    <%= lista.getTematica()%>
                                </td>
                                <td>
                                    <%= lista.getOrador()%>
                                </td>
                                <td>
                                    <%= lista.getHoraIni()%>
                                </td>
                                <td>
                                    <%= lista.getHoraFin()%>
                                </td>
                                <td>
                                    <%= lista.getDuracionReal()%>
                                </td>
                                <td>
                                    <%= lista.getCantAsistentes()%>
                                </td>
                                <td>
                                    <%if (lista.isEstado()) {%> Abierto <%} else {%>Cerrada <%}%>
                                </td>

                            </tr>
                            <% }%>
                        </table>
                    </div>                

                </div>
            </div>
        </section>


        <!--reporte 2-->
        <section class="success">
            <div class="container">
                <div class="row">
                    <div class="col-md-5"></div>                    
                    <div class="col-md-4"> <h1>Reporte 2</h1> </div>
                    <div class="col-md-3"></div>
                </div>
                <div class="row" >   
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <p> Listado de charlas que se prolongaron mas alla de la duracion planificada. Se debe mostrar nombre del orador y minutos de exceso de aquellas charlas cuya duracion real supero en 10 minutos o mas la duracion prevista.</p>
                        <br>
                    </div>
                    <div class="col-md-2"></div>
                </div>

                <div class="row">    
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <% ArrayList<ReporteDos> listaReporte2 = (ArrayList<ReporteDos>) session.getAttribute("reporte2");%>
                        <table class="table">
                            <tr>
                                <th>Codigo</th>
                                <th>Titulo de la Carla</th> 
                                <th>Nombre Del Orador</th>
                                <th>Exceso de Tiempo</th>
                            </tr>
                            <% for (ReporteDos lista : listaReporte2) {%>                            
                            <tr>
                                <td>
                                    <%= lista.getCodigo()%>
                                </td>
                                <td>
                                    <%= lista.getTitulo()%>
                                </td>
                                <td>
                                    <%= lista.getOrador()%>
                                </td>
                                <td>
                                    <%= lista.getExceso()%> Minutos
                                </td>
                            </tr>
                            <% }%>
                        </table>
                    </div>                
                    <div class="col-md-2"></div>
                </div>
            </div>
        </section>

        <hr>
        <!--Reporte 3-->     
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-5"></div>                    
                    <div class="col-md-4"> <h1>Reporte 3</h1> </div>
                    <div class="col-md-3"></div>
                </div>
                <div class="row" >   
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <p>Listado de charlas de mayor convocatoria. Se debe mostrar tıtulo de la charla y nombre del orador de aquellas charlas que superaron el promedio de asistentes. </p>
                        <br>
                    </div>
                    <div class="col-md-2"></div>
                </div>
                <div class="row">    
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <% ArrayList<Charla> listaReporte3 = (ArrayList<Charla>) session.getAttribute("reporte3");%>
                        <table class="table table-striped  table-hover">
                            <tr>
                                <th>Nombre Del Orador</th>
                                <th>Titulo de la Carla</th>   
                                <th>Cantidad de Asistentes</th>   
                            </tr>
                            <% for (Charla lista : listaReporte3) {%>                            
                            <tr>
                                <td>
                                    <%= lista.getOrador()%>
                                </td>
                                <td>
                                    <%= lista.getTitulo()%>
                                </td>
                                <td>
                                    <%= lista.getCantAsistentes()%>
                                </td>
                            </tr>
                            <% }%>
                        </table>
                    </div>                
                    <div class="col-md-2"></div>
                </div>
            </div>
        </section>
        <hr>
        <!-- reporte 4-->
        <section class="success">
            <div class="container">
                <div class="row">
                    <div class="col-md-5"></div>                    
                    <div class="col-md-4"> <h1>Reporte 4</h1> </div>
                    <div class="col-md-3"></div>

                </div>
                <div class="row" >   
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <p> Listado de todas las tematicas, incluyendo por cada una la cantidad de charlas correspondientes a la misma, y el promedio de duracion real de estas, y la suma total de asistentes entre todas las charlas.
                        </p>
                        <br>
                    </div>
                    <div class="col-md-2"></div>
                </div>
                <div class="row">    
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <% ArrayList<ReporteCuatro> listaReporte4 = (ArrayList<ReporteCuatro>) session.getAttribute("reporte4");%>
                        <table class="table ">
                            <tr>
                                <th>Temática</th>
                                <th>Cantidad de Charlas</th>   
                                <th>Cantidad de Asistentes</th>
                                <th>Tiempo Promedio</th>
                            </tr>
                            <% for (ReporteCuatro lista : listaReporte4) {%>                            
                            <tr>
                                <td >
                                    <%= lista.getTematica()%>
                                </td>
                                <td style="text-align: center">
                                    <%= lista.getCantCharlas()%>
                                </td>
                                <td style="text-align: center">
                                    <%= lista.getCantAsistentes()%>
                                </td>
                                <td style="text-align: center">
                                    <%= lista.getTiempoPromedio()%> Minutos
                                </td>

                            </tr>
                            <% }%>
                        </table>
                    </div>                
                    <div class="col-md-2"></div>
                </div>
            </div>
        </section>          

        <hr>
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-5"></div>                    
                    <div class="col-md-4"> <h1>Reporte 5</h1> </div>
                    <div class="col-md-3"></div>

                </div>
                <div class="row" >   
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <p> Nombre del orador mas cumplidor con el horario. Debe mostrarse el nombre
                            del orador, la duracion estimada y la duracion real de la charla en la que
                            ambas duraciones esten mas cerca una de otra. Es decir, la que presente
                            menor diferencia entre ambas.
                        </p>

                        <br>
                    </div>
                    <div class="col-md-2"></div>
                </div>
                <div class="row">    
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <% Charla charla = (Charla) session.getAttribute("reporte5");%>
                        <table class="table table-striped  table-hover">
                            <tr>
                                <th>Orador</th>
                                <th>Duracion estimada </th>   
                                <th>Duracion real </th>                                
                            </tr>                                                      
                            <tr>
                                <td>
                                    <%= charla.getOrador()%>
                                </td>
                                <td>
                                    <%= charla.getHoraIni()%> Minutos
                                </td>
                                <td>
                                    <%= charla.getHoraFin()%> Minutos
                                </td>                              
                            </tr>                           
                        </table>
                    </div>                
                    <div class="col-md-2"></div>
                </div>
            </div>
        </section>          

        <!-- Footer -->
        <footer class="text-center">
            <div class="footer-above">
                <div class="container">
                    <div class="row">
                        <div class="footer-col col-md-4">
                            <h3>Ubicacion</h3>
                            <p>Maestro M. Lopez esq. Cruz Roja Argentina<br>Ciudad Universitaria - Córdoba Capital</p>
                        </div>
                        <div class="footer-col col-md-4">

                        </div>
                        <div class="footer-col col-md-4">
                            <h3>Sobre los Creadores</h3>
                            <p>Esta pagina fue creada por <a >Cassettai, Chanquia y Miloro</a>.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer-below">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            Copyright &copy;
                        </div>
                    </div>
                </div>
            </div>
        </footer>

        <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
        <div class="scroll-top page-scroll visible-xs visible-sm">
            <a class="btn btn-primary" href="#page-top">
                <i class="fa fa-chevron-up"></i>
            </a>
        </div>

        <!-- Portfolio Modals -->  


        <!-- jQuery -->
        <script src="JavaScript/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="JavaScript/bootstrap.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
        <script src="JavaScript/classie.js"></script>
        <script src="JavaScript/cbpAnimatedHeader.js"></script>

        <!-- Contact Form JavaScript -->
        <script src="JavaScript/jqBootstrapValidation.js"></script>
        <script src="JavaScript/contact_me.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="JavaScript/freelancer.js"></script>
        <%} catch (Exception e) {
                response.sendRedirect("error.jsp");
            }%>
    </body>


<%-- 
    Document   : RegistrarCharlaFin
    Created on : 09-nov-2015, 23:45:21
    Author     : Home
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Charla"%>
<%@page import="Modelo.Charla"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Inicio</title>

        <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
        <link href="CSS/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="CSS/freelancer.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <script src="SweetAlert/dist/sweetalert.min.js"></script> <link rel="stylesheet" type="text/css" href="SweetAlert/dist/sweetalert.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <style>
            form{
                width:30%;
                margin-top:30px;
                margin-left:35%;
            }
            h1{
                margin-left:40%;
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

        <section >    
            <h1>Charla Finalizada</h1>
            <form method="post" action="ActualizarCharlaServlet" onsubmit="return Validacion()">
                <% ArrayList<Charla> listaCharla = (ArrayList<Charla>) session.getAttribute("Charlas");%>
                <div class="form-group">
                    <label >Charlas : </label>
                    <select  name="charla" id="charla" class="form-control">
                        <% for (Charla listaC : listaCharla) {%>        
                        <% if (listaC.isEstado()) {%>
                        <option value="<%=listaC.getCodigo()%>"><%=listaC.getTitulo()%></option>
                        <%}
                            }%>
                    </select>  
                </div>            
                <div class="form-group">
                    <label>Hora de finalizacion :</label>
                    <input type="text" class="form-control" name="hFin" id="hFin" placeholder="Hora de finalizacion">
                </div>   
                <div class="form-group">
                    <label>Cantidad de Asistentes :</label>
                    <input type="text" class="form-control bfh-number" name="asistentes" id="asistentes" placeholder="Cantidad de personas que asistieron a la charla">
                </div> 
                <input style="margin-left: 40%;" type="submit" class="btn btn-default" value="Aceptar">
            </form>
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


        <!-- Custom Theme JavaScript -->
        <script src="JavaScript/freelancer.js"></script>
        <script>
                function Validacion() {
                    var asistentes = document.getElementById("asistentes").value;
                    var horaF = document.getElementById("hFin").value;


                    if (horaF === null || horaF.length === 0 || horaF === " ") {
                        swal({title: "Error faltan campos!", text: "Debe ingresar la hora de Fin de la charla", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }
                    if (asistentes === null || asistentes.length === 0 || asistentes === " ") {
                        swal({title: "Error faltan campos!", text: "Debe ingresar la cantidad de asistentes de la charla", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }

                    if (!ValidacionHora(horaF))
                        return false;

                    if (isNaN(asistentes)) {
                        swal({title: "Error!", text: "El valor ingresado debe ser un numero entero", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }
                    if (!(asistentes % 1 === 0)) {
                        swal({title: "Error!", text: "El numero ingresado debe ser un numero entero", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }

                    return true;
                }

                function ValidacionHora(h) {
                    hora = h;

                    if (hora.length > 5) {
                        swal({title: "Error en el campo hora!", text: "Introdujo una cadena mayor a 5 caracteres\n Debe ingresar un formato HH:MM \n Por ejemplo 20:30", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }
                    if (hora.length !== 5) {
                        swal({title: "Error en el campo hora!", text: "Introdujo un formato incorrecto\n Debe ingresar un formato HH:MM \n Por ejemplo 20:30", type: "error", confirmButtonText: "Cool"});
                        ;
                        return false;
                    }
                    a = hora.charAt(0);
                    b = hora.charAt(1);
                    c = hora.charAt(2);
                    d = hora.charAt(3);
                    e = hora.charAt(4);

                    if ((a === 2 && b > 3) || (a > 2)) {
                        swal({title: "Error en el campo hora!", text: "El valor que introdujo en la Hora no corresponde, introduzca un digito entre 00 y 23", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }
                    if (d > 5) {
                        swal({title: "Error en el campo hora!", text: "El valor que introdujo en los minutos no corresponde, introduzca un digito entre 00 y 59", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }
                    if (c !== ':') {
                        swal({title: "Error en el campo hora!", text: "Introduzca el caracter '  :  ' para separar la hora y los minutos\n Por ejemplo 20:30", type: "error", confirmButtonText: "Cool"});
                        return false;
                    }
                    return true;
                }


        </script>



    </body>

</html>

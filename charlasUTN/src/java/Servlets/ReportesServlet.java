/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.ControladorConexion;
import Modelo.Charla;
import Modelo.ReporteCuatro;
import Modelo.ReporteDos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class ReportesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try{
            if (request.getSession().getAttribute("Usuario") != null) {
                ControladorConexion cc = new ControladorConexion();
                ArrayList<Charla> listaReporte1 = cc.obtenerReporte1();
                ArrayList<ReporteDos> listaReporte2 = cc.obtenerReporte2();
                ArrayList<Charla> listaReporte3 = cc.obtenerReporte3();
                ArrayList<ReporteCuatro> listaReporte4 = cc.obtenerReporte4();
                Charla c = cc.obtenerReporte5();

                request.getSession().setAttribute("reporte1", listaReporte1);
                request.getSession().setAttribute("reporte2", listaReporte2);
                request.getSession().setAttribute("reporte3", listaReporte3);
                request.getSession().setAttribute("reporte4", listaReporte4);
                request.getSession().setAttribute("reporte5", c);
                
                response.sendRedirect("Reportes.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
            }catch(Exception e){
                response.sendRedirect("error.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

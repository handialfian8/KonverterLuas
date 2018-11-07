/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.session.KonverterLuas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Handi
 */
public class konverterServlet extends HttpServlet {

    @EJB
    private KonverterLuas konverterLuas;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {            
            out.println("<html>");
            out.println("<body");
            out.println("<h1><center>Tugas RSBK Konverter Satuan Luas</center></h1>");
            String luas = request.getParameter("luas");
            
            if ((luas != null) && (luas.length() > 0)) {
                double d = Double.parseDouble(luas);
                if (request.getParameter("Mpersegi ke ARE") != null){
                    String MAre = konverterLuas.meterpersegi_are(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+MAre+"</p>");
                }
                if (request.getParameter("Mpersegi ke Hektare") != null){
                    String MHek = konverterLuas.meterpersegi_hektare(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+MHek+"</p>");
                }
                if (request.getParameter("Mpersegi ke KMpersegi") != null){
                    String MKm = konverterLuas.meterpersegi_kmpersegi(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+MKm+"</p>");
                }
                if (request.getParameter("ARE ke Mpersegi") != null){
                    String AreM = konverterLuas.are_meterpersegi(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+AreM+"</p>");
                }
                if (request.getParameter("ARE ke HEKTARE") != null){
                    String AreH = konverterLuas.are_hektare(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+AreH+"</p>");
                }
                if (request.getParameter("ARE ke KMpersegi") != null){
                    String AreK = konverterLuas.are_kmpersegi(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+AreK+"</p>");
                }
                if (request.getParameter("HEKTARE ke Mpersegi") != null){
                    String AreK = konverterLuas.hektare_meterpersegi(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+AreK+"</p>");
                }
                if (request.getParameter("HEKTARE ke ARE") != null){
                    String HAre = konverterLuas.hektare_are(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+HAre+"</p>");
                }
                if (request.getParameter("HEKTARE ke KMpersegi") != null){
                    String HKm = konverterLuas.hektare_kmpersegi(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+HKm+"</p>");
                }
                if (request.getParameter("KMpersegi ke Mpersegi") != null){
                    String KmM = konverterLuas.kmpersegi_meterpersegi(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+KmM+"</p>");
                }
                if (request.getParameter("KMpersegi ke ARE") != null){
                    String KmAre = konverterLuas.kmpersegi_are(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+KmAre+"</p>");
                }
                if (request.getParameter("KMpersegi ke HEKTARE") != null){
                    String KmH = konverterLuas.kmpersegi_hektare(d);
                    out.println("<p> HASIL KONVERSI SATUAN LUAS: "+KmH+"</p>");
                }
                
            } else {
                out.println("<center>");
                out.println("<p>Masukan Bilangan:</p>");
                out.println("<form method=\"get\">");
                out.println("<p><input type=\"text\" name=\"luas\" size=\"20\"></p>");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"Mpersegi ke ARE\" value=\"Mpersegi ke ARE\">"+ "<input type=\"submit\" name=\"Mpersegi ke Hektare\" value=\"Mpersegi ke Hektare\">"+ "<input type=\"submit\" name=\"Mpersegi ke KMpersegi\" value=\"Mpersegi ke KMpersegi\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"ARE ke Mpersegi\" value=\"ARE ke Mpersegi\">"+ "<input type=\"submit\" name=\"ARE ke HEKTARE\" value=\"ARE ke HEKTARE\">"+ "<input type=\"submit\" name=\"ARE ke KMpersegi\" value=\"ARE ke KMpersegi\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"HEKTARE ke Mpersegi\" value=\"HEKTARE ke Mpersegi\">"+ "<input type=\"submit\" name=\"HEKTARE ke ARE\" value=\"HEKTARE ke ARE\">"+ "<input type=\"submit\" name=\"HEKTARE ke KMpersegi\" value=\"HEKTARE ke KMpersegi\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"KMpersegi ke Mpersegi\" value=\"KMpersegi ke Mpersegi\">"+ "<input type=\"submit\" name=\"KMpersegi ke ARE\" value=\"KMpersegi ke ARE\">"+ "<input type=\"submit\" name=\"KMpersegi ke HEKTARE\" value=\"KMpersegi ke HEKTARE\">");
                out.println("<br/>");
   
                out.println("</center>");
                out.println("</form>");
            }
        
        } finally {
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.close();
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

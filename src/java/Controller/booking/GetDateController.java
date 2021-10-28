/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.booking;

import Model.Film;
import dal.FilmDBContext;
import dal.Time_Room_FilmDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class GetDateController extends HttpServlet {

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
        String id = request.getParameter("id");
        
        Time_Room_FilmDBContext trfdbc = new Time_Room_FilmDBContext();
        ArrayList<Date> dates = trfdbc.getDate(id);
        
        FilmDBContext fdbc = new FilmDBContext();
        Film film = fdbc.getFilmByID(id);
        
        request.setAttribute("film", film);        
        request.setAttribute("dates", dates);
        request.getRequestDispatcher("View/Booking/getDate.jsp").forward(request, response);
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
        String id = request.getParameter("id");
        String date = request.getParameter("selectDate");
        
        Time_Room_FilmDBContext trfdbc = new Time_Room_FilmDBContext();
        ArrayList<String> slots = trfdbc.getTime(id, date);
        
        FilmDBContext fdbc = new FilmDBContext();
        Film film = fdbc.getFilmByID(id);
        
        request.setAttribute("film", film);
        request.setAttribute("selectedDate", date);
        request.setAttribute("slots", slots);
        request.getRequestDispatcher("View/Booking/getTime.jsp").forward(request, response);
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

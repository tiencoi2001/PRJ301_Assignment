/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.booking;

import Controller.auth.BaseRequiredAuthController;
import Model.Film;
import dal.FilmDBContext;
import dal.ScheduleDBContext;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class GetTimeController extends BaseRequiredAuthController {

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
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String id = request.getParameter("id");
//        String date = request.getParameter("date");
//        String slot = request.getParameter("slot");
//
//        request.setAttribute("filmID", id);
//        request.setAttribute("dateSelected", date);
//        request.setAttribute("slotSelected", slot);
//        request.getRequestDispatcher("getchair").forward(request, response);

        String id = request.getParameter("id");
        String date = request.getParameter("selectDate");

        ScheduleDBContext sdbc = new ScheduleDBContext();
        ArrayList<String> slots = sdbc.getTime(id, date);

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

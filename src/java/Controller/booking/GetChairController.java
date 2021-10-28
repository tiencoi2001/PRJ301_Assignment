/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.booking;

import Model.Chair;
import Model.Film;
import Model.Time_Room_Film;
import dal.ChairDBContext;
import dal.FilmDBContext;
import dal.Time_Room_FilmDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class GetChairController extends HttpServlet {

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
        String id = (String) request.getAttribute("filmID");
        String date = (String) request.getAttribute("dateSelected");
        String slot = (String) request.getAttribute("slotSelected");

        Time_Room_FilmDBContext trfdbc = new Time_Room_FilmDBContext();
        Time_Room_Film trf = trfdbc.getTime_Room_Film(id, date, slot);
        String roomID = trfdbc.getRoomID(id, date, slot);

        FilmDBContext fdbc = new FilmDBContext();
        Film film = fdbc.getFilmByID(id);
        
        ChairDBContext cdbc = new ChairDBContext();
        ArrayList<Chair> chairs = cdbc.getChairByRoomID(roomID, slot, date);

        request.setAttribute("film", film);
        request.setAttribute("trf", trf);
        request.setAttribute("chairs", chairs);
        request.getRequestDispatcher("View/Booking/getChair.jsp").forward(request, response);
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
//        String id = (String) request.getAttribute("filmID");
//        String date = (String) request.getAttribute("dateSelected");
//        String slot = (String) request.getAttribute("slotSelected");
//
//        Time_Room_FilmDBContext trfdbc = new Time_Room_FilmDBContext();
//        Time_Room_Film trf = trfdbc.getTime_Room_Film(id, date, slot);
//
//        FilmDBContext fdbc = new FilmDBContext();
//        Film film = fdbc.getFilmByID(id);
//
//        request.setAttribute("film", film);
//        request.setAttribute("trf", trf);
        request.getRequestDispatcher("View/Booking/getChair.jsp").forward(request, response);
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

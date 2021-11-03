/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.booking;

import Model.Ticket;
import Model.User;
import dal.OrderChairDBContext;
import dal.TicketDBContext;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vu Duc Tien
 */
public class FinishBookingController extends HttpServlet {

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
        String filmID = request.getParameter("filmID");
        String roomID = request.getParameter("roomID");
        String timeID = request.getParameter("timeID");
        String date = request.getParameter("date");
        String chairID = request.getParameter("chairID");
        String type = request.getParameter("type");
        String price = request.getParameter("price");

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        Ticket ticket = new Ticket();
        ticket.setUserID(user.getId());
        ticket.setEmail(user.getEmail());
        ticket.setPhone(user.getPhone());
        ticket.setFilmID(Integer.parseInt(filmID));
        ticket.setTimeID(Integer.parseInt(timeID));
        ticket.setRoomID(Integer.parseInt(roomID));
        ticket.setDate(Date.valueOf(date));
        ticket.setChairID(Integer.parseInt(chairID));
        ticket.setType(Integer.parseInt(type));
        ticket.setPrice(price);

        OrderChairDBContext ocdbc = new OrderChairDBContext();
        ocdbc.insertOrderChair(chairID, timeID, date);

        TicketDBContext tdbc = new TicketDBContext();
        tdbc.insertTicket(ticket);

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

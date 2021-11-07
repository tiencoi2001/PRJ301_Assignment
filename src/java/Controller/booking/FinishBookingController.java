/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.booking;

import Controller.auth.BaseRequiredAuthController;
import Model.Account;
import Model.Schedule;
import Model.Ticket;
import Model.User;
import dal.ScheduleDBContext;
import dal.TicketDBContext;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vu Duc Tien
 */
public class FinishBookingController extends BaseRequiredAuthController {

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
        String filmID = request.getParameter("filmID");
        String roomID = request.getParameter("roomID");
        String timeID = request.getParameter("timeID");
        String date = request.getParameter("date");
        String chairID = request.getParameter("chairID");

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Account account = (Account) session.getAttribute("account");
        
        ScheduleDBContext sdbc = new ScheduleDBContext();
        Schedule s = sdbc.getScheduleByAttributeID(filmID, roomID, timeID, date);
        

        Ticket ticket = new Ticket();
        ticket.setUserID(user.getId());
        ticket.setScheduleID(s.getScheduleID());
        ticket.setChairID(Integer.parseInt(chairID));

        TicketDBContext tdbc = new TicketDBContext();
        tdbc.insertTicket(ticket);
        
        request.getRequestDispatcher("View/Booking/thanks.jsp").forward(request, response);

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

package Controller.booking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controller.auth.BaseRequiredAuthController;
import Model.Chair;
import Model.Film;
import Model.Time_Room_Film;
import dal.ChairDBContext;
import dal.FilmDBContext;
import dal.Time_Room_FilmDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class PaymentController extends BaseRequiredAuthController {

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
        String id = request.getParameter("id");
        String date = request.getParameter("date");
        String slot = request.getParameter("slot");
        String chairID = request.getParameter("chairID");

        Time_Room_FilmDBContext trfdbc = new Time_Room_FilmDBContext();
        Time_Room_Film trf = trfdbc.getTime_Room_Film(id, date, slot);
        String roomID = trfdbc.getRoomID(id, date, slot);

        FilmDBContext fdbc = new FilmDBContext();
        Film film = fdbc.getFilmByID(id);

        ChairDBContext cdbc = new ChairDBContext();
        Chair chair = cdbc.getChair(chairID);

        request.setAttribute("id", id);
        request.setAttribute("date", date);
        request.setAttribute("slot", slot);
        request.setAttribute("film", film);
        request.setAttribute("trf", trf);
        request.setAttribute("chair", chair);
        request.getRequestDispatcher("View/Booking/payment.jsp").forward(request, response);
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

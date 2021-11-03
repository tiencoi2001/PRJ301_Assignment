/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.user;

import Controller.auth.BaseRequiredAuthController;
import Model.Account;
import dal.AccountDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vu Duc Tien
 */
public class RemoveAdminRightsController extends BaseRequiredAuthController {

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
        HttpSession session = request.getSession();
        Account acc = (Account) session.getAttribute("account");
        String email = acc.getEmail();

        AccountDBContext adbc = new AccountDBContext();
        ArrayList<Account> accounts = adbc.getListIsAdmin(email);

        if (accounts.isEmpty()) {
            request.setAttribute("isNull", true);
            request.getRequestDispatcher("View/User/giveAdminRights.jsp").forward(request, response);
        } else {
            request.setAttribute("canUpdate", true);
            request.setAttribute("accounts", accounts);
            request.getRequestDispatcher("View/User/removeAdminRights.jsp").forward(request, response);
        }
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
        String email_phone = request.getParameter("email_phone");

        if (email_phone.isEmpty()) {
            request.setAttribute("isNull", true);
            request.getRequestDispatcher("View/User/removeAdminRights.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            Account acc = (Account) session.getAttribute("account");
            String email = acc.getEmail();

            AccountDBContext adbc = new AccountDBContext();
            adbc.updateAdminRights(email_phone, false);
            ArrayList<Account> accounts = adbc.getListIsAdmin(email);

            if (accounts.isEmpty()) {
                request.setAttribute("canUpdate", false);
                request.setAttribute("isUpdate", true);
                request.getRequestDispatcher("View/User/removeAdminRights.jsp").forward(request, response);
            } else {
                request.setAttribute("accounts", accounts);
                request.setAttribute("canUpdate", true);
                request.setAttribute("isUpdate", true);
                request.getRequestDispatcher("View/User/removeAdminRights.jsp").forward(request, response);
            }
        }
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

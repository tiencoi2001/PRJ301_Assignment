/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.user;

import Controller.auth.BaseRequiredAuthController;
import Model.Account;
import Model.User;
import dal.AccountDBContext;
import dal.UserDBContext;
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
public class AccountDetailController extends BaseRequiredAuthController {

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
        request.getRequestDispatcher("View/User/accountDetail.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        boolean gd = gender.equalsIgnoreCase("male");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String pass = request.getParameter("password");
        String dateOfBirth = request.getParameter("dob");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setGender(gd);
        user.setAddress(address);
        user.setDob(Date.valueOf(dateOfBirth));

        Account account = new Account();
        account.setEmail(email);
        account.setPhone(phone);
        account.setPass(pass);
        account.setRole(false);

        UserDBContext udbc = new UserDBContext();
        AccountDBContext adbc = new AccountDBContext();
        udbc.updateUser(user);
        adbc.updateAccount(account);

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        request.getRequestDispatcher("View/User/accountDetail.jsp").forward(request, response);
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

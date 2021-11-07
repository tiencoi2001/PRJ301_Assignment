/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.auth;

import Model.Account;
import Model.User;
import dal.AccountDBContext;
import dal.UserDBContext;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class RegisterController extends HttpServlet {

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
        Boolean isSuccess;
        try {
            isSuccess = Boolean.parseBoolean(request.getParameter("isFail"));
        } catch (Exception e) {
        }
        request.getRequestDispatcher("View/auth/register.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        String phone = request.getParameter("register_phone");
        String email = request.getParameter("register_email");
        
        User user = new User();
        user.setName(request.getParameter("register_fullname"));
        user.setEmail(email);
        user.setDob(Date.valueOf(request.getParameter("register_dob")));
        user.setGender(request.getParameter("register_gender").equalsIgnoreCase("Male"));
        user.setAddress(request.getParameter("register_address"));
        
        Account account = new Account();
        account.setPhone(phone);
        account.setEmail(email);
        account.setPass(request.getParameter("register_password"));
        account.setRole(false);
        
        AccountDBContext adbc = new AccountDBContext();
        UserDBContext udbc = new UserDBContext();
        if(adbc.isExistAccount(phone, email)){
            request.setAttribute("isFail", true);
            request.getRequestDispatcher("View/auth/register.jsp").forward(request, response);
        }else{
            adbc.insertUser(account);
            udbc.insertUser(user);
            response.sendRedirect("home");
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

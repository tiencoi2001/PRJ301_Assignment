/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.user;

import Controller.auth.BaseRequiredAuthController;
import Model.User;
import dal.UserDBContext;
import java.io.IOException;
import java.io.PrintWriter;
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
        Boolean isUpdate;
        try {
            isUpdate = Boolean.parseBoolean(request.getParameter("isUpdate"));
        } catch (Exception e) {
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        request.setAttribute("accountDetail", user);
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
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPhone(request.getParameter("oldphone"));
        user.setEmail(request.getParameter("oldemail"));
        user.setPass(request.getParameter("password"));
        user.setGender(request.getParameter("gender").equalsIgnoreCase("Male"));
        user.setAddress(request.getParameter("address"));
        
        UserDBContext udbc = new UserDBContext();
        udbc.updateUsers(user);
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

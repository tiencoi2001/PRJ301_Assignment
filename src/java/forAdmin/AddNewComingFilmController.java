/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forAdmin;

import Controller.auth.BaseRequiredAuthController;
import Model.Film;
import dal.FilmDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class AddNewComingFilmController extends BaseRequiredAuthController {

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
        request.getRequestDispatcher("View/ForAdmin/addNewComingFilm.jsp").forward(request, response);
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
        Film f = new Film();
        f.setName(request.getParameter("name"));
        f.setDirector(request.getParameter("director"));
        f.setStarName(request.getParameter("cast"));
        f.setGenre(request.getParameter("genre"));
        f.setLanguage(request.getParameter("language"));
        f.setDetail(request.getParameter("detail"));
        f.setShowing(false);
        f.setImage(request.getParameter("image"));
        
        FilmDBContext fdbc = new FilmDBContext();
        fdbc.insertFilm(f);
        
        request.setAttribute("isUpdate", true);
        request.getRequestDispatcher("View/ForAdmin/addNewComingFilm.jsp").forward(request, response);
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

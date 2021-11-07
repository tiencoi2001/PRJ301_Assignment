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
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vu Duc Tien
 */
public class UpdateNewShowingFilmController extends BaseRequiredAuthController {

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
        FilmDBContext fdbc = new FilmDBContext();
        List<Film> films = fdbc.getFilmToComing();
        
        if(films.isEmpty()){
            request.setAttribute("isNull", true);
            request.getRequestDispatcher("View/ForAdmin/updateNewShowingFilm.jsp").forward(request, response);
        }else{
            request.setAttribute("canUpdate", true);
            request.setAttribute("films", films);
        request.getRequestDispatcher("View/ForAdmin/updateNewShowingFilm.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        String rated = request.getParameter("rated");
        String note = null;
        if (rated.equalsIgnoreCase("P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG")) {
            note = "P";
        } else if (rated.equalsIgnoreCase("C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI")) {
            note = "C13";
        } else if (rated.equalsIgnoreCase("C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI")) {
            note = "C16";
        } else if (rated.equalsIgnoreCase("C18 - PHIM CẤM KHÁN GIẢ DƯỚI 18 TUỔI")) {
            note = "C18";
        }

        Film f = new Film();
        f.setId(Integer.parseInt(request.getParameter("filmID")));
        f.setPremiere(Date.valueOf(request.getParameter("premiere")));
        f.setLength(Integer.parseInt(request.getParameter("length")));
        f.setNote(note);
        f.setRated(rated);
        
        FilmDBContext fdbc = new FilmDBContext();
        fdbc.updateNewShowingFilm(f);
        List<Film> films = fdbc.getFilmToComing();
        
        if (films.isEmpty()) {
            request.setAttribute("canUpdate", false);
            request.setAttribute("isUpdate", true);
            request.getRequestDispatcher("View/ForAdmin/updateNewShowingFilm.jsp").forward(request, response);
        } else {
            request.setAttribute("films", films);
            request.setAttribute("canUpdate", true);
            request.setAttribute("isUpdate", true);
            request.getRequestDispatcher("View/ForAdmin/updateNewShowingFilm.jsp").forward(request, response);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.Film;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Duc Tien
 */
public class FilmDBContext extends DBContext {

    public List<Film> getFilm(boolean showing) {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "SELECT [ID],[Name],[Director],[StarName],[Genre],"
                    + "[Premiere],[Length],[Language],[Rated],[Note],[Detail],[Showing],[Image]\n"
                    + "FROM [Films]"
                    + "WHERE Showing = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setBoolean(1, showing);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film film = new Film();
                film.setId(rs.getInt("ID"));
                film.setName(rs.getString("Name"));
                film.setDirector(rs.getString("Director"));
                film.setStarName(rs.getString("StarName"));
                film.setGenre(rs.getString("Genre"));
                film.setPremiere(rs.getString("Premiere"));
                film.setLength(rs.getInt("Length"));
                film.setLanguage(rs.getString("Language"));
                film.setRated(rs.getString("Rated"));
                film.setNote(rs.getString("Note"));
                film.setDetail(rs.getString("Detail"));
                film.setShowing(showing);
                film.setImage(rs.getString("Image"));
                films.add(film);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
    }

    public Film getFilmByID(int id) {
        try {
            String sql = "SELECT [ID],[Name],[Director],[StarName],[Genre],"
                    + "[Premiere],[Length],[Language],[Rated],[Note],[Detail],[Showing],[Image]\n"
                    + "FROM [Films]\n"
                    + "WHERE ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Film film = new Film();
                film.setId(id);
                film.setName(rs.getString("Name"));
                film.setDirector(rs.getString("Director"));
                film.setStarName(rs.getString("StarName"));
                film.setGenre(rs.getString("Genre"));
                film.setPremiere(rs.getString("Premiere"));
                film.setLength(rs.getInt("Length"));
                film.setLanguage(rs.getString("Language"));
                film.setRated(rs.getString("Rated"));
                film.setNote(rs.getString("Note"));
                film.setDetail(rs.getString("Detail"));
                film.setShowing(rs.getBoolean("Showing"));
                film.setImage(rs.getString("Image"));
                return film;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        FilmDBContext fdbc = new FilmDBContext();
//        Film film = fdbc.getFilmByID(1);
//        if (film == null) {
//            System.out.println("null");
//        } else {
//            System.out.println(film.getName());
//        }
        List<Film> films = fdbc.getFilm(true);
        for (Film film : films) {
            System.out.println(film);
        }
    }
}

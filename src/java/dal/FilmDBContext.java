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

    public List<Film> getFilmToShowing() {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "SELECT [ID],[Name],[Director],[StarName],[Genre],"
                    + "[Premiere],[Length],[Language],[Rated],[Note],[Detail],[Showing],[Image]\n"
                    + "FROM [Films]\n"
                    + "WHERE Showing = 1\n"
                    + "ORDER BY [ID] DESC";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film film = new Film();
                film.setId(rs.getInt("ID"));
                film.setName(rs.getString("Name"));
                film.setDirector(rs.getString("Director"));
                film.setStarName(rs.getString("StarName"));
                film.setGenre(rs.getString("Genre"));
                film.setPremiere(rs.getDate("Premiere"));
                film.setLength(rs.getInt("Length"));
                film.setLanguage(rs.getString("Language"));
                film.setRated(rs.getString("Rated"));
                film.setNote(rs.getString("Note"));
                film.setDetail(rs.getString("Detail"));
                film.setShowing(true);
                film.setImage(rs.getString("Image"));
                films.add(film);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
    }

    public List<Film> getFilmToComing() {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "SELECT [ID],[Name],[Director],[StarName],[Genre],"
                    + "[Premiere],[Length],[Language],[Rated],[Note],[Detail],[Showing],[Image]\n"
                    + "FROM [Films]\n"
                    + "WHERE Showing = 0\n";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film film = new Film();
                film.setId(rs.getInt("ID"));
                film.setName(rs.getString("Name"));
                film.setDirector(rs.getString("Director"));
                film.setStarName(rs.getString("StarName"));
                film.setGenre(rs.getString("Genre"));
                film.setPremiere(rs.getDate("Premiere"));
                film.setLength(rs.getInt("Length"));
                film.setLanguage(rs.getString("Language"));
                film.setRated(rs.getString("Rated"));
                film.setNote(rs.getString("Note"));
                film.setDetail(rs.getString("Detail"));
                film.setShowing(false);
                film.setImage(rs.getString("Image"));
                films.add(film);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
    }

    public Film getFilmByID(String id) {
        try {
            String sql = "SELECT [ID],[Name],[Director],[StarName],[Genre],"
                    + "[Premiere],[Length],[Language],[Rated],[Note],[Detail],[Showing],[Image]\n"
                    + "FROM [Films]\n"
                    + "WHERE ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Film film = new Film();
                film.setId(rs.getInt("ID"));
                film.setName(rs.getString("Name"));
                film.setDirector(rs.getString("Director"));
                film.setStarName(rs.getString("StarName"));
                film.setGenre(rs.getString("Genre"));
                film.setPremiere(rs.getDate("Premiere"));
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

    public void updateNewShowingFilm(Film film) {
        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE [Films]\n"
                    + "   SET [Premiere] = ?\n"
                    + "      ,[Length] = ?\n"
                    + "      ,[Rated] = ?\n"
                    + "      ,[Note] = ?\n"
                    + "      ,[Showing] = ?\n"
                    + " WHERE [ID] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, film.getPremiere());
            stm.setInt(2, film.getLength());
            stm.setString(3, film.getRated());
            stm.setString(4, film.getNote());
            stm.setBoolean(5, true);
            stm.setInt(6, film.getId());
            stm.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void insertFilm(Film f) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [Films]([Name],[Director],[StarName],[Genre],[Language],[Detail],[Showing],[Image])\n"
                    + "     VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, f.getName());
            stm.setString(2, f.getDirector());
            stm.setString(3, f.getStarName());
            stm.setString(4, f.getGenre());
            stm.setString(5, f.getLanguage());
            stm.setString(6, f.getDetail());
            stm.setBoolean(7, f.isShowing());
            stm.setString(8, f.getImage());
            stm.execute();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        FilmDBContext fdbc = new FilmDBContext();
//        Film film = fdbc.getFilmByID(1);
//        if (film == null) {
//            System.out.println("null");
//        } else {
//            System.out.println(film.getName());
//        }
        List<Film> films = fdbc.getFilmToComing();
        for (Film film : films) {
            System.out.println(film.getName());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.Time_Room_Film;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Duc Tien
 */
public class Time_Room_FilmDBContext extends DBContext {

    public Time_Room_Film getTime_Room_Film(String filmID, String date, String slot) {
        try {
            String sql = "SELECT t.[TimeID], [Slot], r.[RoomID] ,r.[Name] AS roomName, f.[ID] AS filmID, f.[Name] AS filmName, [Date]\n"
                    + "  FROM [Time_Room_Film] trf\n"
                    + "  INNER JOIN Times t ON t.TimeID = trf.TimeID\n"
                    + "  INNER JOIN Rooms r ON r.RoomID = trf.RoomID\n"
                    + "  INNER JOIN Films f ON f.ID = trf.FilmID\n"
                    + "  WHERE [FilmID] = ? AND [Date] = ? AND [Slot] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, filmID);
            stm.setString(2, date);
            stm.setString(3, slot);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Time_Room_Film trf = new Time_Room_Film();
                trf.setTimeID(rs.getInt("TimeID"));
                trf.setSlot(rs.getString("Slot"));
                trf.setRoomID(rs.getInt("RoomID"));
                trf.setRoomName(rs.getString("roomName"));
                trf.setFilmID(rs.getInt("filmID"));
                trf.setFilmName(rs.getString("filmName"));
                trf.setDate(rs.getDate("date"));
                return trf;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Time_Room_FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getRoomID(String filmID, String date, String slot) {
        try {
            String sql = "SELECT r.[RoomID]\n"
                    + "  FROM [Time_Room_Film] trf\n"
                    + "  INNER JOIN Times t ON t.TimeID = trf.TimeID\n"
                    + "  INNER JOIN Rooms r ON r.RoomID = trf.RoomID\n"
                    + "  INNER JOIN Films f ON f.ID = trf.FilmID\n"
                    + "  WHERE [FilmID] = ? AND [Date] = ? AND [Slot] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, filmID);
            stm.setString(2, date);
            stm.setString(3, slot);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getString("RoomID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Time_Room_FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Date> getDate(String filmID) {
        ArrayList<Date> dates = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT [Date]\n"
                    + "  FROM [Time_Room_Film]\n"
                    + "  WHERE [FilmID] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, filmID);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Date d = rs.getDate("Date");
                dates.add(d);
            }
            return dates;
        } catch (SQLException ex) {
            Logger.getLogger(Time_Room_FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<String> getTime(String filmID, String date) {
        ArrayList<String> slots = new ArrayList<>();
        try {
            String sql = "SELECT [Slot]\n"
                    + "  FROM [Time_Room_Film] trf\n"
                    + "  INNER JOIN Times t ON t.TimeID = trf.TimeID\n"
                    + "  WHERE [FilmID] = ? AND [Date] = ?\n"
                    + "  ORDER BY t.[TimeID] ASC";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, filmID);
            stm.setString(2, date);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String s = rs.getString("Slot");
                slots.add(s);
            }
            return slots;
        } catch (SQLException ex) {
            Logger.getLogger(Time_Room_FilmDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws ParseException {
        Time_Room_FilmDBContext trfdbc = new Time_Room_FilmDBContext();
//        ArrayList<Date> dates = trfdbc.getDate(1);
//        for (Date d : dates) {
//            System.out.println(d);
//        }
//        ArrayList<String> slots = trfdbc.getTime(1, "2021-12-13");
//        for (String s : slots) {
//            System.out.println(s);
//        }
        Time_Room_Film trf = trfdbc.getTime_Room_Film("1", "2021-12-13", "7h30 - 9h30");
        System.out.println(trf.getTimeID() + " " + trf.getSlot() + " "
                + trf.getRoomID() + " " + trf.getRoomName() + " "
                + trf.getFilmID() + " " + trf.getFilmName() + " " + trf.getDate());
//        String roomID = trfdbc.getRoomID("1", "2021-12-13", "7h30 - 9h30");
//        System.out.println(roomID);
    }
}

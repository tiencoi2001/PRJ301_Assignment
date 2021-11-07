/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.Schedule;
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
public class ScheduleDBContext extends DBContext {
    
    public Schedule getScheduleByAttributeID(String filmID, String roomID, String timeID, String date){
        try {
            String sql = "SELECT s.ScheduleID,t.[TimeID],[Slot],r.[RoomID],r.[Name] AS roomName,f.[ID] AS filmID,f.[Name] AS filmName,[Date]\n"
                    + "  FROM [Schedules] s\n"
                    + "  INNER JOIN Times t ON t.TimeID = s.TimeID\n"
                    + "  INNER JOIN Rooms r ON r.RoomID = s.RoomID\n"
                    + "  INNER JOIN Films f ON f.ID = s.FilmID\n"
                    + "  WHERE [FilmID] = ? AND s.[roomID] = ? AND s.[timeID] = ? AND [Date] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, filmID);
            stm.setString(2, roomID);
            stm.setString(3, timeID);
            stm.setString(4, date);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Schedule s = new Schedule();
                s.setScheduleID(rs.getInt("ScheduleID"));
                s.setTimeID(rs.getInt("TimeID"));
                s.setSlot(rs.getString("Slot"));
                s.setRoomID(rs.getInt("RoomID"));
                s.setRoomName(rs.getString("roomName"));
                s.setFilmID(rs.getInt("filmID"));
                s.setFilmName(rs.getString("filmName"));
                s.setDate(rs.getDate("date"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Schedule getSchedule(String filmID, String date, String slot) {
        try {
            String sql = "SELECT s.ScheduleID,t.[TimeID],[Slot],r.[RoomID],r.[Name] AS roomName,f.[ID] AS filmID,f.[Name] AS filmName,[Date]\n"
                    + "  FROM [Schedules] s\n"
                    + "  INNER JOIN Times t ON t.TimeID = s.TimeID\n"
                    + "  INNER JOIN Rooms r ON r.RoomID = s.RoomID\n"
                    + "  INNER JOIN Films f ON f.ID = s.FilmID\n"
                    + "  WHERE [FilmID] = ? AND [Date] = ? AND [Slot] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, filmID);
            stm.setString(2, date);
            stm.setString(3, slot);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Schedule s = new Schedule();
                s.setScheduleID(rs.getInt("ScheduleID"));
                s.setTimeID(rs.getInt("TimeID"));
                s.setSlot(rs.getString("Slot"));
                s.setRoomID(rs.getInt("RoomID"));
                s.setRoomName(rs.getString("roomName"));
                s.setFilmID(rs.getInt("filmID"));
                s.setFilmName(rs.getString("filmName"));
                s.setDate(rs.getDate("date"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getRoomID(String filmID, String date, String slot) {
        try {
            String sql = "SELECT r.[RoomID]\n"
                    + "  FROM [Schedules] s\n"
                    + "  INNER JOIN Times t ON t.TimeID = s.TimeID\n"
                    + "  INNER JOIN Rooms r ON r.RoomID = s.RoomID\n"
                    + "  INNER JOIN Films f ON f.ID = s.FilmID\n"
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
            Logger.getLogger(ScheduleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Date> getDate(String filmID) {
        ArrayList<Date> dates = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT [Date]\n"
                    + "  FROM [Schedules]\n"
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
            Logger.getLogger(ScheduleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<String> getTime(String filmID, String date) {
        ArrayList<String> slots = new ArrayList<>();
        try {
            String sql = "SELECT [Slot]\n"
                    + "  FROM [Schedules] s\n"
                    + "  INNER JOIN Times t ON t.TimeID = s.TimeID\n"
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
            Logger.getLogger(ScheduleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws ParseException {
        ScheduleDBContext sdbc = new ScheduleDBContext();
//        ArrayList<Date> dates = trfdbc.getDate(1);
//        for (Date d : dates) {
//            System.out.println(d);
//        }
//        ArrayList<String> slots = trfdbc.getTime(1, "2021-12-13");
//        for (String s : slots) {
//            System.out.println(s);
//        }
//        Schedule trf = trfdbc.getSchedule("1", "2021-12-13", "7h30 - 9h30");
//        System.out.println(trf.getTimeID() + " " + trf.getSlot() + " "
//                + trf.getRoomID() + " " + trf.getRoomName() + " "
//                + trf.getFilmID() + " " + trf.getFilmName() + " " + trf.getDate());
//        String roomID = trfdbc.getRoomID("1", "2021-12-13", "7h30 - 9h30");
//        System.out.println(roomID);

          Schedule s = sdbc.getScheduleByAttributeID("12", "1", "1", "2021-11-08");
          System.out.println(s.getScheduleID());
    }
}

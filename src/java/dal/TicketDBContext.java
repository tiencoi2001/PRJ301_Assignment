/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.Ticket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Duc Tien
 */
public class TicketDBContext extends DBContext {

    public void insertTicket(Ticket ticket) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [Ticket]([UserID],[ScheduleID],[ChairID])\n"
                    + "     VALUES (?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, ticket.getUserID());
            stm.setInt(2, ticket.getScheduleID());
            stm.setInt(3, ticket.getChairID());
            stm.execute();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(TicketDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(TicketDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<Ticket> getTicket(int userID) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        try {
            String sql = "SELECT [TicketID],u.[ID] AS [UserID],tk.[ScheduleID],s.[TimeID],[Slot],s.[RoomID],\n"
                    + "  r.[Name] AS [roomName],s.[FilmID], f.[Name] AS [filmName],f.[Note],\n"
                    + "  s.[Date],tk.[ChairID],c.[ChairName],f.[Image],c.[Type],p.[Price]\n"
                    + "  FROM [Ticket] tk\n"
                    + "  INNER JOIN Users u ON u.ID = tk.UserID\n"
                    + "  INNER JOIN Accounts a ON a.Email = u.Email\n"
                    + "  INNER JOIN Schedules s ON s.[ScheduleID] = tk.[ScheduleID]\n"
                    + "  INNER JOIN Times t ON t.[TimeID] = s.[TimeID]\n"
                    + "  INNER JOIN Rooms r ON r.[RoomID] = s.[RoomID]\n"
                    + "  INNER JOIN Films f ON f.[ID] = s.[FilmID]\n"
                    + "  INNER JOIN Chairs c ON c.[ChairID] = tk.[ChairID]\n"
                    + "  INNER JOIN Price p ON p.[Type] = c.[Type]\n"
                    + "  WHERE u.[ID] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, userID);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ticket t = new Ticket();
                t.setTicketID(rs.getInt("TicketID"));
                t.setUserID(rs.getInt("UserID"));
                t.setScheduleID(rs.getInt("ScheduleID"));
                t.setTimeID(rs.getInt("TimeID"));
                t.setSlot(rs.getString("Slot"));
                t.setRoomID(rs.getInt("RoomID"));
                t.setRoomName(rs.getString("roomName"));
                t.setFilmID(rs.getInt("FilmID"));
                t.setFilmName(rs.getString("filmName"));
                t.setNote(rs.getString("Note"));
                t.setDate(rs.getDate("Date"));
                t.setChairID(rs.getInt("ChairID"));
                t.setChairName(rs.getString("ChairName"));
                t.setImg(rs.getString("Image"));
                t.setType(rs.getInt("Type"));
                t.setPrice(rs.getString("Price"));
                tickets.add(t);
            }
            return tickets;
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        TicketDBContext tkdbc = new TicketDBContext();
        ArrayList<Ticket> tickets = tkdbc.getTicket(1);
        for (Ticket t : tickets) {
            System.out.println(t.getTicketID() + " " + t.getSlot() + " " + t.getRoomName() + " " + t.getFilmName() + " " + t.getNote() + " " + t.getChairName());
        }
    }
}

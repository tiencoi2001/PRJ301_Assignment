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
            String sql = "INSERT INTO [Ticket]\n"
                    + "           ([UserID],[Phone],[Email],[TimeID],[RoomID],[FilmID],[Date],[ChairID],[Type],[Price])\n"
                    + "     VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, ticket.getUserID());
            stm.setString(2, ticket.getPhone());
            stm.setString(3, ticket.getEmail());
            stm.setInt(4, ticket.getTimeID());
            stm.setInt(5, ticket.getRoomID());
            stm.setInt(6, ticket.getFilmID());
            stm.setDate(7, ticket.getDate());
            stm.setInt(8, ticket.getChairID());
            stm.setInt(9, ticket.getType());
            stm.setString(10, ticket.getPrice());
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

    public ArrayList<Ticket> getTicket(String phone, String email) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        try {
            String sql = "SELECT [TicketID],[Phone],[Email],tk.[TimeID],[Slot],tk.[RoomID],\n"
                    + "  r.[Name] AS [roomName],[FilmID], f.[Name] AS [filmName],[Note],\n"
                    + "  [Date],tk.[ChairID],[ChairName],[Image],tk.[TypeName],tk.[Price]\n"
                    + "  FROM [Ticket] tk\n"
                    + "  INNER JOIN Times t ON t.[TimeID] = tk.[TimeID]\n"
                    + "  INNER JOIN Rooms r ON r.[RoomID] = tk.[RoomID]\n"
                    + "  INNER JOIN Films f ON f.[ID] = tk.[FilmID]\n"
                    + "  INNER JOIN Chairs c ON c.[ChairID] = tk.[ChairID]\n"
                    + "  INNER JOIN Price p ON p.[Type] = c.[Type]\n"
                    + "  WHERE [Phone] = ? AND [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, phone);
            stm.setString(2, email);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ticket t = new Ticket();
                t.setTicketID(rs.getInt("TicketID"));
                t.setPhone(rs.getString("phone"));
                t.setEmail(rs.getString("email"));
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
                t.setType(rs.getInt("TypeName"));
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
        ArrayList<Ticket> tickets = tkdbc.getTicket("0983563147", "tienvdhe153313@fpt.edu.vn");
        for (Ticket t : tickets) {
            System.out.println(t.getTicketID() + " " + t.getSlot() + " " + t.getRoomName() + " " + t.getFilmName() + " " + t.getNote() + " " + t.getChairName());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Duc Tien
 */
public class OrderChairDBContext extends DBContext {

    public void insertOrderChair(String chairID, String timeID, String date) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [OrderChair]([ChairID],[TimeID],[Date])\n"
                    + "     VALUES(?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, chairID);
            stm.setString(2, timeID);
            stm.setString(3, date);
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.Chair;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Duc Tien
 */
public class ChairDBContext extends DBContext {

    public Chair getChair(int id) {
        try {
            String sql = "SELECT [ChairID],[RoomID],[ChairName]\n"
                    + "  FROM [Chair]\n"
                    + "  WHERE ChairID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Chair chair = new Chair();
                chair.setChairID(id);
                chair.setRoomID(rs.getInt("RoomID"));
                chair.setName(rs.getString("ChairName"));
                return chair;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChairDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    private void insertChair(int id, String name) {
//        try {
//            connection.setAutoCommit(false);
//            String sql = "INSERT INTO [Chair] ([RoomID],[ChairName])\n"
//                    + "     VALUES (?,?)";
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setInt(1, id);
//            stm.setString(2, name);
//            stm.executeUpdate();
//            connection.commit();
//        } catch (SQLException ex) {
//            Logger.getLogger(ChairDBContext.class.getName()).log(Level.SEVERE, null, ex);
//            try {
//                connection.rollback();
//            } catch (SQLException ex1) {
//                Logger.getLogger(ChairDBContext.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//        } finally {
//            try {
//                connection.setAutoCommit(true);
//            } catch (SQLException ex) {
//                Logger.getLogger(ChairDBContext.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    
//    public static void main(String[] args) {
//        ChairDBContext cdbc = new ChairDBContext();
//        String str = "ABCDEFGHI";
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 1; j <= 10; j++) {
//                cdbc.insertChair(3, str.charAt(i) + Integer.toString(j));
//            }
//        }
//    }
}

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
}

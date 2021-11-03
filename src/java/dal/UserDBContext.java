/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.User;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Duc Tien
 */
public class UserDBContext extends DBContext {

    public User getUser(String acc) {
        try {
            String sql = "SELECT [ID],[Name],[Phone],[Email],[DoB],[Gender],[Address]\n"
                    + "  FROM [Users]\n"
                    + "  WHERE [Phone] = ? OR [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, acc);
            stm.setString(2, acc);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setPhone(rs.getString("Phone"));
                user.setEmail(rs.getString("Email"));
                user.setDob(rs.getDate("DoB"));
                user.setGender(rs.getBoolean("Gender"));
                user.setAddress(rs.getString("Address"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean insertUser(User user) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [Users]\n"
                    + "([Name],[Phone],[Email],[DoB],[Gender],[Address])\n"
                    + "VALUES\n"
                    + "(?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user.getName());
            stm.setString(2, user.getPhone());
            stm.setString(3, user.getEmail());
            stm.setDate(4, user.getDob());
            stm.setBoolean(5, user.isGender());
            stm.setString(6, user.getAddress());
            stm.execute();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex1);
                return false;
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    public void updateUser(User user) {
        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE [Users]\n"
                    + "   SET [Name] = ?\n"
                    + "      ,[Gender] = ?\n"
                    + "      ,[Address] = ?\n"
                    + " WHERE [Phone] = ? AND [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user.getName());
            stm.setBoolean(2, user.isGender());
            stm.setString(3, user.getAddress());
            stm.setString(4, user.getPhone());
            stm.setString(5, user.getEmail());
            stm.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        UserDBContext udbc = new UserDBContext();
//        User u = udbc.getUser("0983563147");
//        System.out.println(u.getName() + " " + u.getEmail() + " "+ u.getPhone());
        User u = new User();
        u.setPhone("0983563147");
        u.setEmail("tienvdhe153313@fpt.edu.vn");
        u.setName("Vũ Đức Tiến");
        u.setGender(true);
        u.setAddress("Hà Nội");
        udbc.updateUser(u);
        
        
        System.out.println();

    }
}

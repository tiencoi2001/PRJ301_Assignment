/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.User;
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

    public User getUser(String acc, String pass) {
        try {
            String sql = "SELECT [Name],[Phone],[Email],[Password],[DoB],[Gender],[Address],[Role]\n"
                    + "  FROM [Users]\n"
                    + "  WHERE ([Phone] = ? OR [Email] = ?) AND [Password] =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, acc);
            stm.setString(2, acc);
            stm.setString(3, pass);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setName(rs.getString("Name"));
                user.setPhone(rs.getString("Phone"));
                user.setEmail(rs.getString("Email"));
                user.setPass(rs.getString("Password"));
                user.setDob(rs.getDate("DoB"));
                user.setGender(rs.getBoolean("Gender"));
                user.setAddress(rs.getString("Address"));
                user.setRole(rs.getBoolean("Role"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    public static void main(String[] args) {
//        UserDBContext udbc = new UserDBContext();
//        User u = udbc.getUser("0983563147", "02072001");
//        System.out.println(u.getName() + " " + u.getEmail() + " " + u.getPass());
//    }
    public void insertUser(User user) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [Users]\n"
                    + "([Name],[Phone],[Email],[Password],[DoB],[Gender],[Address],[Role])\n"
                    + "VALUES\n"
                    + "(?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user.getName());
            stm.setString(2, user.getPhone());
            stm.setString(3, user.getEmail());
            stm.setString(4, user.getPass());
            stm.setDate(5, user.getDob());
            stm.setBoolean(6, user.isGender());
            stm.setString(7, user.getAddress());
            stm.setBoolean(8, user.isRole());
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

    public boolean updateUsers(User user) {
        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE [Users]\n"
                    + "   SET [Name] = ?\n"
                    + "      ,[Password] = ?\n"
                    + "      ,[Gender] = ?\n"
                    + "      ,[Address] = ?\n"
                    + " WHERE [Phone] = ? AND [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user.getName());
            stm.setString(2, user.getPass());
            stm.setBoolean(3, user.isGender());
            stm.setString(4, user.getAddress());
            stm.setString(5, user.getPhone());
            stm.setString(6, user.getEmail());
            stm.executeUpdate();
            connection.commit();
            return true;
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
        return false;
    }

}

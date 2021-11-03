/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Model.Account;
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
public class AccountDBContext extends DBContext {

    public Account getAccount(String acc, String pass) {
        try {
            String sql = "SELECT [Phone],[Email],[Password],[Role]\n"
                    + "  FROM [Accounts]\n"
                    + "  WHERE ([Phone] = ? OR [Email] = ?) AND [Password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, acc);
            stm.setString(2, acc);
            stm.setString(3, pass);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setPhone(rs.getString("Phone"));
                account.setEmail(rs.getString("Email"));
                account.setPass(rs.getString("Password"));
                account.setRole(rs.getBoolean("Role"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Account> getListIsNotAdmin() {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "SELECT [Phone],[Email],[Password],[role]\n"
                    + "  FROM [Accounts]\n"
                    + "  WHERE [role] = 'false'";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setPhone(rs.getString("Phone"));
                account.setEmail(rs.getString("Email"));
                account.setPass(rs.getString("Password"));
                account.setRole(rs.getBoolean("Role"));
                accounts.add(account);
            }
            return accounts;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Account> getListIsAdmin(String email) {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = " SELECT [Phone],[Email],[Password],[role]\n"
                    + "  FROM [Accounts]\n"
                    + "  WHERE [role] = 'true' AND [Email] <> 'admin' AND [Email] <> ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setPhone(rs.getString("Phone"));
                account.setEmail(rs.getString("Email"));
                account.setPass(rs.getString("Password"));
                account.setRole(rs.getBoolean("Role"));
                accounts.add(account);
            }
            return accounts;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateAdminRights(String email_phone, boolean isAdmin) {
        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE [Accounts]\n"
                    + "   SET [role] = ?\n"
                    + " WHERE [email] + ' - ' + [Phone] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setBoolean(1, isAdmin);
            stm.setString(2, email_phone);
            stm.execute();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean isExistAccount(String phone, String email) {
        try {
            String sql = "SELECT [Phone],[Email]\n"
                    + "  FROM [Accounts]\n"
                    + "  WHERE [Phone] = ? OR [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, phone);
            stm.setString(2, email);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void insertUser(Account account) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [Accounts]\n"
                    + "		([Phone],[Email],[Password],[role])\n"
                    + "     VALUES (?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, account.getPhone());
            stm.setString(2, account.getEmail());
            stm.setString(3, account.getPass());
            stm.setBoolean(4, account.isRole());
            stm.execute();
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

    public void updateAccount(Account account) {
        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE[Accounts]\n"
                    + "   SET [Password] = ?\n"
                    + " WHERE [Phone] = ? AND [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, account.getPass());
            stm.setString(2, account.getPhone());
            stm.setString(3, account.getEmail());
            stm.execute();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ZENDIA AMELIA
 */
public class TBLoginAdmin {
   private final String URL = "jdbc:mysql://localhost:3306/db_aplikasilaundry";
   private final String USER = "root";
   private final String PASS = ""; //default string kosong  
   
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianLoginAdmin> getAllLogAdmin() throws SQLException {
        List<BagianLoginAdmin> list_logadmin = new ArrayList();
        
        String sql = "select * from tb_login_admin";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianLoginAdmin admin = new BagianLoginAdmin(
                        rs.getInt("id_login_admin"), 
                        rs.getString("username_admin_login"),
                        rs.getString("password_admin")
                );
                
                list_logadmin.add(admin);
            }
        }
        
        return list_logadmin;
    } 
    
    public void InsertLogAdmin(String username, String password) throws SQLException {
        // Query untuk memeriksa apakah username sudah ada
        String checkSql = "SELECT password_admin FROM tb_login_admin WHERE username_admin_login = ?";
        String insertSql = "INSERT INTO tb_login_admin (username_admin_login, password_admin) VALUES (?, ?)";

        try (
            Connection conn = getConnection();
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
        ) {
            // Cek apakah username sudah ada
            checkStmt.setString(1, username);
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Admin dengan username ini sudah ada. Tidak dapat menambahkan data duplikat.");
                    return; 
                }
            }

            // Jika tidak ada data duplikat, masukkan data admin baru
            insertStmt.setString(1, username);
            insertStmt.setString(2, password);
            insertStmt.executeUpdate();
            System.out.println("Login berhasil ditambahkan.");
        }
    }
}

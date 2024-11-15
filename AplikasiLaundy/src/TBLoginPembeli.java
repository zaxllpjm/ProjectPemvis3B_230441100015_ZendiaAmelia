/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
/**
 *
 * @author ZENDIA AMELIA
 */
public class TBLoginPembeli {
   private final String URL = "jdbc:mysql://localhost:3306/db_aplikasilaundry";
   private final String USER = "root";
   private final String PASS = ""; //default string kosong  
   
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianLoginPembeli> getAllPembeli() throws SQLException {
        List<BagianLoginPembeli> list_pembeli = new ArrayList();
        
        String sql = "select * from tb_login_pembeli";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianLoginPembeli pembeli = new BagianLoginPembeli (
                        rs.getInt("id_login_pembeli"),
                        rs.getString("username_pembeli_login"),
                        rs.getString("password_pembeli")
                );
                
                list_pembeli.add(pembeli);
            }
        }
        
        return list_pembeli;
    } 
    
    public boolean LogPembeli(String username, String password) throws SQLException {
    String sql = "SELECT * FROM tb_register WHERE password_register = ? AND username_register = ?";

        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, password);
            stmt.setString(2, username);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}


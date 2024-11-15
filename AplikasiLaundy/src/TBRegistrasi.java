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
public class TBRegistrasi {
    private final String URL = "jdbc:mysql://localhost:3306/db_aplikasilaundry";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register driver
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver MySQL JDBC tidak ditemukan.");
            ex.printStackTrace();
        }
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianRegister> getAllRegistrasi() throws SQLException {
        List<BagianRegister> list_registrasi = new ArrayList();
        
        String sql = "select * from tb_register";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianRegister registrasi = new BagianRegister(
                        rs.getInt("id_register"), 
                        rs.getString("email"),
                        rs.getString("password_register"),
                        rs.getString("username_register")
                );
                
                list_registrasi.add(registrasi);
            }
        }
        
        return list_registrasi;
    } 
    
    public void InsertLogRegistrasi(BagianRegister p_logregistrasi) throws SQLException {
    String sql = "insert into tb_register (id_register, email, password_register, username_register) values (?, ?, ?, ?)";

    try (
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
    ) {
        stmt.setInt(1, p_logregistrasi.getId());
        stmt.setString(2, p_logregistrasi.getEmail());
        stmt.setString(3, p_logregistrasi.getPassword());
        stmt.setString(4, p_logregistrasi.getUsername());

            int rowsAffected = stmt.executeUpdate(); 
        }
    }
}

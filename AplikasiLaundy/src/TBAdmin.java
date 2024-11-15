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
public class TBAdmin {
   private final String URL = "jdbc:mysql://localhost:3306/db_aplikasilaundry";
   private final String USER = "root";
   private final String PASS = ""; //default string kosong
   
   Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianAdmin> getAllAdmin() throws SQLException {
        List<BagianAdmin> list_admin = new ArrayList();
        
        String sql = "select * from tb_admin";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianAdmin barang = new BagianAdmin(
                        rs.getInt("id_admin"), 
                        rs.getInt("id_pembeli"),
                        rs.getInt("total_point"),
                        rs.getString("tanggal_ambil"),
                        rs.getString("total_biaya"),
                        rs.getString("nama_pembeli") 
                );
                
                list_admin.add(barang);
            }
        }
        
        return list_admin;
    }
    
    public void InsertAdmin(BagianAdmin p_nama) throws SQLException {
    String sql = "INSERT INTO tb_admin (id_pembeli, tanggal_ambil, total_biaya, total_point, nama_pembeli) VALUES (?, ?, ?, ?, ?)";

    try (
        Connection conn = getConnection(); // Mendapatkan koneksi ke database
        PreparedStatement stmt = conn.prepareStatement(sql); // Menyiapkan statement untuk query
    ) {
        stmt.setInt(1, p_nama.getIdPembeli());
        stmt.setString(2, p_nama.getTanggalAmbil());
        stmt.setString(3, p_nama.getTotalBiaya());
        stmt.setInt(4, p_nama.getTotalPoint());
        stmt.setString(5, p_nama.getNamaPembeli());

        stmt.executeUpdate(); // Menjalankan query insert
    } catch (SQLException e) {
        e.printStackTrace(); // Menampilkan error jika ada
        throw e; // Melempar ulang error agar dapat ditangani di tempat lain
    }
  }

   public void UpdateAdmin(BagianAdmin p_edit) throws SQLException {
    String sql = "UPDATE tb_admin SET tanggal_ambil = ?, id_pembeli = ?, total_biaya = ?, total_point = ?, nama_pembeli = ? WHERE id_admin = ?";
    
    try (Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, p_edit.getTanggalAmbil());
        stmt.setInt(2, p_edit.getIdPembeli());
        stmt.setString(3, p_edit.getTotalBiaya());
        stmt.setInt(4, p_edit.getTotalPoint());
        stmt.setString(5, p_edit.getNamaPembeli());
        stmt.setInt(6, p_edit.getId());
        
        stmt.executeUpdate();
        }
    }
    
    public void deletePembeli(int id) throws SQLException {
    String sqlPembeli = "DELETE FROM tb_pembeli WHERE id_pembeli = ?";
    String sqlAdmin = "DELETE FROM tb_admin WHERE id_pembeli = ?";

    try (Connection conn = getConnection()) {
        conn.setAutoCommit(false);  // Mulai transaksi

        try (PreparedStatement stmtPembeli = conn.prepareStatement(sqlPembeli);
             PreparedStatement stmtAdmin = conn.prepareStatement(sqlAdmin)) {

            // Hapus data dari tb_pembeli
            stmtPembeli.setInt(1, id);
            stmtPembeli.executeUpdate();

            // Hapus data dari tb_admin
            stmtAdmin.setInt(1, id);
            stmtAdmin.executeUpdate();

            conn.commit();  // Selesaikan transaksi jika semua penghapusan berhasil
        } catch (SQLException e) {
            conn.rollback();  // Batalkan transaksi jika terjadi error
            throw e;
        } finally {
            conn.setAutoCommit(true);  // Kembali ke mode autocommit
        }
    }
}

}

    


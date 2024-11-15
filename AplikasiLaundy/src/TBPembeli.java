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
public class TBPembeli {
   private final String URL = "jdbc:mysql://localhost:3306/db_aplikasilaundry";
   private final String USER = "root";
   private final String PASS = ""; //default string kosong
   
   Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianPembeli> getAllPembeli() throws SQLException {
        List<BagianPembeli> list_Pembeli = new ArrayList();
        
        String sql = "select * from tb_pembeli";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianPembeli barang = new BagianPembeli(
                        rs.getInt("id_pembeli"), 
                        rs.getInt("total_berat"),
                        rs.getString("nama_pembeli"),
                        rs.getString("alamat"),
                        rs.getString("tanggal_pesan"),
                        rs.getString("jenis_baju"),
                        rs.getString("jenis_layanan"),
                        rs.getString("jenis_paket")
                );
                
                list_Pembeli.add(barang);
            }
        }
        
        return list_Pembeli;
    } 
    
    public void InsertPembeli(BagianPembeli p_nama) throws SQLException {
    String sql = "INSERT INTO tb_pembeli (nama_pembeli, alamat, tanggal_pesan, jenis_baju, jenis_layanan, jenis_paket, total_berat) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (
        Connection conn = getConnection(); // Mendapatkan koneksi ke database
        PreparedStatement stmt = conn.prepareStatement(sql); // Menyiapkan statement untuk query
    ) {
        stmt.setString(1, p_nama.getNamaPembeli());
        stmt.setString(2, p_nama.getAlamat());
        stmt.setString(3, p_nama.getTanggalPesan());
        stmt.setString(4, p_nama.getJenisBaju());
        stmt.setString(5, p_nama.getJenisLayanan());
        stmt.setString(6, p_nama.getJenisPaket());
        stmt.setInt(7, p_nama.getTotalBerat());

        stmt.executeUpdate(); // Menjalankan query insert
    } catch (SQLException e) {
        e.printStackTrace(); // Menampilkan error jika ada
        throw e; // Melempar ulang error agar dapat ditangani di tempat lain
    }
  }
    
    public void updatePembeli(BagianPembeli p_edit) throws SQLException {
    String sql = "UPDATE tb_pembeli SET nama_pembeli = ?, alamat = ?, tanggal_pesan = ?, jenis_baju = ?, jenis_layanan = ?, jenis_paket = ?, total_berat = ? WHERE nama_pembeli = ?";
    
    try (Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, p_edit.getNamaPembeli());
        stmt.setString(2, p_edit.getAlamat());
        stmt.setString(3, p_edit.getTanggalPesan());
        stmt.setString(4, p_edit.getJenisBaju());
        stmt.setString(5, p_edit.getJenisLayanan());
        stmt.setString(6, p_edit.getJenisPaket());
        stmt.setInt(7, p_edit.getTotalBerat());
        stmt.setString(8, p_edit.getNamaPembeli());
   
        
        stmt.executeUpdate();
        }
    }
    
    public static BagianPembeli getPesanan(String nama) throws SQLException {
        String query = "SELECT * FROM tb_pembeli WHERE nama_pembeli = ?"; 
        try (Connection connection = new TBPembeli().getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
             
            stmt.setString(1, nama);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new BagianPembeli(
                    rs.getInt("id_pembeli"),
                    rs.getInt("total_berat"),
                    rs.getString("nama_pembeli"),
                    rs.getString("alamat"),
                    rs.getString("tanggal_pesan"),
                    rs.getString("jenis_baju"),
                    rs.getString("jenis_layanan"),
                    rs.getString("jenis_paket")
                );
            }
        }
        return null; 
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianPembeli {
    private int id_pembeli, total_berat ;
    private String nama_pembeli, alamat, tanggal_pesan, jenis_baju, jenis_layanan, jenis_paket ;
    
    public BagianPembeli (int p_id_pembeli, int p_total_berat, String p_nama_pembeli, String p_alamat,
             String p_tanggal_pesan, String p_jenis_baju, String p_jenis_layanan, String p_jenis_paket ) {
        this.id_pembeli = p_id_pembeli;
        this.total_berat = p_total_berat;
        this.nama_pembeli = p_nama_pembeli;
        this.alamat = p_alamat;
        this.tanggal_pesan = p_tanggal_pesan;
        this.jenis_baju = p_jenis_baju;
        this.jenis_layanan = p_jenis_layanan;
        this.jenis_paket = p_jenis_paket;    
   }
    
    public void setId(int p_id_pembeli){
        this.id_pembeli = p_id_pembeli;
   }
    
    public int getId() {
        return id_pembeli;
   }
    
    public void setTotalBerat(int p_total_berat){
        this.total_berat = p_total_berat;
   }
    
    public int getTotalBerat() {
        return total_berat;
   }
    
   public void setNamaPembeli(String p_nama_pembeli){
        this.nama_pembeli = p_nama_pembeli;
   }
    
    public String getNamaPembeli() {
        return nama_pembeli;
   }
    
   public void setAlamat(String p_alamat){
        this.alamat = p_alamat;
   }
    
    public String getAlamat() {
        return alamat;
   }
    
   public void setTanggalPesan(String p_tanggal_pesan){
        this.tanggal_pesan = p_tanggal_pesan;
   }
    
    public String getTanggalPesan() {
        return tanggal_pesan;
   }
    
    public void setJenisBaju(String p_jenis_baju){
        this.jenis_baju = p_jenis_baju;
   }
    
    public String getJenisBaju() {
        return jenis_baju;
   }
    
   public void setJenisLayanan(String p_jenis_layanan){
        this.jenis_layanan = p_jenis_layanan;
   }
    
    public String getJenisLayanan() {
        return jenis_layanan;
   }
    
   public void setJenisPaket(String p_jenis_paket){
        this.jenis_paket = p_jenis_paket;
   }
    
    public String getJenisPaket() {
        return jenis_paket;
   }
    
}

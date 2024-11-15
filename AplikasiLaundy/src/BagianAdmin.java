/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianAdmin {
    private int id_admin, id_pembeli, total_point ;
    private String total_biaya, tanggal_ambil, nama_pembeli; 
    
    public BagianAdmin (int p_id_admin, int p_id_pembeli, int p_total_point, String p_total_biaya, String p_tanggal_ambil, String p_nama_pembeli ) {
        this.id_admin = p_id_admin;
        this.id_pembeli = p_id_pembeli;
        this.total_point = p_total_point;
        this.total_biaya = p_total_biaya;
        this.tanggal_ambil = p_tanggal_ambil;
        this.nama_pembeli = p_nama_pembeli;
       }
    
    public void setId(int p_id_admin){
        this.id_admin = p_id_admin;
   }
    
    public int getId() {
        return id_admin;
    }
    
    public void setIdPembeli(int p_id_pembeli){
        this.id_pembeli = p_id_pembeli;
   }
    
    public int getIdPembeli() {
        return id_pembeli;
    }
    
    public void setTotalPoint(int p_total_point){
        this.total_point = p_total_point;
   }
    
    public int getTotalPoint() {
        return total_point;
    }
    
    public void setTotalBiaya(String p_total_biaya){
        this.total_biaya = p_total_biaya;
   }
    
    public String getTotalBiaya() {
        return total_biaya;
   }
    
    public void setTanggalAmbil(String p_tanggal_ambil){
        this.tanggal_ambil = p_tanggal_ambil;
   }
    
    public String getTanggalAmbil() {
        return tanggal_ambil;
   }
    
     public void setNamaPembeli(String p_nama_pembeli){
        this.nama_pembeli = p_nama_pembeli;
   }
    
    public String getNamaPembeli() {
        return nama_pembeli;
   }
 }

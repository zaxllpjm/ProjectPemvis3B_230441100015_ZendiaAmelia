/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianDataAdmin {
    private int id_data, total_berat_data, total_biaya_data, harga_berat, total_biaya;
    private String nama_data,
                   jenis_layanan_data, 
                   tanggal_pesan_data,
                   tanggal_ambil_data,
                   jenis_baju_data, 
                   jenis_paket_data,
                   tanggal_ambil;
    
    public BagianDataAdmin (int p_id_data, int p_total_berat_data, 
                            int p_total_biaya_data, String p_nama_data,int p_harga_berat, int p_total_biaya,
                            String p_jenis_layanan_data, String p_tanggal_pesan_data,
                            String p_tanggal_ambil_data, String p_jenis_baju_data,
                            String p_jenis_paket_data, String p_tanggal_ambil) {
        this.id_data = p_id_data;
        this.total_berat_data = p_total_berat_data;
        this.total_biaya_data = p_total_biaya_data;
        this.nama_data = p_nama_data;
        this.jenis_layanan_data = p_jenis_layanan_data;
        this.tanggal_pesan_data = p_tanggal_pesan_data;
        this.tanggal_ambil_data = p_tanggal_ambil_data;
        this.jenis_baju_data = p_jenis_baju_data;
        this.jenis_paket_data = p_jenis_paket_data;
        this.harga_berat = p_harga_berat;
        this.total_biaya = p_total_biaya;
        this.tanggal_ambil = p_tanggal_ambil;
   }
    
   public void setId(int p_id_data){
        this.id_data = p_id_data;
   }
    
    public int getId() {
        return id_data;
   }
    
   public void setTotalBeratData(int p_total_berat_data){
        this.total_berat_data = p_total_berat_data;
   }
    
    public int getTotalBeratData() {
        return total_berat_data;
   }
    
   public void setTotalBiayaData(int p_total_biaya_data){
        this.total_biaya_data = p_total_biaya_data;
   }
    
    public int getTotalBiayaData() {
        return total_biaya_data;
   }
    
   public void setHargaBerat(int p_harga_berat){
        this.harga_berat = p_harga_berat;
   }
    
    public int getHargaBerat() {
        return harga_berat;
   }
    
   public void setTotalBiaya(int p_total_biaya){
        this.total_biaya = p_total_biaya;
   }
    
    public int getTotalBiaya() {
        return total_biaya;
   }
    
   public void setNamaData(String p_nama_data){
        this.nama_data = p_nama_data;
   }
    
    public String getNamaData() {
        return nama_data;
   }
    
   public void setJenisLayananData(String p_jenis_layanan_data){
        this.jenis_layanan_data = p_jenis_layanan_data;
   }
    
    public String getJenisLayananData() {
        return jenis_layanan_data;
   }
    
   public void setTanggalPesanData(String p_tanggal_pesan_data){
        this.tanggal_pesan_data = p_tanggal_pesan_data;
   }
    
    public String getTanggalPesanData() {
        return tanggal_pesan_data;
   }
    
   public void setTanggalAmbilData(String p_tanggal_ambil_data){
        this.tanggal_ambil_data = p_tanggal_ambil_data;
   }
    
    public String getTanggalAmbilData() {
        return tanggal_ambil_data;
   }
    
   public void setJenisBajuDataData(String p_jenis_baju_data){
        this.jenis_baju_data = p_jenis_baju_data;
   }
    
    public String getJenisBajuData() {
        return jenis_baju_data;
   }
    
    public void setJenisPaketData(String p_jenis_paket_data){
        this.jenis_paket_data = p_jenis_paket_data;
   }
    
    public String getJenisPaketData() {
        return jenis_paket_data;
   }
    
   public void setTanggalAmbil(String p_tanggal_ambil){
        this.tanggal_ambil = p_tanggal_ambil;
   }
    
    public String getTanggalAmbil() {
        return tanggal_ambil;
   }
}

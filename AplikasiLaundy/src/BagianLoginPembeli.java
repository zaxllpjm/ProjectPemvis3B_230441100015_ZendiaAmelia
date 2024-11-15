/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianLoginPembeli {
    private int id_pembeli;
    private String username_pembeli, password_pembeli;
    
    public BagianLoginPembeli (int p_id_pembeli, String p_username_pembeli, String p_password_pembeli) {
        this.id_pembeli = p_id_pembeli;
        this.username_pembeli = p_username_pembeli;
        this.password_pembeli = p_password_pembeli;
   }
    
   public void setId(int p_id_pembeli){
        this.id_pembeli = p_id_pembeli;
   }
    
    public int getId() {
        return id_pembeli;
   }
    
   public void setNama(String p_username_pembeli){
        this.username_pembeli = p_username_pembeli;
    }
    
    public String getNama() {
        return username_pembeli;
    }
    
    public void setPassword(String p_password_pembeli){
        this.password_pembeli = p_password_pembeli;
    }
    
    public String getPassword() {
        return password_pembeli;
    }   
}

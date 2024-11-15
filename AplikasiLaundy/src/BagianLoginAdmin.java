/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianLoginAdmin {
    private int id_admin;
    private String username_admin, password_admin;
    
   public BagianLoginAdmin (int p_id_admin, String p_username_admin, String p_password_admin) {
        this.id_admin = p_id_admin;
        this.username_admin = p_username_admin;
        this.password_admin = p_password_admin;
   }

    public void setId(int p_id_admin){
        this.id_admin = p_id_admin;
    }
    
    public int getId() {
        return id_admin;
    }
    
    public void setUsername(String p_username_admin){
        this.username_admin = p_username_admin;
    }
    
    public String getUsername() {
        return username_admin;
    }
    
    public void setPassword(String p_password_admin){
        this.password_admin = p_password_admin;
    }
    
    public String getPassword() {
        return password_admin;
    }   
}


    

  
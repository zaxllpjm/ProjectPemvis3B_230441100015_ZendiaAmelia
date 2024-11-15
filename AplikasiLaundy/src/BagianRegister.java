/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianRegister {
    private int id_register;
    private String email, password_register, username_register;
    
    public BagianRegister (int p_id_register, String p_email, String p_password_register, String p_username_register) {
        this.id_register = p_id_register;
        this.email = p_email;
        this.password_register = p_password_register;
        this.username_register = p_username_register;
   }
    
   public void setId(int p_id_register){
        this.id_register = p_id_register;
   }
    
    public int getId() {
        return id_register;
   }
    
   public void setEmail(String p_email){
        this.email = p_email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String p_password_register){
        this.password_register= p_password_register;
    }
    
    public String getPassword() {
        return password_register;
    }
    
    public void setUsername(String p_username_register){
        this.username_register= p_username_register;
    }
    
    public String getUsername() {
        return username_register;
    }
}

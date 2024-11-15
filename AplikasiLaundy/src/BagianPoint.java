/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianPoint {
     private int id_point, total_harga_point, point, diskon;
     
     public BagianPoint(int p_id_point, int p_total_harga_point, int p_point, int p_diskon) {
        this.id_point = p_id_point;
        this.total_harga_point= p_total_harga_point;
        this.point= p_point;
        this.diskon = p_diskon;
   }
     
     public void setId(int p_id_point){
        this.id_point = p_id_point;
   }
    
    public int getId() {
        return id_point;
   }
    
    public void setTotalHargaPoint(int p_total_harga_point){
        this.total_harga_point = p_total_harga_point;
   }
    
    public int getTotalHargaPoint() {
        return total_harga_point;
   }
    
    public void setPoint(int p_point){
        this.point = p_point;
   }
    
    public int getPoint() {
        return point;
   }
    
    public void setDiskon(int p_diskon){
        this.diskon = p_diskon;
   }
    
    public int getDiskon() {
        return diskon;
   }
}

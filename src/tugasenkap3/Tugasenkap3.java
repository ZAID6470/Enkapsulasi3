/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasenkap3;

/**
 *
 * @author MOKLET-2
 */
public class Tugasenkap3 {
    private String name;
    private String address;
    private int absen;

    /**
     * @param args the command line arguments
     * @return 
     */
    public int getabsen(){
        return absen;
    }
    
    public String getname(){
        return name;
    }
    
    public String getaddress(){
        return address;
    }
    
    public void setabsen(int newabsen){
        absen = newabsen;
    }
    
    public void setname(String newname){
        name = newname;
    }
    
    public void setaddress(String newaddress){
        address = newaddress;
    }
}

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
public class Testsiswa {
    
    public static void main(String args[]){
        Tugasenkap3 siswa = new Tugasenkap3();
        siswa.setname("Zaid");
        siswa.setabsen(26);
        siswa.setaddress("Malang");
        
        System.out.println("Name : " + siswa.getname());
        System.out.println("Absen : " + siswa.getabsen());
        System.out.println("Address : " + siswa.getaddress());

    }
}

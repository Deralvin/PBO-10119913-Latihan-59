/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan59;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class PBO10119913Latihan59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PemeranUtama pu = new PemeranUtama("Shinichi Kudo", "pai", "ambisius", 21);
        pu.setNamaSamaran("Conan");
        pu.displayKarakter();
        System.out.println("Nama Samaran : "+ pu.getNamaSamaran());
        
        System.out.println("");
    
        PemeranPendukung pp = new PemeranPendukung("Kogoro Mouri","Ramen","pantang Menyerah", 30);
        pp.setPanggilan("Heiji");
        pp.displayKarakter();
        System.out.println("Nama Panggilan : " + pp.getPanggilan());
        System.out.println("");
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class swictcase {
    public static void main(String[] args) {
        //membuat variabel
            int nilai;
            String prestasi ="";
            Scanner scan = new Scanner(System.in);
            
        //mengambil input
            System.out.println("Masukkan Nilai");
            nilai = scan.nextInt();
            
        //menghitung
            if ( nilai <=100){
                prestasi = " A ";
            } else if (nilai <=80) {
                prestasi = " B ";
               }
            if ( nilai <=70){
            prestasi = " c ";
            }
            else if ( nilai <=60)
                prestasi = " d ";
            
            //cetak hasilnya
            System.out.println("Prestasi" + prestasi);
    }
}

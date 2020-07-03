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
public class ifelse {
    public static void main(String[] args) {
        
         // membuat variabel belanja dan scanner
         String nama ;
        int uang = 200;
        double tinggi;
        Scanner scan = new Scanner(System.in);

        // mengambil input
            System.out.println(" === **TOKOH BERKAH** === ");
        
        
        System.out.println("Masukkan Nama : ");
        nama = scan.nextLine();
        
        System.out.print("Total Belanjaan: Rp ");
        uang = scan.nextInt();
        
        System.out.println("Tinggi Anda : "  );
        tinggi = scan.nextDouble();
        
        System.out.println(" Nama anda "+ nama );
        System.out.println(" Total belanja anda Rp: "+ uang );
        System.out.println(" Tinggi anda "+ tinggi + " cm ");
        
        System.out.println(" =====#### TOKOH BERKAH ####===== " );

        // cek apakah dia belanja di atas 100000
        if ( uang>= 100000 ) {
            System.out.println("Siiiiiiipppp .....!");
        }else{
                System.out.println("Hadehhhh......!");
        }

        System.out.println("Terima kasih...");

            
         }
            
 
}

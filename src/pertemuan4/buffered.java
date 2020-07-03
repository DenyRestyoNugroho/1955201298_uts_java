/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class buffered {
 public static void main(String[] args) throws IOException {

        String nama;
        int usia =0; 
        double berat = 120;
        String alamat="";
        int tinggi ;
        
        

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi varibel nama dengan Bufferreader
                System.out.println(" ==== DATA DIRI ===");
        
        
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        
        
        System.out.println("Usia Anda : ");
        Scanner inputUser = new Scanner(System.in);
        usia = Integer.parseInt(inputUser.nextLine ());
        
        System.out.println("Berat Anda : ");
        berat = Integer.parseInt(inputUser.nextLine());
        
        System.out.print(" Alamat Anda : ");
       alamat = br.readLine();
        
        System.out.println("Tinggi Kamu : ");
        
        tinggi = Integer.parseInt(inputUser.nextLine());
        
        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
        System.out.println("Usia Anda " + usia + " tahun ");
        System.out.println("Berat Anda "+ berat + " Kg ");
        System.out.println("Alamat Anda "+ alamat);
        System.out.println("Tinggi Kamu " + tinggi + " Cm ");
            
            
    }
}
       


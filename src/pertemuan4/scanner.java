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
public class scanner {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, tahunlulus;
        double beratbadan;
        

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Mahasiswa ###");
        System.out.print("Nama Mahasiswa: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Tahun Lulus: ");
        tahunlulus = keyboard.nextInt();
        
         System.out.println("Berat Badan");
         beratbadan = keyboard.nextDouble();

        // Menampilkan apa yang sudah simpan di variabel
        
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tahun Lulus: " + tahunlulus);
         System.out.println("Berat Badan:"+ beratbadan);
    }

}

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
public class uts {
    public static void main(String[] args) {
        int nilai = 0 ;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
       
       
        for(String a ="y"; a.equals("y") || a.equals("y");)
        {
        System.out.println(" nilai ujian ");
        nilai = scan.nextInt();
        
        System.out.println(" nilai anda " +nilai);
        
        if ( nilai >= 80 ){
            System.out.println(" selamat anda lulus ");
            
        
        }else {
        
            System.out.println(" maaf' anda gagal... ");}
        
             
            System.out.println("Apakah anda ingin menginput ulang? [Y/T]");
            a = scan.next();
            
        }
        
    }
    }


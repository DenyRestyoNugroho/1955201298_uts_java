/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class jjoptionpane {
     public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog(" Anda dimana ");
        JOptionPane.showMessageDialog(null, " Anda berada di " +tanya );
         
        String usia = JOptionPane.showInputDialog(" Usia ");
        JOptionPane.showMessageDialog(null, " Usia anda " +usia );
        
        String takok = JOptionPane.showInputDialog(" alamat ");
        JOptionPane.showMessageDialog(null, " alamat anda adalah " +takok );
        
        String nama = JOptionPane.showInputDialog(" nama ayah ");
        JOptionPane.showMessageDialog(null, " ayah anda  " +nama ); 
        
        String msg = (" biodata " + "\nnama :" +tanya + "\nusia anda : "+usia+ "\nalamat anda  : "+takok+ "\nnama ayah : "+nama);
        JOptionPane.showMessageDialog(null, msg);
        
    }
}

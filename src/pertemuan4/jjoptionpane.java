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
    }
}

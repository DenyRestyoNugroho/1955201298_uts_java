/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsARRAY;

/**
 *
 * @author DELL
 */
public class array2dimensi {
    public static void main(String[] args) {
         System.out.println(" array 2 dimensi ");
            int matriks [][] = {{11,54},
                                {58,68}};
            
            for (int i=0; i<matriks[0].length; i++){
                for(int j =0; j<matriks[0].length; j++){
                    System.out.print(matriks[i][j]+ " ");
                }
                System.out.println(" ");
    }
    }
}

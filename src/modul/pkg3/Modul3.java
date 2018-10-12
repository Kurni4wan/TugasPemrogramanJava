/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg3;

import java.util.Scanner;
/**
 *
 * @author Niam The Movie
 */
public class Modul3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        int nomer1;
        int nomer2;
        int nomer3;
        
        System.out.println("masukan angka nomer 1");
        nomer1 = Input.nextInt();
        System.out.println("masukan angka nomer 2");
        nomer2 = Input.nextInt();
        System.out.println("masukan angka nomer 3");
        nomer3 = Input.nextInt();
        System.out.println("nomer 1 "+ nomer1);
        System.out.println("nomer 2 "+ nomer1);
        System.out.println("nomer 3 "+ nomer1);
        
        int rata_rata =(nomer1+nomer2+nomer3)/3;
        System.out.println("rata_rata "+ rata_rata);

    }
    
}

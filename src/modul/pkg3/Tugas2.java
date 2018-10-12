/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg3;
import javax.swing.JOptionPane;
/**
 *
 * @author Niam The Movie
 */
public class Tugas2 {
    public static void main(String[] args) {
        String nama ="";
        int nomor1=0;
        int nomor2=0;
        int nomor3=0;
        try {
            nama = JOptionPane.showInputDialog("masukkan nama anda ");
            nomor1 = Integer.parseInt(JOptionPane.showInputDialog(nomor1));
            nomor2 = Integer.parseInt(JOptionPane.showInputDialog(nomor2));
            nomor3 = Integer.parseInt(JOptionPane.showInputDialog(nomor3));
            String msg = " Nama Anda " + nama +"  " + nomor1 + "  " + nomor2 + " dan " + nomor3;
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "eror");
    }
        }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class tugasJOptionpane {
    
    public static void main(String[] args) {
        
        
        String alamat = JOptionPane.showInputDialog("dimana alamat anda ?");
        System.out.println(" alamat anda ada di"  + alamat);
        
        String ibu = JOptionPane.showInputDialog("siapa nama ibu anda?");
        System.out.println("nama ibu anda adalah" + ibu);
        
        String ayah = JOptionPane.showInputDialog("siapa nama ayah anda");
        System.out.println("nama ayah anda adalah" + ayah);
        
        String kakak = JOptionPane.showInputDialog("siapa nama kakak anda");
        System.out.println("nama kakak anda adalah" + kakak);
        
        String nenek = JOptionPane.showInputDialog("siapa nama nenek anda");
        System.out.println("nama nenek anda adalah" + nenek);
    } 
}  


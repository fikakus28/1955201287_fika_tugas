/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class tugasBuffereadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int saudara,angotakeluarga = 0;
        int NOcelana, umur,tanggallahir= 0;
        
        System.out.println(" saudara anda berapa?");
        Scanner inputUser = new Scanner (System.in);
        saudara = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("angota keluarga anda berapa?");
        inputUser = new Scanner(System.in);
        angotakeluarga = Integer.parseInt(inputUser.nextLine());
        
             
        System.out.println("NO celana anda berapa?");
        inputUser = new Scanner(System.in);
       NOcelana  = Integer.parseInt(inputUser.nextLine());
      
        System.out.println("umur anda berapa");
        inputUser = new Scanner(System.in);
        umur = Integer.parseInt (inputUser.nextLine());  
        
        System.out.println("tanggal lahir anda berapa");
         inputUser = new Scanner(System.in);
       tanggallahir = Integer.parseInt (inputUser.nextLine());
       
       //menampilkan nama
        System.out.println("data anda sebagai berikut:");
        System.out.println("saudara :"+saudara);
        System.out.println("angotakeluarga"+angotakeluarga);
        System.out.println("NOcelana"+NOcelana);
        System.out.println("umur"+umur);
        System.out.println("tanggallahir"+tanggallahir);
         }
}  
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author OWNER
 */
public class switch_case {
    public static void main(String[] args) {
        int  kegiatan = 0;
       switch (kegiatan){
           case 1:
               System.out.println("menyapu");
               break;
           case 2:
               System.out.println("mencuci baju");
               break;
           case 3:
               System.out.println("memasak");
               break;
           case 4:
               System.out.println("mencuci piring");
               break;
           case 5:
               System.out.println("menyetrika");
               break;
               
           default:
               System.out.println("maaf kegiatan yang anda pilih atau no yg anda pilih tidak ada");
               
               
                       
           
       }
    }
}

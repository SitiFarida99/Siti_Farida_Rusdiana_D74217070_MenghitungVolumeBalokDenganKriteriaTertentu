/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenghitungVolumeBalok;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenghitungVolume {
        
    public static void main (String[] args) {
        
       
        System.out.println("Nama : Siti Faridah Rusdiana ");
        System.out.println("NIM  : D74217070 ");
        System.out.println("                  Menghitung Volume Balok."); 
        
        System.out.println("Masukkan Panjang, lebar, dan tinggi balok jika volume baloknya 5000 cm^3");
         Scanner input = new Scanner (System.in);
        int p,l,t,V;
        
        System.out.println("  Masukkan Panjang Balok :");
        p = input.nextInt( );
        System.out.println("  Masukkan lebar Balok :");
        l = input.nextInt();
        System.out.println("  Masukkan tinggi Balok :");
        t = input.nextInt();
        
        V=p*l*t;
        
        System.out.println("Volume adalah " + V );
        String nG;
        
         if (V == 5000){
           nG = "Panjang, lebar, dan tinggi kamu benar karena hasilnya 5000";
      } else if (V >= 5000){
           nG = "Panjang, lebar, dan tinggi kamu terlalu besar karena hasilnya melebihi 5000";
      } else if (V >= 2500){
           nG = "Panjang, lebar, dan tinggi kamu masih kurang sedikit karena masih diantara 2500-5000";
      } else if (V >= 100){
           nG = "Panjang, lebar, dan tinggi kamu masih sangat kurang karena hasilnya jauh dari 5000"; 
      } else if (V <= 100){
           nG = "Panjang, lebar, dan tinggi kamu masih kurang karena hasilnya kurang dari 100"; 
      } else { 
          nG = "input salah";
      }
      if ("input salah".equals(nG)){
          System.out.println(nG);
      }else {
         System.out.println("Keterangan :" + nG);
      }

}}
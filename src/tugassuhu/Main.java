/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassuhu;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
  public static void main(String[] args) {
      int celcius; 
      boolean cek = false;
    
      Scanner input = new Scanner(System.in);
      System.out.println("+===========================+");
      System.out.println("| PROGRAM KONVERSI SUHU AIR |");
      System.out.println("+===========================+");
      System.out.println("\nInput Data");
      System.out.println("----------");
      System.out.print("Suhu Dalam Celcius : "); celcius = input.nextInt();
      
      KonversiSuhu convert = new KonversiSuhu(celcius);
      
      do{
      System.out.println("\nOPSI :");
      System.out.println("------");
      System.out.println("1. Lihat Data Konversi");
      System.out.println("2. Edit Data Konversi");
      System.out.println("3. Exit");
      System.out.print("Pilih : ");
      int pilih = input.nextInt();
      
      switch(pilih){
          case 1 :
              convert.lihatdata();
              break;
          case 2 :
              System.out.println("Input Data");
              System.out.println("----------");
              System.out.print("Suhu Dalam Celcius : "); 
              convert.suhu = input.nextInt();
              break;
          case 3 :
              System.exit(0);
              break;
          default :
              System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar");
              cek=true;
              
      }
  } while(cek=true);
}
}

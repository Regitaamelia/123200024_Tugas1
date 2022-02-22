/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassuhu;

/**
 *
 * @author HP
 */
public class KonversiSuhu {
    int suhu;
  public KonversiSuhu(int suhu){
      this.suhu=suhu;
} 
  
  void lihatdata() {
      System.out.println("\n");
      System.out.println("Suhu Dalam Celcius : " +suhu+ "°C");
      System.out.println("Dalam Fahrenheit   : " +fahrenheit()+ "°F");
      System.out.println("Dalam Reamur       : " +reamur()+ "°R");
      System.out.println("Dalam Kelvin       : " +kelvin()+ "K");
      
      
     if(suhu<=0) {
         System.out.println("Kondisi Air Beku");
     }
     else if (suhu > 0 && suhu > 100){
         System.out.println("Kondisi Air Normal");
     }
     else if(suhu >= 100){
         System.out.println("Kondisi Air Didih");
     }
  }
  
  double fahrenheit() {
      return (9*suhu)/5 +32;
  }
  double reamur() {
      return (4*suhu)/5;
  }
  double kelvin() {
      return suhu+273.15;
  }
}

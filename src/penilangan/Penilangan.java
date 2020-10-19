
package penilangan;

import java.util.Scanner;


public class Penilangan {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("Berikut syarat agar tidak ditilang");
         String[] Syarat = {"Pakai Masker","SIM","STNK"};
      
      for(int i = 0;i < Syarat.length;i++){
          System.out.println(i+"."+Syarat[i]);
      }
      System.out.println("Pilih syarat yang anda bawa");
         String[] Penilangan = {"Pakai Masker,SIM","SIM,STNK","Pakai Masker,STNK,SIM","SIM","STNK","Pakai Masker","Tidak Membawa"};
      
      for(int i = 0;i < Penilangan.length;i++){
          System.out.println(i+"."+Penilangan[i]);
      }
      System.out.print("Inputkan pilihan anda :");
      a = input.nextInt();
      switch (a){
          case 0:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
          case 1:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
          case 2:
              System.out.print("Nikmati Perjalanan anda ");
              System.out.print("\n");
              break;
          case 3:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
          case 4:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
          case 5:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
          case 6:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
          case 7:
              System.out.print("Anda Ditilang");
              System.out.print("\n");
              break;
      }
    }
    
}

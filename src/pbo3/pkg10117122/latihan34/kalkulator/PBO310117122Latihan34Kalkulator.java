/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author lenovo
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukkan dua bilangan, menampilakan hasil 
 *                     penjumlahan, pengurangan, perkalian dan pembagian.
 */
public class PBO310117122Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Coll = new Scanner(System.in);
        
        System.out.println("====AplikasiKalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        double x = Coll.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        double y = Coll.nextDouble();
        
        System.out.println();
        Kalkulator Output = new Kalkulator(x, y);
        System.out.println("Hasil Pertambahan : " 
                + Output.tambahBilangan(x, y));
        System.out.println("Hasil Pengurangan : " 
                + Output.kurangBilangan(x, y));
        System.out.println("Hasil Perkalian   : " 
                + Output.kaliBilangan(x, y));
        System.out.println("Hasil Pembagian   : " 
                + Output.bagiBilangan(x, y));
        System.out.println("Hasil Sisa        : " 
                + Output.sisaBilangan(x, y));
        
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}

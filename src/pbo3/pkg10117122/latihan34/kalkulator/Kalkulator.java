/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan34.kalkulator;



/**
 *
 * @author lenovo
 */
public class Kalkulator {
    public double value1, value2;
    double hasil;

    public Kalkulator (double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public double tambahBilangan(double value1, double value2){
        hasil = value1 + value2;
        return hasil;
    }
    public double kurangBilangan(double value1, double value2){
        hasil = value1 - value2;
        return hasil;
    }
    public double kaliBilangan(double value1, double value2){
        hasil = value1 * value2;
        return hasil;
    }
    public double bagiBilangan(double value1, double value2){
        hasil = value1 / value2;
        return hasil;
    }
    public double sisaBilangan(double value1, double value2){
        hasil = value1 % value2;
        return hasil;
    }
}

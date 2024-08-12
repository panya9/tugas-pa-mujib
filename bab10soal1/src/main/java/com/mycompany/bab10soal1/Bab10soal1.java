/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal1;

/**
 *
 * @author user
 */
public class Bab10soal1 {

   public class Aritmatika2 {
    // Metode penjumlahan dari class aritmatika2
    public int penjumlahan(int a, int b) {
        return a + b;
    }
}

public class Aritmatika3 extends Aritmatika2 {
    // Metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Metode pembagian
    public int pembagian(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    // Metode pangkat
    public int pangkat(int a, int b) {
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Aritmatika3 aritmatika = new Aritmatika3();

        // Contoh penggunaan metode
        System.out.println("Penjumlahan: " + aritmatika.penjumlahan(10, 5));
        System.out.println("Pengurangan: " + aritmatika.pengurangan(10, 5));
        System.out.println("Perkalian: " + aritmatika.perkalian(10, 5));
        System.out.println("Pembagian: " + aritmatika.pembagian(10, 5));
       System.out.println("pangkat:" + aritmatika.pangkat(2, 3));
    }
}
}

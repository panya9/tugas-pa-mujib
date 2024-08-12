/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soalll1;

/**
 *
 * @author HP
 */
public class Bab10soalll1 {

    public static void main(String[] args) {
        // Membuat objek dari kelas aritmatika3
        aritmatika3 calc = new aritmatika3();

        // Contoh penggunaan metode
        int a = 10;
        int b = 5;

        System.out.println("Penjumlahan: " + calc.penjumlahan(a, b));
        System.out.println("Pengurangan: " + calc.pengurangan(a, b));
        System.out.println("Perkalian: " + calc.perkalian(a, b));
        System.out.println("Pembagian: " + calc.pembagian(a, b));
        System.out.println("Pangkat: " + calc.pangkat(a, b));
    }
}

// Kelas aritmatika3
class aritmatika3 {

    // Method untuk penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
        return (double) a / b;
    }

    // Method untuk pangkat
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
        
    }
    }


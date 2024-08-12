/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab1osoall1;

/**
 *
 * @author user
 */
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
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    // Metode pangkat
    public int pangkat(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Eksponen tidak boleh negatif");
        }
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab15soall1;

/**
 * Kelas Bab15soall1 dengan berbagai metode operasi matematika.
 */
public class Bab15soall1 {

    // Method pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Method pembagian
    public float pembagian(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
        return a / b;
    }
    
    // Method perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }

    // Method utama untuk menguji metode Bab15soall1
    public static void main(String[] args) {
        // Membuat objek Bab15soall1
        Bab15soall1 obj = new Bab15soall1();
        
        // Menampilkan hasil pertambahan
        System.out.println("Pertambahan: " + obj.pertambahan(10, 20));
        
        // Menampilkan hasil pengurangan
        System.out.println("Pengurangan: " + obj.pengurangan(20, 10));
        
        // Menampilkan hasil pembagian
        try {
            System.out.println("Pembagian: " + obj.pembagian(20.0f, 5.0f));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        // Menampilkan hasil perkalian
        System.out.println("Perkalian: " + obj.perkalian(10.0f, 5.0f));
    }
}

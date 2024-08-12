/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soall2;

public class Bab10soall2 {

    // Class aritmatika
    static class aritmatika {
        // Method untuk pengurangan
        public int pengurangan(int bilangan1, int bilangan2) {
            return bilangan1 - bilangan2;
        }

        // Method untuk perkalian
        public int perkalian(int bilangan1, int bilangan2) {
            return bilangan1 * bilangan2;
        }

        // Method untuk pembagian
        public double pembagian(int bilangan1, int bilangan2) {
            if (bilangan2 != 0) {
                return (double) bilangan1 / bilangan2;
            } else {
                System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                return 0;
            }
        }

        // Method untuk pangkat
        public double pangkat(int bilangan1, int bilangan2) {
            return Math.pow(bilangan1, bilangan2);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Membuat objek dari class aritmatika
        aritmatika arit = new aritmatika();

        // Mendefinisikan bilangan-bilangan yang akan digunakan
        int bilangan1 = 10;
        int bilangan2 = 2;

        // Mengakses metode pengurangan
        int hasilPengurangan = arit.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        // Mengakses metode perkalian
        int hasilPerkalian = arit.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        // Mengakses metode pembagian
        double hasilPembagian = arit.pembagian(bilangan1, bilangan2);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);

        // Mengakses metode pangkat
        double hasilPangkat = arit.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + "^" + bilangan2 + " = " + hasilPangkat);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab10soal2;

/**
 *
 * @author user
 */

public class Bab10soal2 {

    class Aritmatika1 {
        public int pengurangan(int bilangan1, int bilangan2) {
            return bilangan1 - bilangan2;
        }

        public int perkalian(int bilangan1, int bilangan2) {
            return bilangan1 * bilangan2;
        }

        public double pembagian(int bilangan1, int bilangan2) {
            if (bilangan2 != 0) {
                return (double) bilangan1 / bilangan2;
            } else {
                System.out.println("Error: Pembagian dengan nol!");
                return 0;
            }
        }

        public double pangkat(int bilangan1, int bilangan2) {
            return Math.pow(bilangan1, bilangan2);
        }
    }

    public static void main(String[] args) {
        Bab10soal2 outer = new Bab10soal2();
        Aritmatika1 aritmatika = outer.new Aritmatika1();

        int bilangan1 = 5;
        int bilangan2 = 3;

        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Hasil Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Hasil Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        System.out.println("Hasil Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);

        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Hasil Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}

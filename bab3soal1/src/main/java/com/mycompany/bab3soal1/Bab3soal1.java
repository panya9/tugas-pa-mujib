/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab3soal1;

/**
 *
 * @author user
 */
public class Bab3soal1 {
    public static void main(String[] args) {
        int i = 1; // Inisialisasi variabel untuk baris

        while (i <= 5) { // Loop untuk setiap baris
            int j = 1; // Inisialisasi variabel untuk kolom
            
            while (j <= i) { // Loop untuk mencetak '*' pada setiap baris
                System.out.print("* ");
                j++; // Increment kolom
            }
            
            System.out.println(); // Pindah ke baris berikutnya
            i++; // Increment baris
        }
    }

}

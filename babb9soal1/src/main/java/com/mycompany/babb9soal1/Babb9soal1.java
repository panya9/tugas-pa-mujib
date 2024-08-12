/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.babb9soal1;

/**
 *
 * @author user
 */
public class Babb9soal1 {

    public static void main(String[] args) {
        int i = 1; // Inisialisasi variabel untuk loop luar
        while (i <= 5) { // Loop luar dengan kondisi
            int j = 1; // Inisialisasi variabel untuk loop dalam
            while (j <= i) { // Loop dalam dengan kondisi
                System.out.print("* ");
                j++; // Increment untuk loop dalam
            }
            System.out.println(); // Baris baru
            i++; // Increment untuk loop luar
        }
    }
}

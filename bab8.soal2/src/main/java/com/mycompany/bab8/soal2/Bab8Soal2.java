/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8.soal2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab8Soal2 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Tahun Akhir
        System.out.print("Tahun Akhir ? : ");
        int tahunAkhir = scanner.nextInt();

        // Input Tahun Awal
        System.out.print("Tahun Awal ? : ");
        int tahunAwal = scanner.nextInt();

        // Menampilkan hasil
        System.out.println("Hasilnya : ");
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }
    }

    
}

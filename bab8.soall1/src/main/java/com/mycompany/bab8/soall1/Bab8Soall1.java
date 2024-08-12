/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8.soall1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Bab8Soall1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Nilai Awal
        System.out.print("Nilai Awal ? : ");
        int nilaiAwal = scanner.nextInt();

        // Input Nilai Akhir
        System.out.print("Nilai Akhir ? : ");
        int nilaiAkhir = scanner.nextInt();

        // Menampilkan hasil
        System.out.println("Hasilnya : ");
        int count = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(count + ". " + i);
            count++;
        }
    }
}

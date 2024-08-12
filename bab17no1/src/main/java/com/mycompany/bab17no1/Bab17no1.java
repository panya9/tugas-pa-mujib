/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/
package com.mycompany.bab17no1;
import java.util.Scanner;

public class Bab17no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah kota yang akan dimasukkan
        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline yang tersisa setelah nextInt()

        // Membuat array untuk menyimpan nama kota
        String[] kota = new String[jumlahKota];

        // Memasukkan nama kota ke dalam array
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine();
        }

        // Menampilkan elemen array
        System.out.println("\nKota-kota yang dimasukkan:");
        for (int i = 0; i < kota.length; i++) {
            System.out.println(kota[i]);
        }

        // Menutup scanner
        scanner.close();
    }
}

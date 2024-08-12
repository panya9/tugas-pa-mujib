/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soall2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Bab9soall2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai awal dan nilai akhir
        System.out.print("Masukkan bilangan awal: ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Masukkan bilangan akhir: ");
        int nilaiAkhir = scanner.nextInt();
        
        System.out.print("Hasil deret bilangan: ");

        int current = nilaiAwal;
        boolean first = true;
        while (current <= nilaiAkhir) {
            if (first) {
                System.out.print(current);
                first = false;
            } else {
                System.out.print(", " + current);
            }
            current += 5;
        }

        scanner.close();
    }
}

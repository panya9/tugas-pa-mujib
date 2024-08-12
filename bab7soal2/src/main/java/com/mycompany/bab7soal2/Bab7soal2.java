/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Bab7soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN: ");
        int tahun = scanner.nextInt();

        scanner.nextLine();  // Consume newline left-over
        System.out.print("PILIH PEMINATAN (M untuk Mobile, W untuk Web, D untuk Data Science): ");
        char peminatan = scanner.nextLine().charAt(0);

        // Output berdasarkan peminatan
        System.out.println("Output:");
        switch (tahun) {
            case 3:
                switch (peminatan) {
                    case 'M':
                        System.out.println("PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA 2");
                        break;
                    case 'W':
                        System.out.println("PEMROGRAMAN WEB, FRAMEWORK WEB");
                        break;
                    case 'D':
                        System.out.println("DATA MINING, MACHINE LEARNING");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                        break;
                }
                break;
            default:
                System.out.println("Tahun tidak valid");
                break;
        }

        scanner.close();
    }
}

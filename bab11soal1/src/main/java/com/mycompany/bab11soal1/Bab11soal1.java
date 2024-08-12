/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal1;
import java.util.Scanner;

public class Bab11soal1 {

    // Inner class Karyawan
    static class Karyawan {
        private String idKaryawan;
        private String namaKaryawan;
        private String golongan;
        private String jabatan;
        private double gajiPokok;

        public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
            this.idKaryawan = idKaryawan;
            this.namaKaryawan = namaKaryawan;
            this.golongan = golongan;
            this.jabatan = jabatan;
            this.gajiPokok = gajiPokok;
        }

        public void tampilkanDataKaryawan() {
            System.out.println("ID Karyawan: " + idKaryawan);
            System.out.println("Nama Karyawan: " + namaKaryawan);
            System.out.println("Golongan: " + golongan);
            System.out.println("Jabatan: " + jabatan);
            System.out.println("Gaji Pokok: " + gajiPokok);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan Golongan: ");
        String golongan = input.nextLine();

        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = input.nextDouble();

        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);

        System.out.println("\nData Karyawan:");
        karyawan.tampilkanDataKaryawan();
    }
}

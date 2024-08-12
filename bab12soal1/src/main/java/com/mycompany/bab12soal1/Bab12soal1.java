/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab12soal1;

// File: Bab12soal1.java
public class Bab12soal1 {

    // Kelas Pegawai
    class Pegawai {
        // Atribut dasar pegawai
        float gaji;
        float tunjanganMakan;
        float tunjanganTransport;

        // Konstruktor untuk inisialisasi pegawai
        public Pegawai(float gaji, float tunjanganMakan, float tunjanganTransport) {
            this.gaji = gaji;
            this.tunjanganMakan = tunjanganMakan;
            this.tunjanganTransport = tunjanganTransport;
        }

        // Method untuk menghitung gaji total
        public float hitungGajiTotal() {
            return gaji + tunjanganMakan + tunjanganTransport;
        }
    }

    // Kelas SystemAnalyst
    class SystemAnalyst extends Pegawai {
        // Atribut tambahan untuk System Analyst
        int bonus;

        // Konstruktor untuk inisialisasi System Analyst
        public SystemAnalyst(float gaji, float tunjanganMakan, float tunjanganTransport, int bonus) {
            super(gaji, tunjanganMakan, tunjanganTransport);
            this.bonus = bonus;
        }

        // Method untuk menghitung gaji total dengan bonus
        @Override
        public float hitungGajiTotal() {
            return super.hitungGajiTotal() + bonus;
        }
    }

    public static void main(String[] args) {
        Bab12soal1 program = new Bab12soal1();

        // Inisialisasi System Analyst dengan gaji, tunjangan makan, tunjangan transport, dan bonus
        SystemAnalyst sa = program.new SystemAnalyst(4000000, 100000, 500000, 1000000);

        // Menampilkan hasil
        System.out.println("Gaji System Analyst: " + sa.gaji);
        System.out.println("Bonus: " + sa.bonus);
        System.out.println("Tunjangan Makan: " + sa.tunjanganMakan);
        System.out.println("Tunjangan Transport: " + sa.tunjanganTransport);
        System.out.println("Gaji Total: " + sa.hitungGajiTotal());
    }
}

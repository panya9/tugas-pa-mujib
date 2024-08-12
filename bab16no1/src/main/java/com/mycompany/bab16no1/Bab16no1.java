/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab16no1;

/**
 *
 * @author user
 */
public class Bab16no1 {

    // Kelas abstrak untuk operasi aritmatika
    abstract class ArithmeticOperation {
        protected double a;
        protected double b;

        public ArithmeticOperation(double a, double b) {
            this.a = a;
            this.b = b;
        }

        protected abstract double add();
        protected abstract double subtract();
        protected abstract double multiply();
        protected abstract double divide();
    }

    // Implementasi operasi aritmatika
    class ArithmeticImplementation extends ArithmeticOperation {

        public ArithmeticImplementation(double a, double b) {
            super(a, b);
        }

        @Override
        protected double add() {
            return a + b;
        }

        @Override
        protected double subtract() {
            return a - b;
        }

        @Override
        protected double multiply() {
            return a * b;
        }

        @Override
        protected double divide() {
            if (b == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
            }
            return a / b;
        }
    }

    // Kelas utama untuk menjalankan program
    public class Main {
        public void run() {
            double A = 9.5;
            double B = 2.5;

            ArithmeticImplementation arithmetic = new ArithmeticImplementation(A, B);

            System.out.println("Penjumlahan: " + arithmetic.add());
            System.out.println("Pengurangan: " + arithmetic.subtract());
            System.out.println("Perkalian: " + arithmetic.multiply());
            System.out.println("Pembagian: " + arithmetic.divide());
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Bab16no1 program = new Bab16no1();
        Bab16no1.Main mainProgram = program.new Main();
        mainProgram.run();
    }
}

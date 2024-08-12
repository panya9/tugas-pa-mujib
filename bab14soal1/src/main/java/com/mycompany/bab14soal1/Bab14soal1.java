/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab14soal1;

// Kelas abstrak
abstract class AbstrakHewan {
    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void suara();
    
    // Metode konkrit yang dapat digunakan langsung atau di-override oleh kelas turunan
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

// Kelas turunan pertama
class Kucing extends AbstrakHewan {
    // Implementasi metode abstrak dari parent class
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}

// Kelas turunan kedua
class Anjing extends AbstrakHewan {
    // Implementasi metode abstrak dari parent class
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}

// Kelas utama untuk menjalankan program
public class Bab14soal1 {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        AbstrakHewan kucing = new Kucing();
        AbstrakHewan anjing = new Anjing();
        
        // Memanggil metode dari objek Kucing
        System.out.println("Kucing:");
        kucing.suara();  // Output: Meow
        kucing.suara2(); // Output: Ini method konkrit dari parent class
        
        // Memanggil metode dari objek Anjing
        System.out.println("Anjing:");
        anjing.suara();  // Output: Woof
        anjing.suara2(); // Output: Ini method konkrit dari parent class
    }
}

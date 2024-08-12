/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab14soal2;

// Kelas abstrak
abstract class AbstrakHewan {
    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void suara();
    
    // Metode konkrit yang dapat digunakan langsung atau di-override oleh kelas turunan
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

// Kelas turunan Kucing
class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}

// Kelas turunan Anjing
class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}

// Kelas turunan Burung
class Burung extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Mencicit");
    }
}

// Kelas utama untuk menjalankan program
public class Bab14soal2 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Burung
        AbstrakHewan burung = new Burung();
        
        // Memanggil metode dari objek Burung
        System.out.print("Suara Burung ");
        burung.suara();  // Output: Mencicit
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17no2;

/**
 *
 * @author user
 */
public class Bab17no2 {

    public static void main(String[] args) {
        // Membuat array multidimensi untuk menyimpan nama negara dan ibu kotanya
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses array dan menampilkan nama negara beserta ibukotanya
        for (String[] negaraDanIbukota1 : negaraDanIbukota) {
            System.out.println("Ibukota " + negaraDanIbukota1[0] + " adalah " + negaraDanIbukota1[1]);
        }
    }
}

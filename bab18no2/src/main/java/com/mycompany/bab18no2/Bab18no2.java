/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18no2;

/**
 *
 * @author user
 */
public class Bab18no2{ 
    public static void main(String args[]) { 
        try { 
            // Kode di bawah ini tidak menyebabkan exception
            Float data = 500f / 15; 
            System.out.println(data); 
        } 
        catch(NullPointerException e) { 
            System.out.println(e); 
        } 
        finally { 
            System.out.println("Blok finally akan selalu di eksekusi"); 
        }
    }
}
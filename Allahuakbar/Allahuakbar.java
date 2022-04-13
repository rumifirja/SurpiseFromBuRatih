/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Allahuakbar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Allahuakbar {

    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        a = input.nextInt();

        if (a % 2 == 1) {
            System.out.println(a + " adalah GANJIL");
        }else{
            System.out.println(a + " adalah GENAP");
        }
    }
}

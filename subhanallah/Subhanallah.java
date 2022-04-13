/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subhanallah;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Subhanallah {

    public static void main(String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama = ");
        a = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan angka kedua = ");
        b = input2.nextInt();
        
        if (a > b) {
            System.out.println(a+" > "+b);
        } else {
            System.out.println(b+" > "+a);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Innalillahi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Innalillahi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n = ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("Total = " + " 1 + .... + " + n + " = " + total);
    }
}

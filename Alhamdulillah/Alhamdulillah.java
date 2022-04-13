/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alhamdulillah;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Alhamdulillah {

    public static void main(String[] args) {
                      
        Scanner input = new Scanner(System.in);
        int angka = a, dua, tiga, empat, lima, enam;
        
        System.out.println("Masukan angka ke-1");
        a = input.nextInt();
        
        System.out.println("Masukan angka ke-2");
        dua = input.nextInt();
        
        System.out.println("Masukan angka ke-3");
        tiga = input.nextInt();
        
        System.out.println("Masukan angka ke-4");
        empat = input.nextInt();
        
        System.out.println("Masukan angka ke-5");
        lima = input.nextInt();
        
        System.out.println("Masukan angka ke-6");
        enam = input.nextInt();
        
        System.out.println("yang termasuk bilangan GENAP = ");
        for (int a = 0; a < 5; a++){
            if (angka % 2 == 0){
                System.out.println(input + ", ");
            }
        }
        System.out.println("yang termasuk bilangan GANJIL = ");
        for (int b = 0; b<5; b++)
            if (angka % 2 == 1){
                System.out.println(input + ", ");
            }
    }

}

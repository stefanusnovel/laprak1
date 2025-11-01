/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum5;

/**
 *
 * @author novel
 */
import java.util.Scanner;
public class Praktikum5 {

    public static void main(String[] args) {
        Scanner penghitung = new Scanner(System.in);
        int bil;
        System.out.print("Masukan bilangan secara acak : ");
        bil = penghitung.nextInt();
        if (bil % 2 == 0 ){
            System.out.println("Bilangan "+bil+" adalah bilangan bulat");
        } else {
            System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
        }
    }
}

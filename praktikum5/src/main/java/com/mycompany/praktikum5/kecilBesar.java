/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author novel
 */
import java.util.Scanner;
public class kecilBesar {
    public static void main(String[] args) {
        Scanner penentu = new Scanner(System.in);
        double bil1, bil2;
        System.out.print("Masukan bilangan pertama : ");
        bil1 = penentu.nextDouble();
        System.out.print("Masukan bilangan kedua   : ");
        bil2 = penentu.nextDouble();
        if (bil1 >= bil2){
            System.out.println("Bilangan "+bil1+" lebih besar dari bilangan "+bil2+"");
        }if (bil1 <= bil2){
            System.out.println("Bilangan "+bil1+" lebih kecil dari bilangan "+bil2+"");
        }else{
            System.out.println("Bilangan "+bil1+" tidak lebih besar dan lebih kecil dari bilangan "+bil2+"");
        }
    }
}

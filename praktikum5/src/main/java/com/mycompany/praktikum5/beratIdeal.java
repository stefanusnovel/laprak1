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
public class beratIdeal {
    public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);
        int tinggi, berat;
        System.out.print("Masukan tinggi badan : ");
        tinggi = bmi.nextInt();
        System.out.print("Masukan berat badan : ");
        berat = bmi.nextInt();
        if ((tinggi-berat)<90){
            System.out.println("Anda terlalu gemuk");
        }if ((tinggi-berat)>110){
            System.out.println("Anda terlalu kurus");
        }else {
            System.out.println("Berat badan anda ideal");
        }
    }
}

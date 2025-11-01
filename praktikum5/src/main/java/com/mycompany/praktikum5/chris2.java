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
public class chris2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukkan angka pertama : ");
        int bil2 = scanner.nextInt();
        
        System.out.print("Masukkan angka pertama : ");
        int bil3 = scanner.nextInt();
        
        System.out.println("______________________________");
        int pertama, kedua, ketiga;
        
        if(bil1 < bil2 && bil1 < bil3){
            pertama = bil1;
            if(bil2 < bil3){
                kedua = bil2;
                ketiga = bil3;
            }
            else{
                kedua = bil3;
                ketiga= bil2;
            }
        }
        else if(bil2 < bil1 && bil2 < bil3){
            pertama = bil2;
            if(bil1 < bil3){
                kedua = bil1;
                ketiga = bil3;
            }
            else{
                kedua = bil3;
                ketiga= bil1;
            }
        }
        else{
            pertama = bil3;
            if(bil1 < bil2){
                kedua = bil1;
                ketiga = bil2;
            }
            else{
                kedua = bil2;
                ketiga= bil1;
            }
        }
        System.out.println("Urutannya adalah :");
        System.out.println(pertama + "," + kedua + "'," + ketiga);
    }
}

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
public class urutan {
    public static void main(String[] args) {
        Scanner pengurut = new Scanner(System.in);
        int bil1, bil2, bil3, ke1, ke2, ke3;
        System.out.print("Masukan bilangan pertama : ");
        bil1 = pengurut.nextInt();
        System.out.print("Masukan bilangan kedua   : ");
        bil2 = pengurut.nextInt();
        System.out.print("Masukan bilangan ketiga  : ");
        bil3 = pengurut.nextInt();
        
        if(bil1 < bil2 && bil1 < bil3){
            ke1 = bil1;
            if(bil2 < bil3){
                ke2 = bil2;
                ke3 = bil3;
            }
            else{
                ke2 = bil3;
                ke3= bil2;
            }
        }
        else if(bil2 < bil1 && bil2 < bil3){
            ke1 = bil2;
            if(bil1 < bil3){
                ke2 = bil1;
                ke3 = bil3;
            }
            else{
                ke2 = bil3;
                ke3= bil1;
            }
        }
        else{
            ke1 = bil3;
            if(bil1 < bil2){
                ke2 = bil1;
                ke3 = bil2;
            }
            else{
                ke2 = bil2;
                ke3= bil1;
            }
        }
        
        System.out.println("Urutan dari kecil kebesar adalah : ");
        System.out.println(""+ke1+", "+ke2+" , "+ke3+"");
    }
}

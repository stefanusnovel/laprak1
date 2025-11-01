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
public class nilaiFinal {
    public static void main(String[] args) {
        Scanner guru = new Scanner(System.in);
        double us1, us2, uas, nilaiFinal;
        System.out.print("Masukan nilai ujian sisipan 1 : ");
        us1 = guru.nextDouble();
        System.out.print("Masukan nilai ujian sisipan 2 : ");
        us2 = guru.nextDouble();
        System.out.print("Masukan nilai ujian akhir semester : ");
        uas = guru.nextDouble();
        nilaiFinal = (0.30 * us1)+(0.30 * us2)+(0.40 * uas);
        if (nilaiFinal >= 80){
            System.out.println("Nilai anda adalah A");
        }else if ((nilaiFinal >= 65)&&(nilaiFinal < 80)){
            System.out.println("Nilai anda adalah B");
        }else if ((nilaiFinal >= 55)&&(nilaiFinal < 65)){
            System.out.println("Nilai anda adalah C");
        }else if ((nilaiFinal >= 50)&&(nilaiFinal < 55)){
            System.out.println("Nilai anda adalah D"); 
        }else {
            System.out.println("Nilai anda adalah E");
        }
    }
}

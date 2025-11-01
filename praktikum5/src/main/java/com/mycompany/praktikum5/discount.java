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
public class discount {
    public static void main(String[] args) {
        Scanner kasir = new Scanner(System.in);
        int banyakBarang, hargaBarang, discount, hargaDiscount;
        System.out.print("Masukan jumlah barang : ");
        banyakBarang = kasir.nextInt();
        hargaBarang = banyakBarang * 100000;
        discount = hargaBarang * 10/100;
        hargaDiscount = hargaBarang-discount;
        if (hargaBarang < 1000000){
            System.out.println("Barang yang anda beli kurang dari Rp 1.000.000 maka ambil lebih banyak barang");
        }if (hargaBarang >= 1000000) {
            System.out.println("Barang yang anda beli mendapat discount Rp "+discount+" dan harganya menjadi Rp "+hargaDiscount+" ");
        }
    }
}

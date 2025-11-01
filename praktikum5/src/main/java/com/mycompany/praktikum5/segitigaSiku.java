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
public class segitigaSiku {
    public static void main(String[] args) {
        Scanner segitiga = new Scanner(System.in);
        double a, b, c, sisi, sisi2;
        System.out.print("Masukan sisi a : ");
        a = segitiga.nextDouble();
        System.out.print("Masukan sisi b : ");
        b = segitiga.nextDouble();
        System.out.print("Masukan siis c : ");
        c = segitiga.nextDouble();
        sisi = Math.pow(a,2)+ Math.pow(b,2);
        sisi2 = Math.pow(c,2);
        if (sisi==sisi2){
            System.out.println("segitiga siku-siku");
        }else{
            System.out.println("segitiga sembarang");
        }
    }
}

package com.company;

import java.util.Scanner;

public class LetraB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dobro;
        double numero;
        System.out.println("Informe o numero:");
        numero = sc.nextDouble();
        dobro = numero*2;
        System.out.println("O dobro é" + dobro);
    }
}
